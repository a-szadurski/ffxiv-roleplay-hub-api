package com.example.ffxivroleplayhubapi.service

import com.example.ffxivroleplayhubapi.dto.PlayerCharacterDto
import com.example.ffxivroleplayhubapi.model.PlayerCharacter
import com.example.ffxivroleplayhubapi.persistance.repository.PlayerCharacterRepository
import org.springframework.stereotype.Service

@Service
class PlayerCharacterService(
    private val repository: PlayerCharacterRepository
) {

    fun savePlayerCharacter(input: PlayerCharacterDto): PlayerCharacter {
        return (repository.save(input.toEntity())).toModel()
    }
}
