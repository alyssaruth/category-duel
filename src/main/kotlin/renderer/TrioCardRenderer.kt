package com.github.alyssaruth.renderer

import com.github.alyssaruth.Category
import com.github.alyssaruth.Character
import java.awt.Color
import java.awt.Graphics2D
import java.awt.RenderingHints
import java.awt.image.BufferedImage
import javax.swing.JLabel
import javax.swing.SwingConstants
import javax.swing.border.EmptyBorder

const val WIDTH = 816
const val HEIGHT = 1110

const val BORDER_WIDTH = 72
const val IMAGE_SIZE = 298
const val NUMBER_HEIGHT = 115
const val NAME_HEIGHT = 39
const val SEPARATOR_WIDTH = BORDER_WIDTH / 2
const val IMAGE_SEPARATOR_WIDTH = 5

// Computed
const val SECTION_HEIGHT = IMAGE_SIZE
const val SECTION_WIDTH = WIDTH - (2*BORDER_WIDTH)
const val DESCRIPTION_WIDTH = SECTION_WIDTH - IMAGE_SIZE - IMAGE_SEPARATOR_WIDTH
const val SECTION_VGAP = (SECTION_HEIGHT - NUMBER_HEIGHT - NAME_HEIGHT) / 3

fun renderCard(three: Character, two: Character, one: Character): BufferedImage {
    val img = BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB)
    val g = img.createGraphics()
    g.paint = Color.BLACK
    g.fillRect(0, 0, WIDTH, HEIGHT)

    g.renderThree(three)
    g.renderTwo(two)
    g.renderOne(one)

    g.drawImage(img, 0, 0, null)
    return img
}

private fun Graphics2D.renderThree(character: Character) {
    paint = character.category.bg
    fillRect(BORDER_WIDTH, BORDER_WIDTH, DESCRIPTION_WIDTH, SECTION_HEIGHT)

    drawImage(character.img, BORDER_WIDTH + DESCRIPTION_WIDTH + IMAGE_SEPARATOR_WIDTH, BORDER_WIDTH, null)

    paintTextLabel("3", character.category, BORDER_WIDTH, BORDER_WIDTH + SECTION_VGAP, NUMBER_HEIGHT)
    paintTextLabel(character.name, character.category, BORDER_WIDTH, BORDER_WIDTH + SECTION_VGAP + NUMBER_HEIGHT + SECTION_VGAP, NAME_HEIGHT)
}

private fun Graphics2D.renderTwo(character: Character) {
    val yStart = BORDER_WIDTH + (SECTION_HEIGHT + SEPARATOR_WIDTH)
    drawImage(character.img, BORDER_WIDTH, yStart, null)

    paint = character.category.bg
    val descriptionX = BORDER_WIDTH + IMAGE_SIZE + IMAGE_SEPARATOR_WIDTH
    fillRect(descriptionX, yStart, DESCRIPTION_WIDTH, SECTION_HEIGHT)

    paintTextLabel("2", character.category, descriptionX, yStart + SECTION_VGAP, NUMBER_HEIGHT)
    paintTextLabel(character.name, character.category, descriptionX, yStart + SECTION_VGAP + NUMBER_HEIGHT + SECTION_VGAP, NAME_HEIGHT)
}

private fun Graphics2D.renderOne(character: Character) {
    val yStart = BORDER_WIDTH + (2 * (SECTION_HEIGHT + SEPARATOR_WIDTH))
    paint = character.category.bg
    fillRect(BORDER_WIDTH, yStart, DESCRIPTION_WIDTH, SECTION_HEIGHT)

    drawImage(character.img, BORDER_WIDTH + DESCRIPTION_WIDTH + IMAGE_SEPARATOR_WIDTH, yStart, null)

    paintTextLabel("1", character.category, BORDER_WIDTH, yStart + SECTION_VGAP, NUMBER_HEIGHT)
    paintTextLabel(character.name, character.category, BORDER_WIDTH, yStart + SECTION_VGAP + NUMBER_HEIGHT + SECTION_VGAP, NAME_HEIGHT)
}

private fun Graphics2D.paintTextLabel(text: String, category: Category, x: Int, y: Int, height: Int) {
    val (font, topOffset) = category.font.forHeight(this, text, height, DESCRIPTION_WIDTH - 40)
    val metrics = getFontMetrics(font)

    val lbl = JLabel(text)
    lbl.foreground = category.fg
    lbl.horizontalAlignment = SwingConstants.CENTER
    lbl.verticalAlignment = SwingConstants.TOP
    lbl.font = font
    lbl.border = EmptyBorder(-topOffset, 0, 0, 0)
    lbl.setSize(DESCRIPTION_WIDTH, metrics.height)

    setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
    translate(x, y)
    lbl.paint(this)
    translate(-x, -y)
}