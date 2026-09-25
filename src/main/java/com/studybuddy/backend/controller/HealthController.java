package com.studybuddy.backend.controller;

import com.studybuddy.backend.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping
    public HealthResponse checkHealth() {
        return new HealthResponse("UP", "StudyBuddy Backend", Instant.now());
    }
}