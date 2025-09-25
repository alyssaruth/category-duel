import com.github.alyssaruth.Category
import com.github.alyssaruth.deck
import io.kotest.assertions.forEachAsClue
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

class DeckTest {
    @Test
    fun `Categories should be distinct on all cards`() {
        deck.forEachAsClue { (top, middle, bottom) ->
            top shouldNotBe middle
            middle shouldNotBe bottom
            top shouldNotBe bottom
        }
    }

    @Test
    fun `Within each top category, every other category should appear as middle and bottom once`() {
        Category.entries.forEachAsClue { category ->
            val cards = deck.filter { it.top == category }
            val remainingCategories = Category.entries.filterNot { it == category }

            cards.map { it.middle }.shouldContainExactlyInAnyOrder(remainingCategories)
            cards.map { it.bottom }.shouldContainExactlyInAnyOrder(remainingCategories)
        }
    }

    @Test
    fun `Within each middle category, every other category should appear as top and bottom once`() {
        Category.entries.forEachAsClue { category ->
            val cards = deck.filter { it.middle == category }
            val remainingCategories = Category.entries.filterNot { it == category }

            cards.map { it.top }.shouldContainExactlyInAnyOrder(remainingCategories)
            cards.map { it.bottom }.shouldContainExactlyInAnyOrder(remainingCategories)
        }
    }

    @Test
    fun `Within each bottom category, every other category should appear as top and middle once`() {
        Category.entries.forEachAsClue { category ->
            val cards = deck.filter { it.bottom == category }
            val remainingCategories = Category.entries.filterNot { it == category }

            cards.map { it.top }.shouldContainExactlyInAnyOrder(remainingCategories)
            cards.map { it.middle }.shouldContainExactlyInAnyOrder(remainingCategories)
        }
    }

    @Test
    fun `Total counts for each category should be the same as each other`() {
        Category.entries.forEachAsClue { category ->
            deck.count { it.top == category } shouldBe 7
            deck.count { it.middle == category } shouldBe 7
            deck.count { it.bottom == category } shouldBe 7
        }
    }

    @Test
    fun `Removing one arbitrary category should leave a valid deck`() {
        Category.entries.forEachAsClue { categoryToRemove ->
            val partialDeck = deck.filterNot { it.contains(categoryToRemove) }
            println(partialDeck.size)

            val remainingCategories = Category.entries.filterNot { it == categoryToRemove }
            remainingCategories.forEach { category ->
                partialDeck.count { it.top == category } shouldBe 5
                partialDeck.count { it.middle == category } shouldBe 5
                partialDeck.count { it.bottom == category } shouldBe 5
            }
        }
    }
}