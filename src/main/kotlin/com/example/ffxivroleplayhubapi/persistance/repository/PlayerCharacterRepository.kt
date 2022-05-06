package com.example.ffxivroleplayhubapi.persistance.repository

import com.example.ffxivroleplayhubapi.persistance.entity.PlayerCharacterEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PlayerCharacterRepository : JpaRepository<PlayerCharacterEntity, UUID>
