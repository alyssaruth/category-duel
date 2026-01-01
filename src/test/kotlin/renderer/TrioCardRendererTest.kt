package renderer

import com.github.alyssaruth.renderer.renderCard
import org.junit.jupiter.api.Test
import java.io.File
import javax.imageio.ImageIO

class TrioCardRendererTest {
    @Test
    fun `render test`() {
        val imgPath = "src/test/resources/__snapshots__"
        val file = File("$imgPath/test.png")
        file.mkdirs()

        val img = renderCard()
        ImageIO.write(img, "png", file)
    }
}