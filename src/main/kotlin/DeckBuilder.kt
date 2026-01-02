package com.github.alyssaruth

data class DeckConstructionState(val metadata: DeckMetadata, val cards: List<TrioCard>)

fun makeDeck(
    a: CategoryDetails,
    b: CategoryDetails,
    c: CategoryDetails,
    d: CategoryDetails,
    e: CategoryDetails,
    f: CategoryDetails,
    g: CategoryDetails,
    h: CategoryDetails
): List<TrioCard> {
    val metadata = DeckMetadata(a, b, c, d, e, f, g, h)
    metadata.validate()

    val state = DeckConstructionState(metadata, emptyList())

    val result = deckTemplate.fold(state) { currentState, (three, two, one) ->
        val (card, metadata) = state.metadata.makeTrioCard(three, two, one)
        currentState.copy(metadata = metadata, cards = currentState.cards + card)
    }

    return result.cards
}