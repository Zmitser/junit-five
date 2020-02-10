package guru.springframework.sfgpetclinic.controllers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.function.Supplier

class IndexControllerTest {
    private lateinit var indexController: IndexController
    @BeforeEach
    fun setUp() {
        indexController = IndexController()
    }

    @Test
    fun `test index handler`() {
        assertEquals("index", indexController.index())
        assertEquals("index", indexController.index(), "Wrong view returned")
        assertEquals("index", indexController.index()){
            """Another expensive message
                |Make me only if you have to
            """.trimMargin()
        }
    }

    @Test
    fun `test oups handler`() {
        assertTrue("notimplemented" == indexController.oupsHandler()) {
           """This is some expensive
               |Message to build
               |for my test
           """.trimMargin()
        }
    }
}