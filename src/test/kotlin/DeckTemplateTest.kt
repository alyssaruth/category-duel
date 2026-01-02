import com.github.alyssaruth.CategoryId
import com.github.alyssaruth.deckTemplate
import io.kotest.assertions.forEachAsClue
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

class DeckTemplateTest {
    @Test
    fun `Categories should be distinct on all cards`() {
        deckTemplate.forEachAsClue { (top, middle, bottom) ->
            top shouldNotBe middle
            middle shouldNotBe bottom
            top shouldNotBe bottom
        }
    }

    @Test
    fun `Within each top category, every other category should appear as middle and bottom once`() {
        CategoryId.entries.forEachAsClue { category ->
            val cards = deckTemplate.filter { it.three == category }
            val remainingCategories = CategoryId.entries.filterNot { it == category }

            cards.map { it.two }.shouldContainExactlyInAnyOrder(remainingCategories)
            cards.map { it.one }.shouldContainExactlyInAnyOrder(remainingCategories)
        }
    }

    @Test
    fun `Within each middle category, every other category should appear as top and bottom once`() {
        CategoryId.entries.forEachAsClue { category ->
            val cards = deckTemplate.filter { it.two == category }
            val remainingCategories = CategoryId.entries.filterNot { it == category }

            cards.map { it.three }.shouldContainExactlyInAnyOrder(remainingCategories)
            cards.map { it.one }.shouldContainExactlyInAnyOrder(remainingCategories)
        }
    }

    @Test
    fun `Within each bottom category, every other category should appear as top and middle once`() {
        CategoryId.entries.forEachAsClue { category ->
            val cards = deckTemplate.filter { it.one == category }
            val remainingCategories = CategoryId.entries.filterNot { it == category }

            cards.map { it.three }.shouldContainExactlyInAnyOrder(remainingCategories)
            cards.map { it.two }.shouldContainExactlyInAnyOrder(remainingCategories)
        }
    }

    @Test
    fun `Total counts for each category should be the same as each other`() {
        CategoryId.entries.forEachAsClue { category ->
            deckTemplate.count { it.three == category } shouldBe 7
            deckTemplate.count { it.two == category } shouldBe 7
            deckTemplate.count { it.one == category } shouldBe 7
        }
    }

    @Test
    fun `Removing one arbitrary category should leave a valid deck`() {
        CategoryId.entries.forEachAsClue { categoryToRemove ->
            val partialDeck = deckTemplate.filterNot { it.contains(categoryToRemove) }
            println(partialDeck.size)

            val remainingCategories = CategoryId.entries.filterNot { it == categoryToRemove }
            remainingCategories.forEach { category ->
                partialDeck.count { it.three == category } shouldBe 5
                partialDeck.count { it.two == category } shouldBe 5
                partialDeck.count { it.one == category } shouldBe 5
            }
        }
    }
}