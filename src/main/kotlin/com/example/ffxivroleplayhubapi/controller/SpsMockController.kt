package com.example.ffxivroleplayhubapi.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

@RestController
class SpsMockController {


    @GetMapping("/on-air-event-api/events/channel/{whatever}", produces = ["application/json"])
    fun mockOnAirApiResponse(
        @PathVariable("whatever") whatever:String?,
        periodMinutes: String?,
        bxfId: String?,
        page: String?,
        size: String?
    ): ResponseEntity<String> {
        val file = "src/main/resources/response/spot-2-on-air-response.json"
        return ResponseEntity.of(Optional.ofNullable(readFileAsString(file)))
    }

    @GetMapping("/schedule/spotbreak/commercialEvents/{whatever}", produces = ["application/json"])
    fun mockCommercialResponse(
        @PathVariable("whatever") whatever:String?,
    ): ResponseEntity<String> {
        val file = "src/main/resources/response/spot-2-commercial-response.json"
        return ResponseEntity.of(Optional.ofNullable(readFileAsString(file)))
    }

    @Throws(Exception::class)
    fun readFileAsString(file: String): String {
        return String(Files.readAllBytes(Paths.get(file)))
    }
}

//    LgiProviderAdvertisementUpidDetails providerAdvertisementUpidDetails =
//        lgiProviderAdvertisementService.getProviderAdvertisementUpidDetailsBy(scheduleEventsSplice);

//{$.X-Correlation-ID="3dade5f7-e31c-4aed-b316-e378eadd876e"}
