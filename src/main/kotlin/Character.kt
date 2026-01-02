package com.github.alyssaruth

import java.awt.image.BufferedImage
import javax.imageio.ImageIO

data class Character(val name: String, val category: Category) {
    fun getImage(): BufferedImage {
        val resourcePath = "/${category.resourcePath()}/${asResourcePath(name)}.png"
        return ImageIO.read(Character::class.java.getResource(resourcePath))
    }
}
