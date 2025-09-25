package com.github.alyssaruth

val deck =
    listOf(
        // As - 5-2
        Card(Category.A, Category.B, Category.C),
        Card(Category.A, Category.C, Category.F),
        Card(Category.A, Category.F, Category.D),
        Card(Category.A, Category.D, Category.E),
        Card(Category.A, Category.E, Category.B),
        Card(Category.A, Category.G, Category.H),
        Card(Category.A, Category.H, Category.G),

        // Bs - 3-2-2
        Card(Category.B, Category.A, Category.D),
        Card(Category.B, Category.D, Category.G),
        Card(Category.B, Category.G, Category.A),
        Card(Category.B, Category.F, Category.H),
        Card(Category.B, Category.H, Category.F),
        Card(Category.B, Category.C, Category.E),
        Card(Category.B, Category.E, Category.C),

        // Cs - 5-2
        Card(Category.C, Category.A, Category.E),
        Card(Category.C, Category.E, Category.H),
        Card(Category.C, Category.H, Category.D),
        Card(Category.C, Category.D, Category.F),
        Card(Category.C, Category.F, Category.A),
        Card(Category.C, Category.G, Category.B),
        Card(Category.C, Category.B, Category.G),

        // Ds - 5-2
        Card(Category.D, Category.A, Category.G),
        Card(Category.D, Category.G, Category.C),
        Card(Category.D, Category.C, Category.H),
        Card(Category.D, Category.H, Category.E),
        Card(Category.D, Category.E, Category.A),
        Card(Category.D, Category.F, Category.B),
        Card(Category.D, Category.B, Category.F),

        // Es - 7-0
        Card(Category.E, Category.A, Category.F),
        Card(Category.E, Category.F, Category.G),
        Card(Category.E, Category.G, Category.D),
        Card(Category.E, Category.D, Category.B),
        Card(Category.E, Category.B, Category.H),
        Card(Category.E, Category.H, Category.C),
        Card(Category.E, Category.C, Category.A),

        // Fs - 4-3
        Card(Category.F, Category.G, Category.E),
        Card(Category.F, Category.E, Category.D),
        Card(Category.F, Category.D, Category.C),
        Card(Category.F, Category.C, Category.G),
        Card(Category.F, Category.A, Category.H),
        Card(Category.F, Category.H, Category.B),
        Card(Category.F, Category.B, Category.A),

        // Gs - 7-0
        Card(Category.G, Category.A, Category.B),
        Card(Category.G, Category.B, Category.E),
        Card(Category.G, Category.E, Category.F),
        Card(Category.G, Category.F, Category.C),
        Card(Category.G, Category.C, Category.D),
        Card(Category.G, Category.D, Category.H),
        Card(Category.G, Category.H, Category.A),

        // Hs - 4-3
        Card(Category.H, Category.A, Category.C),
        Card(Category.H, Category.C, Category.B),
        Card(Category.H, Category.B, Category.D),
        Card(Category.H, Category.D, Category.A),
        Card(Category.H, Category.E, Category.G),
        Card(Category.H, Category.G, Category.F),
        Card(Category.H, Category.F, Category.E),
    )