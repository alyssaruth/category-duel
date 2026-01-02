package com.github.alyssaruth

import java.awt.Color
import java.awt.Font

data class Category(val font: Font, val bg: Color, val fg: Color) {
    companion object {
        fun factory(fontName: String, bgHex: String, fgHex: String): Category {
            val fontStream = Category::class.java.getResourceAsStream("/fonts/$fontName.ttf")
            val font = Font.createFont(Font.TRUETYPE_FONT, fontStream)
            return Category(font, Color.decode(bgHex), Color.decode(fgHex))
        }
    }
}
