package com.example.ffxivroleplayhubapi.service

import com.example.ffxivroleplayhubapi.persistance.repository.PlayerCharacterRepository
import com.example.ffxivroleplayhubapi.restclient.PlayerCharacterClient
import org.springframework.stereotype.Service

@Service
class PlayerCharacterService(
    private val repository: PlayerCharacterRepository,
    private val webClient: PlayerCharacterClient
) {

    fun searchCharacterByName(name: String): String {
        return webClient.searchByName(name)
    }
}
