package com.example.ffxivroleplayhubapi.restclient

import org.springframework.stereotype.Service

@Service
class PlayerCharacterClient {

//    private val client: WebClient = WebClient.builder()
//        .baseUrl("http://localhost:8080")
//        .defaultCookie("cookieKey", "cookieValue")
//        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//        .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
//        .build()


    fun searchByName(name: String): String {
        return "the name was $name"
    }

}
