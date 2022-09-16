package com.example.ffxivroleplayhubapi.dto

import com.example.ffxivroleplayhubapi.persistance.entity.PlayerCharacterEntity

data class PlayerCharacterDto(
    val firstName: String
) {
    fun toEntity() = PlayerCharacterEntity(
        id = null,
        firstName = firstName,
        lastName = "default"
    )
}
