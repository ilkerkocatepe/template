package dev.ilkerk.template.presentation.api;

import dev.ilkerk.template.infrastructure.configuration.HealthCheckConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health-check")
@RequiredArgsConstructor
public class HealthCheckController {
    private final HealthCheckConfiguration healthCheckConfiguration;

    @GetMapping
    public String healthCheck() {
        return healthCheckConfiguration.healthCheck();
    }
}
