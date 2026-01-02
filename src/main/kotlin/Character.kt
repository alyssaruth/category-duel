package com.github.alyssaruth

import java.awt.image.BufferedImage
import javax.imageio.ImageIO

data class Character(val name: String, val img: BufferedImage, val category: Category) {

    companion object {
        fun factory(name: String, category: Category): Character {
            val resourcePath = "/${category.resourcePath()}/${asResourcePath(name)}.png"
            val img = ImageIO.read(Character::class.java.getResource(resourcePath))
            return Character(name, img, category)
        }
    }
}
