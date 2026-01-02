package com.github.alyssaruth.burlings

import com.github.alyssaruth.CategoryDetails
import com.github.alyssaruth.DISCWORLD
import com.github.alyssaruth.FUTURAMA
import com.github.alyssaruth.TASKMASTER
import com.github.alyssaruth.makeDeck

private val discworld = CategoryDetails(DISCWORLD,
    listOf("Mustrum Ridcully", "Lord Vetinari", "Sam Vimes", "Moist Von Lipwig", "Death", "Susan", "Nanny Ogg"),
    listOf("The Luggage", "Rincewind", "Tiffany Aching", "Detritus", "Nobby Nobbs", "Angua", "Cheery Littlebottom"),
    listOf("Cohen the Barbarian", "Otto Chriek", "Lady Sybil", "C.M.O.T. Dibbler", "Daft Wullie", "Igor", "Death of Rats")
)

private val taskmaster = CategoryDetails(TASKMASTER,
    listOf("James Acaster", "Liza Tarbuck", "Bob Mortimer", "Fern Brady", "Mike Wozniak", "Rose Matafeo", "Kerry Godliman"),
    listOf("Richard Osman", "Frank Skinner", "Mel Gedroic", "Romesh Ranganathan", "Fred the Swede", "Sam Campbell", "Ed Gamble"),
    listOf("Nish Kumar", "David Baddiel", "Paul Chowdhry", "Charlotte Ritchie", "Joe Wilkinson", "Tim Key", "Mark Watson"),
)

private val futurama = CategoryDetails(FUTURAMA,
    listOf("Fry", "Leela", "Zoidberg", "Amy Wong", "Hermes", "Zapp Brannigan", "Kiff"),
    listOf("Scruffy", "Nixon", "Calculon", "Robot Santa", "Lrrr", "Nibbler", "Mom"),
    listOf("Hedonismbot", "Beelzebot", "Cubert", "Wernstrom", "LaBarbara", "Donbot", "Seymour"),
)

val BURLINGS = makeDeck(discworld, taskmaster, futurama, discworld, discworld, discworld, discworld, discworld)
