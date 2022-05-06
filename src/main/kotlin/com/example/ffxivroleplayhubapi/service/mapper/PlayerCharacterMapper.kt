package com.example.ffxivroleplayhubapi.service.mapper

import com.example.ffxivroleplayhubapi.dto.PlayerCharacterDto
import com.example.ffxivroleplayhubapi.model.PlayerCharacter
import com.example.ffxivroleplayhubapi.persistance.entity.PlayerCharacterEntity
import org.mapstruct.Mapper

@Mapper
interface PlayerCharacterMapper {

    fun toEntity(source: PlayerCharacterDto): PlayerCharacterEntity
    fun toModel(source: PlayerCharacterEntity): PlayerCharacter
}
