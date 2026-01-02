package com.github.alyssaruth.renderer

import java.awt.Font
import java.awt.Graphics2D
import java.awt.font.TextLayout


fun Font.forHeight(g: Graphics2D, text: String, desiredHeight: Int) = findFontWithHeight(g, text, this, desiredHeight)

private tailrec fun findFontWithHeight(g: Graphics2D, text: String, baseFont: Font, desiredHeight: Int, currentSize: Float = 1f): Pair<Font, Int> {
    val font = baseFont.deriveFont(Font.PLAIN, currentSize)

    val layout = TextLayout(text, font, g.fontRenderContext)

    if (layout.bounds.height >= desiredHeight) {
        println("Font: ${baseFont.fontName}, Size: $currentSize, height: ${layout.bounds.height}, offsets: ${layout.baselineOffsets.toList()}, Advance: ${layout.visibleAdvance}, Ascent: ${layout.ascent}, Descent: ${layout.descent}")
        return font to (layout.ascent.toInt() - layout.bounds.height.toInt() - 1)
    }

    return findFontWithHeight(g, text, baseFont, desiredHeight, currentSize + 1)
}
