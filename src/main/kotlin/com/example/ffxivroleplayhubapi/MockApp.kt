@file:Suppress("SpellCheckingInspection")

package com.example.ffxivroleplayhubapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MockApp

fun main(args: Array<String>) {
    runApplication<MockApp>(*args)
}
