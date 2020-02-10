package guru.springframework.sfgpetclinic.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class OwnerTest {

    @Test
    fun `dependent assertions`() {
        val owner = Owner(1, "Joe", "Buck")
        owner.city = "Key West"
        owner.telephone = "12312312434"

        assertAll("Properties Test",
                {
                    assertAll("Person Properties",
                            { assertEquals("Joe", owner.firstName) },
                            { assertEquals("Buck", owner.lastName, "Last Name Did Not Match ") }
                    )
                    assertAll("Owner properties",
                            { assertEquals("12312312434", owner.telephone) },
                            { assertEquals("Key West", owner.city, "City Did Not Match") }
                    )

                }
        )
    }
}