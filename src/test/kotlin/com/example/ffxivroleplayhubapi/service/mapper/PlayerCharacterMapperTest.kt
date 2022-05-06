package com.example.ffxivroleplayhubapi.service.mapper

import com.example.ffxivroleplayhubapi.dto.PlayerCharacterDto
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.from
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@ContextConfiguration(classes = [PlayerCharacterMapperImpl::class])
internal class PlayerCharacterMapperTest {

    @Autowired
    lateinit var mapper: PlayerCharacterMapper

    @Test
    fun `given a dto when mapping to entity then all fields should be mapped correctly`() {

        val dto = createPlayerCharacterDto()
        val entity = mapper.toEntity(dto)
        assertThat(entity)
            .returns("firstName", from { it.firstName })

    }

    private fun createPlayerCharacterDto(): PlayerCharacterDto {
        return PlayerCharacterDto("firstName")
    }

}
