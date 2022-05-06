package com.example.ffxivroleplayhubapi.service

import com.example.ffxivroleplayhubapi.dto.PlayerCharacterDto
import com.example.ffxivroleplayhubapi.model.PlayerCharacter
import com.example.ffxivroleplayhubapi.persistance.repository.PlayerCharacterRepository
import com.example.ffxivroleplayhubapi.service.mapper.PlayerCharacterMapper
import org.springframework.stereotype.Service

@Service
class PlayerCharacterService(
    private val repository: PlayerCharacterRepository,
    private val mapper: PlayerCharacterMapper
) {

    fun savePlayerCharacter(input: PlayerCharacterDto): PlayerCharacter {
        return mapper.toModel(repository.save(mapper.toEntity(input)))
    }
}
