package com.pangsor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        return Map.of(
                "status", "UP",
                "version", appVersion,
                "message", "CI/CD pipeline is working"
        );
    }
}
