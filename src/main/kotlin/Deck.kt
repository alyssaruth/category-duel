package com.github.alyssaruth

val deck =
    listOf(
        // As - 5-2
        Card(TestCategory.A, TestCategory.B, TestCategory.C),
        Card(TestCategory.A, TestCategory.C, TestCategory.F),
        Card(TestCategory.A, TestCategory.F, TestCategory.D),
        Card(TestCategory.A, TestCategory.D, TestCategory.E),
        Card(TestCategory.A, TestCategory.E, TestCategory.B),
        Card(TestCategory.A, TestCategory.G, TestCategory.H),
        Card(TestCategory.A, TestCategory.H, TestCategory.G),

        // Bs - 3-2-2
        Card(TestCategory.B, TestCategory.A, TestCategory.D),
        Card(TestCategory.B, TestCategory.D, TestCategory.G),
        Card(TestCategory.B, TestCategory.G, TestCategory.A),
        Card(TestCategory.B, TestCategory.F, TestCategory.H),
        Card(TestCategory.B, TestCategory.H, TestCategory.F),
        Card(TestCategory.B, TestCategory.C, TestCategory.E),
        Card(TestCategory.B, TestCategory.E, TestCategory.C),

        // Cs - 5-2
        Card(TestCategory.C, TestCategory.A, TestCategory.E),
        Card(TestCategory.C, TestCategory.E, TestCategory.H),
        Card(TestCategory.C, TestCategory.H, TestCategory.D),
        Card(TestCategory.C, TestCategory.D, TestCategory.F),
        Card(TestCategory.C, TestCategory.F, TestCategory.A),
        Card(TestCategory.C, TestCategory.G, TestCategory.B),
        Card(TestCategory.C, TestCategory.B, TestCategory.G),

        // Ds - 5-2
        Card(TestCategory.D, TestCategory.A, TestCategory.G),
        Card(TestCategory.D, TestCategory.G, TestCategory.C),
        Card(TestCategory.D, TestCategory.C, TestCategory.H),
        Card(TestCategory.D, TestCategory.H, TestCategory.E),
        Card(TestCategory.D, TestCategory.E, TestCategory.A),
        Card(TestCategory.D, TestCategory.F, TestCategory.B),
        Card(TestCategory.D, TestCategory.B, TestCategory.F),

        // Es - 7-0
        Card(TestCategory.E, TestCategory.A, TestCategory.F),
        Card(TestCategory.E, TestCategory.F, TestCategory.G),
        Card(TestCategory.E, TestCategory.G, TestCategory.D),
        Card(TestCategory.E, TestCategory.D, TestCategory.B),
        Card(TestCategory.E, TestCategory.B, TestCategory.H),
        Card(TestCategory.E, TestCategory.H, TestCategory.C),
        Card(TestCategory.E, TestCategory.C, TestCategory.A),

        // Fs - 4-3
        Card(TestCategory.F, TestCategory.G, TestCategory.E),
        Card(TestCategory.F, TestCategory.E, TestCategory.D),
        Card(TestCategory.F, TestCategory.D, TestCategory.C),
        Card(TestCategory.F, TestCategory.C, TestCategory.G),
        Card(TestCategory.F, TestCategory.A, TestCategory.H),
        Card(TestCategory.F, TestCategory.H, TestCategory.B),
        Card(TestCategory.F, TestCategory.B, TestCategory.A),

        // Gs - 7-0
        Card(TestCategory.G, TestCategory.A, TestCategory.B),
        Card(TestCategory.G, TestCategory.B, TestCategory.E),
        Card(TestCategory.G, TestCategory.E, TestCategory.F),
        Card(TestCategory.G, TestCategory.F, TestCategory.C),
        Card(TestCategory.G, TestCategory.C, TestCategory.D),
        Card(TestCategory.G, TestCategory.D, TestCategory.H),
        Card(TestCategory.G, TestCategory.H, TestCategory.A),

        // Hs - 4-3
        Card(TestCategory.H, TestCategory.A, TestCategory.C),
        Card(TestCategory.H, TestCategory.C, TestCategory.B),
        Card(TestCategory.H, TestCategory.B, TestCategory.D),
        Card(TestCategory.H, TestCategory.D, TestCategory.A),
        Card(TestCategory.H, TestCategory.E, TestCategory.G),
        Card(TestCategory.H, TestCategory.G, TestCategory.F),
        Card(TestCategory.H, TestCategory.F, TestCategory.E),
    )