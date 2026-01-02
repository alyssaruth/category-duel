package com.github.alyssaruth

data class TrioTemplate(val three: CategoryId, val two: CategoryId, val one: CategoryId) {
    fun contains(categoryId: CategoryId) = three == categoryId || two == categoryId || one == categoryId
}
