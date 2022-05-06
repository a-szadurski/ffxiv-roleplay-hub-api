package com.example.ffxivroleplayhubapi.persistance.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class PlayerCharacterEntity(
    @Id
    @GeneratedValue(generator = "uuid2")
    val id: UUID
)
