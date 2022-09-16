package com.example.ffxivroleplayhubapi.service.mapper

import com.example.ffxivroleplayhubapi.dto.PlayerCharacterDto
import com.example.ffxivroleplayhubapi.persistance.entity.PlayerCharacterEntity
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.from
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.util.*

@ExtendWith(SpringExtension::class)
internal class PlayerCharacterMappingTest {

    @Test
    fun `given a dto when mapping to entity then all fields should be mapped correctly`() {

        val dto = createDto()
        val entity = dto.toEntity()
        assertThat(entity)
            .returns("firstName", from { it.firstName })
    }

    @Test
    fun `given an entity when mapping to model then all fields should be mapped correctly`() {

        val entity = createEntity()
        val model = entity.toModel()
        assertThat(model)
            .returns("firstName", from { it.firstName })
    }

    private fun createDto(): PlayerCharacterDto {
        return PlayerCharacterDto("firstName")
    }

    private fun createEntity(): PlayerCharacterEntity {
        return PlayerCharacterEntity(UUID.randomUUID(), "firstName", "lastName")
    }

}
