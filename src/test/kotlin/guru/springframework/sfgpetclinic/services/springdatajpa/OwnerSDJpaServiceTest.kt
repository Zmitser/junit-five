package guru.springframework.sfgpetclinic.services.springdatajpa

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled("Disabled until we learn Mocking")
class OwnerSDJpaServiceTest {

    lateinit var service: OwnerSDJpaService

    @BeforeEach
    fun setUp() {
        service = OwnerSDJpaService(null, null, null)
    }

    @Test
    fun findByLastName() {
        val owner = service.findByLastName("Buck")
    }

    @Test
    fun findAllByLastNameLike() {
    }

    @Test
    fun findAll() {
    }

    @Test
    fun findById() {
    }

    @Test
    fun save() {
    }

    @Test
    fun delete() {
    }

    @Test
    fun deleteById() {
    }
}