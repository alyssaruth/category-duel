package renderer

import com.github.alyssaruth.Character
import com.github.alyssaruth.DISCWORLD
import com.github.alyssaruth.FUTURAMA
import com.github.alyssaruth.TASKMASTER
import com.github.alyssaruth.renderer.renderCard
import org.junit.jupiter.api.Test
import java.io.File
import javax.imageio.ImageIO

class TrioCardRendererTest {
    @Test
    fun `render test`() {
        val three = Character.factory("Mustrum Ridcully", DISCWORLD)
        val two = Character.factory("Richard Osman", TASKMASTER)
        val one = Character.factory("Hedonismbot", FUTURAMA)
        val imgPath = "src/test/resources/__snapshots__"
        val file = File("$imgPath/test.png")
        file.mkdirs()

        val img = renderCard(three, two, one)
        ImageIO.write(img, "png", file)
    }
}