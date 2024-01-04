package dev.ilkerk.template.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@FeignClient(name = "other-service", value = "other-service", url = "${other-service.url}")
public interface OtherServiceClient {
    @GetMapping("/other-endpoint")
    BigDecimal getOtherEndpoint();
}
