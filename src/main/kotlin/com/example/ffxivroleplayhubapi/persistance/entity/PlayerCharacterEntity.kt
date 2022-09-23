package com.example.ffxivroleplayhubapi.persistance.entity

import com.example.ffxivroleplayhubapi.model.PlayerCharacter
import java.util.*
import javax.persistence.*

@Entity
class PlayerCharacterEntity(
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    val id: UUID?,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @ManyToOne(fetch = FetchType.EAGER)
    val user: UserEntity,

    @ManyToMany(fetch = FetchType.LAZY)
    val organizations: List<OrganizationEntity>

) {
    fun toModel() = PlayerCharacter(
        firstName = firstName,
        lastName = lastName,
        user = user.toModel()
    )
}
