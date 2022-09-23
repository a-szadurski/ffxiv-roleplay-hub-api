package com.example.ffxivroleplayhubapi.persistance.entity

import com.example.ffxivroleplayhubapi.model.User
import java.util.*
import javax.persistence.*

@Entity
class UserEntity(

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    val id: UUID?,

    @Column(name = "name")
    val username: String,

    val password: String,

    @OneToMany
    val characters: List<PlayerCharacterEntity>
) {
    fun toModel() = User(
        username = username
    )
}
