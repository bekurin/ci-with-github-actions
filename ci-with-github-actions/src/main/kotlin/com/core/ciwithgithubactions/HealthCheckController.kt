package com.core.ciwithgithubactions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthCheckController {
    @GetMapping("/liveness")
    fun livenessCheck(): HttpStatus {
        return HttpStatus.OK
    }

    @GetMapping("/ready")
    fun readinessCheck(): HttpStatus {
        return HttpStatus.OK
    }
}