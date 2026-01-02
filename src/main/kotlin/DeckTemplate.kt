package com.github.alyssaruth

val deckTemplate =
    listOf(
        // As - 5-2
        TrioTemplate(CategoryId.A, CategoryId.B, CategoryId.C),
        TrioTemplate(CategoryId.A, CategoryId.C, CategoryId.F),
        TrioTemplate(CategoryId.A, CategoryId.F, CategoryId.D),
        TrioTemplate(CategoryId.A, CategoryId.D, CategoryId.E),
        TrioTemplate(CategoryId.A, CategoryId.E, CategoryId.B),
        TrioTemplate(CategoryId.A, CategoryId.G, CategoryId.H),
        TrioTemplate(CategoryId.A, CategoryId.H, CategoryId.G),

        // Bs - 3-2-2
        TrioTemplate(CategoryId.B, CategoryId.A, CategoryId.D),
        TrioTemplate(CategoryId.B, CategoryId.D, CategoryId.G),
        TrioTemplate(CategoryId.B, CategoryId.G, CategoryId.A),
        TrioTemplate(CategoryId.B, CategoryId.F, CategoryId.H),
        TrioTemplate(CategoryId.B, CategoryId.H, CategoryId.F),
        TrioTemplate(CategoryId.B, CategoryId.C, CategoryId.E),
        TrioTemplate(CategoryId.B, CategoryId.E, CategoryId.C),

        // Cs - 5-2
        TrioTemplate(CategoryId.C, CategoryId.A, CategoryId.E),
        TrioTemplate(CategoryId.C, CategoryId.E, CategoryId.H),
        TrioTemplate(CategoryId.C, CategoryId.H, CategoryId.D),
        TrioTemplate(CategoryId.C, CategoryId.D, CategoryId.F),
        TrioTemplate(CategoryId.C, CategoryId.F, CategoryId.A),
        TrioTemplate(CategoryId.C, CategoryId.G, CategoryId.B),
        TrioTemplate(CategoryId.C, CategoryId.B, CategoryId.G),

        // Ds - 5-2
        TrioTemplate(CategoryId.D, CategoryId.A, CategoryId.G),
        TrioTemplate(CategoryId.D, CategoryId.G, CategoryId.C),
        TrioTemplate(CategoryId.D, CategoryId.C, CategoryId.H),
        TrioTemplate(CategoryId.D, CategoryId.H, CategoryId.E),
        TrioTemplate(CategoryId.D, CategoryId.E, CategoryId.A),
        TrioTemplate(CategoryId.D, CategoryId.F, CategoryId.B),
        TrioTemplate(CategoryId.D, CategoryId.B, CategoryId.F),

        // Es - 7-0
        TrioTemplate(CategoryId.E, CategoryId.A, CategoryId.F),
        TrioTemplate(CategoryId.E, CategoryId.F, CategoryId.G),
        TrioTemplate(CategoryId.E, CategoryId.G, CategoryId.D),
        TrioTemplate(CategoryId.E, CategoryId.D, CategoryId.B),
        TrioTemplate(CategoryId.E, CategoryId.B, CategoryId.H),
        TrioTemplate(CategoryId.E, CategoryId.H, CategoryId.C),
        TrioTemplate(CategoryId.E, CategoryId.C, CategoryId.A),

        // Fs - 4-3
        TrioTemplate(CategoryId.F, CategoryId.G, CategoryId.E),
        TrioTemplate(CategoryId.F, CategoryId.E, CategoryId.D),
        TrioTemplate(CategoryId.F, CategoryId.D, CategoryId.C),
        TrioTemplate(CategoryId.F, CategoryId.C, CategoryId.G),
        TrioTemplate(CategoryId.F, CategoryId.A, CategoryId.H),
        TrioTemplate(CategoryId.F, CategoryId.H, CategoryId.B),
        TrioTemplate(CategoryId.F, CategoryId.B, CategoryId.A),

        // Gs - 7-0
        TrioTemplate(CategoryId.G, CategoryId.A, CategoryId.B),
        TrioTemplate(CategoryId.G, CategoryId.B, CategoryId.E),
        TrioTemplate(CategoryId.G, CategoryId.E, CategoryId.F),
        TrioTemplate(CategoryId.G, CategoryId.F, CategoryId.C),
        TrioTemplate(CategoryId.G, CategoryId.C, CategoryId.D),
        TrioTemplate(CategoryId.G, CategoryId.D, CategoryId.H),
        TrioTemplate(CategoryId.G, CategoryId.H, CategoryId.A),

        // Hs - 4-3
        TrioTemplate(CategoryId.H, CategoryId.A, CategoryId.C),
        TrioTemplate(CategoryId.H, CategoryId.C, CategoryId.B),
        TrioTemplate(CategoryId.H, CategoryId.B, CategoryId.D),
        TrioTemplate(CategoryId.H, CategoryId.D, CategoryId.A),
        TrioTemplate(CategoryId.H, CategoryId.E, CategoryId.G),
        TrioTemplate(CategoryId.H, CategoryId.G, CategoryId.F),
        TrioTemplate(CategoryId.H, CategoryId.F, CategoryId.E),
    )