package com.example.ffxivroleplayhubapi.service

import com.example.ffxivroleplayhubapi.persistance.repository.PlayerCharacterRepository
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
internal class PlayerCharacterServiceTest(
    @MockBean
    private val repository: PlayerCharacterRepository
)
