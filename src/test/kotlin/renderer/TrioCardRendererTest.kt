package renderer

import com.github.alyssaruth.burlings.BURLINGS
import com.github.alyssaruth.renderer.renderCard
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import java.awt.Point
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class TrioCardRendererTest {
    @Test
    fun `render test`() {
        val imgPath = "src/test/resources/__snapshots__"
        val file = File("$imgPath/burlings_one.png")

        val img = renderCard(BURLINGS.first())
        img.isEqual(ImageIO.read(file)) shouldBe true
    }

    private fun BufferedImage.isEqual(other: BufferedImage): Boolean {
        if (width != other.width || height != other.height) return false
        return getPointList(width, height).all { getRGB(it.x, it.y) == other.getRGB(it.x, it.y) }
    }

    private fun getPointList(width: Int, height: Int): List<Point> {
        val yRange = 0 until height
        val xRange = 0 until width

        return yRange.flatMap { y -> xRange.map { x -> Point(x, y) } }
    }
}