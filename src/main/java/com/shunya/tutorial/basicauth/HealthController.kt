package com.shunya.tutorial.basicauth

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/api/health")
    fun hello(): Health {
        return Health.UP
    }

}

data class Health(
        val status: String
) {
    companion object {
        val UP = Health("UP")
    }
}