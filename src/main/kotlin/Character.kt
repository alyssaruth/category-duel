package com.github.alyssaruth

import java.awt.image.BufferedImage
import javax.imageio.ImageIO

data class Character(val name: String, val img: BufferedImage, val category: Category) {

    companion object {
        fun factory(name: String, imgResourcePath: String, category: Category): Character {
            val img = ImageIO.read(Character::class.java.getResource(imgResourcePath))
            return Character(name, img, category)
        }
    }
}
