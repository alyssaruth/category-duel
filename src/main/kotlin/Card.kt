package com.github.alyssaruth

data class Card(val top: TestCategory, val middle: TestCategory, val bottom: TestCategory) {
    fun contains(testCategory: TestCategory) = top == testCategory || middle == testCategory || bottom == testCategory
}
