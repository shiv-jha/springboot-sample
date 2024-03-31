package com.training.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/activity")
@RestController
public class ActivityController {

    @GetMapping
    public String getRandomActivity() {
        return "{\"activity\":\"Learn the circuit breaker\",\"type\":\"education\",\"participants\":15,\"price\":0,\"link\":\"https://en.wikipedia.org/wiki/circuitbreaker\",\"key\":\"1234\",\"accessibility\":0}";
    }
}

