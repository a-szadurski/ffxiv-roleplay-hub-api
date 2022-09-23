package com.example.ffxivroleplayhubapi.persistance.entity

import java.util.*
import javax.persistence.*

@Entity
class OrganizationEntity(
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    val id: UUID?,

    @Column(name = "name")
    val name: String,

    @ManyToMany(fetch = FetchType.LAZY)
    val players: List<PlayerCharacterEntity>
)
