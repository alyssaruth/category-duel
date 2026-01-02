package com.github.alyssaruth

data class CategoryDetails(val category: Category, val threes: List<String>, val twos: List<String>, val ones: List<String>) {
    fun validate() {
        if (threes.size != 7) {
            throw IllegalArgumentException("Invalid number of threes passed for ${category.name}: ${threes.size}")
        }

        if (twos.size != 7) {
            throw IllegalArgumentException("Invalid number of twos passed for ${category.name}: ${twos.size}")
        }

        if (ones.size != 7) {
            throw IllegalArgumentException("Invalid number of ones passed for ${category.name}: ${ones.size}")
        }
    }

    fun takeThree() = Character(threes.first(), category) to this.copy(threes = threes.drop(1))

    fun takeTwo() = Character(twos.first(), category) to this.copy(twos = twos.drop(1))

    fun takeOne() = Character(ones.first(), category) to this.copy(ones = ones.drop(1))
}
