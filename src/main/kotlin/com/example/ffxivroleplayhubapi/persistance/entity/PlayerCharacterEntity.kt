package com.example.ffxivroleplayhubapi.persistance.entity

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
    val firstName: String

)
