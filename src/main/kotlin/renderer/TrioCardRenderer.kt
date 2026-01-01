package com.github.alyssaruth.renderer

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

fun renderCard(): BufferedImage {
    val img = BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB)
    val g = img.createGraphics()

    // Fill whole thing black
    g.paint = Color.BLACK
    g.fillRect(0, 0, WIDTH, HEIGHT)

    // Section 1
    g.paint = Color.RED
    g.fillRect(BORDER_WIDTH, BORDER_WIDTH, DESCRIPTION_WIDTH, SECTION_HEIGHT)

    g.paint = Color.PINK
    g.fillRect(BORDER_WIDTH + DESCRIPTION_WIDTH + 5, BORDER_WIDTH, IMAGE_SIZE, IMAGE_SIZE)

    // Section 2
    g.paint = Color.CYAN
    g.fillRect(BORDER_WIDTH, BORDER_WIDTH + (SECTION_HEIGHT + SEPARATOR_WIDTH), IMAGE_SIZE, IMAGE_SIZE)

    g.paint = Color.BLUE
    g.fillRect(BORDER_WIDTH + IMAGE_SIZE + 5, BORDER_WIDTH + (SECTION_HEIGHT + SEPARATOR_WIDTH), DESCRIPTION_WIDTH, SECTION_HEIGHT)

    // Section 3
    g.paint = Color.ORANGE
    g.fillRect(BORDER_WIDTH, BORDER_WIDTH + (2 * (SECTION_HEIGHT + SEPARATOR_WIDTH)), DESCRIPTION_WIDTH, SECTION_HEIGHT)

    g.paint = Color.YELLOW
    g.fillRect(BORDER_WIDTH + DESCRIPTION_WIDTH + 5, BORDER_WIDTH + (2 * (SECTION_HEIGHT + SEPARATOR_WIDTH)), IMAGE_SIZE, IMAGE_SIZE)

    g.drawImage(img, 0, 0, null)
    return img
}