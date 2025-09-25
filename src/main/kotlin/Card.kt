package com.github.alyssaruth

data class Card(val top: Category, val middle: Category, val bottom: Category) {
    fun contains(category: Category) = top == category || middle == category || bottom == category
}
