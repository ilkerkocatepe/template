package dev.ilkerk.template.infrastructure.configuration;

import org.springframework.boot.actuate.health.HealthComponent;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.health.SystemHealth;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HealthCheckConfiguration {
    private final HealthEndpoint healthEndpoint;

    public HealthCheckConfiguration(HealthEndpoint healthEndpoint) {
        this.healthEndpoint = healthEndpoint;
    }

    public String healthCheck() {
        SystemHealth systemHealth = (SystemHealth) healthEndpoint.health();
        Map<String, HealthComponent> details = systemHealth.getComponents();

        if (healthEndpoint.health().getStatus().equals(Status.UP)) {
            return "OK!";
        }

        return details.entrySet().stream()
                .filter(entry -> entry.getValue().getStatus().equals(Status.DOWN))
                .map(entry -> entry.getKey() + " -> DOWN!")
                .toList().toString();
    }
}
