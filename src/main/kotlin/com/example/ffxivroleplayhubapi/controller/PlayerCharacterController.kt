package com.example.ffxivroleplayhubapi.controller

import com.example.ffxivroleplayhubapi.service.PlayerCharacterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerCharacterController(
    private val service: PlayerCharacterService
) {

    @GetMapping("/character/search/{name}")
    fun searchCharacterByName(@PathVariable name: String): String {
        return service.searchCharacterByName(name)
    }
}
