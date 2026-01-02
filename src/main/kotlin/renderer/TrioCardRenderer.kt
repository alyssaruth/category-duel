package com.github.alyssaruth.renderer

import com.github.alyssaruth.Character
import java.awt.Color
import java.awt.image.BufferedImage

const val WIDTH = 816
const val HEIGHT = 1110

const val BORDER_WIDTH = 72

const val IMAGE_SIZE = 298
const val SECTION_HEIGHT = IMAGE_SIZE
const val SECTION_WIDTH = WIDTH - (2*BORDER_WIDTH)
const val DESCRIPTION_WIDTH = SECTION_WIDTH - IMAGE_SIZE - 5
const val SEPARATOR_WIDTH = BORDER_WIDTH / 2

fun renderCard(three: Character, two: Character, one: Character): BufferedImage {
    val img = BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB)
    val g = img.createGraphics()

    // Fill whole thing black
    g.paint = Color.BLACK
    g.fillRect(0, 0, WIDTH, HEIGHT)

    // Section 1
    g.paint = three.category.bg
    g.fillRect(BORDER_WIDTH, BORDER_WIDTH, DESCRIPTION_WIDTH, SECTION_HEIGHT)

    g.drawImage(three.img, BORDER_WIDTH + DESCRIPTION_WIDTH + 5, BORDER_WIDTH, null)

    // Section 2
    g.drawImage(two.img, BORDER_WIDTH, BORDER_WIDTH + (SECTION_HEIGHT + SEPARATOR_WIDTH), null)

    g.paint = two.category.bg
    g.fillRect(BORDER_WIDTH + IMAGE_SIZE + 5, BORDER_WIDTH + (SECTION_HEIGHT + SEPARATOR_WIDTH), DESCRIPTION_WIDTH, SECTION_HEIGHT)

    // Section 3
    g.paint = one.category.bg
    g.fillRect(BORDER_WIDTH, BORDER_WIDTH + (2 * (SECTION_HEIGHT + SEPARATOR_WIDTH)), DESCRIPTION_WIDTH, SECTION_HEIGHT)

    g.drawImage(one.img, BORDER_WIDTH + DESCRIPTION_WIDTH + 5, BORDER_WIDTH + (2 * (SECTION_HEIGHT + SEPARATOR_WIDTH)), null)

    g.drawImage(img, 0, 0, null)
    return img
}