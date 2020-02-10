package guru.springframework.sfgpetclinic.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class PersonTest {

    @Test
    fun `grouped assertions`() {
//        Given
        val person = Person(11, "Joe", "Buck")

//        Then
        assertAll("Test Props Set",
                {
                    assertEquals("Joe", person.firstName)
                    assertEquals("Buck", person.lastName)
                    assertEquals("Joe Buck", "${person.firstName} ${person.lastName}", "Full name failed")
                }
        )
    }
}