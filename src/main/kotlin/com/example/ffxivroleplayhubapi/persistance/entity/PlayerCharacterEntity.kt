package com.example.ffxivroleplayhubapi.persistance.entity

import com.example.ffxivroleplayhubapi.model.PlayerCharacter
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class PlayerCharacterEntity(
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    val id: UUID?,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String

) {
    fun toModel() = PlayerCharacter(
        firstName = firstName,
        lastName = lastName
    )
}
