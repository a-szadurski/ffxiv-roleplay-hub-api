package com.example.ffxivroleplayhubapi.persistence.repository

import com.example.ffxivroleplayhubapi.persistance.entity.PlayerCharacterEntity
import com.example.ffxivroleplayhubapi.persistance.repository.PlayerCharacterRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
internal class PlayerCharacterRepositoryTest {

    @Autowired
    lateinit var repository: PlayerCharacterRepository

    @Test
    fun `given new entity when saving then it is saved`() {
        val result = repository.save(PlayerCharacterEntity(null, "f_name", "l_name"))
        assertThat(result).isNotNull
        assertThat(result.id).isNotNull
    }
}
