package com.github.alyssaruth

import java.awt.Color
import java.awt.Font

data class Category(val name: String, val font: Font, val bg: Color, val fg: Color) {
    fun resourcePath() = asResourcePath(name)

    companion object {
        fun factory(name: String, bgHex: String, fgHex: String): Category {
            val fontStream = Category::class.java.getResourceAsStream("/${asResourcePath(name)}/font.ttf")
            val font = Font.createFont(Font.TRUETYPE_FONT, fontStream)
            return Category(name, font, Color.decode(bgHex), Color.decode(fgHex))
        }
    }
}
