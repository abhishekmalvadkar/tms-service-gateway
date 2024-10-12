package com.amalvadkar.tms.gateway;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties(prefix = "tms.cors")
@Validated
public record CorsProperties(

        @NotEmpty(message = "allowedOrigins should not be null or empty")
        List<String> allowedOrigins,
        @NotEmpty(message = "allowedMethods should not be null or empty")
        List<String> allowedMethods,
        @NotEmpty(message = "allowedHeaders should not be null or empty")
        List<String> allowedHeaders,

        @NotNull(message = "maxAge should not be null")
        Long maxAge,
        @NotEmpty(message = "exposedHeaders should not be null or empty")
        List<String> exposedHeaders
) {
}