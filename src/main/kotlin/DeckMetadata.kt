package com.github.alyssaruth

data class DeckMetadata(
    val categoryMap: Map<CategoryId, CategoryDetails>
) {
    constructor(a: CategoryDetails,
                b: CategoryDetails,
                c: CategoryDetails,
                d: CategoryDetails,
                e: CategoryDetails,
                f: CategoryDetails,
                g: CategoryDetails,
                h: CategoryDetails)
        : this(mapOf(CategoryId.A to a, CategoryId.B to b, CategoryId.C to c, CategoryId.D to d, CategoryId.E to e, CategoryId.F to f, CategoryId.G to g, CategoryId.H to h))

    fun validate() {
        categoryMap.values.forEach { it.validate() }
    }

    fun makeTrioCard(three: CategoryId, two: CategoryId, one: CategoryId): Pair<TrioCard, DeckMetadata> {
        val (threeChar, threeCat) = categoryMap.getValue(three).takeThree()
        val (twoChar, twoCat) = categoryMap.getValue(two).takeTwo()
        val (oneChar, oneCat) = categoryMap.getValue(one).takeOne()

        val newMap = categoryMap + (three to threeCat) + (two to twoCat) + (one to oneCat)

        return TrioCard(threeChar, twoChar, oneChar) to DeckMetadata(newMap)
    }
}
