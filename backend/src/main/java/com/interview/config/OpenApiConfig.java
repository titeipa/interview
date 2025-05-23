package com.interview.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Basic Repair Shop Management",
                description = """
                        For authentication you can use any of:
                        - admin token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ1c2VySWQxIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNzQ0ODk0MzQ2LCJleHAiOjE3NzY0Mjk5MjIsInJvbGVzIjpbIkFETUlOIl19.Y8dcM1vE59mn-2HqPRewJ5af40vLVm28C6XS4ZU5zccK78PVFjC9KMet_-icTqu9sCFwBhkbMnUp4i25y1v-i8Y9o6IbdgqGHcz6k38IAy8rodxM_EtHpnZW7Z7Ss21T6MidewR2H12AztWz4B6cPUdC0Qpd8NjBzsclIAvtlWpW_4YBeJv0GO9-JsCNx7BR2N7yR8mMG9YkP5ZIylQdOyQTgohMsI-LGoCI-GMIaiApe8-QUdrE8NgVXV9_17FcasEKDpgV66L7ujs0_pCJcDjL1HdThoSKC0iHTfOpCOL9bFPBPmR1CPtZtI-7m3gRAoDpeZxLQqTesNJzMje7og
                        - user token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ1c2VySWQxIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNzQ0ODk0MzQ2LCJleHAiOjE3NzY0Mjk5MjIsInJvbGVzIjpbIlVTRVIiXX0.YGzK_qh52EWRky0aik5GmLH5vCdMcOy7YvXG0Xv2KvyShctT-jvhBtVYi-pc8fq3Opyi3bDEmiBObwgFE4GNmt8x4HJZwGVhf4vXdEWYAByLrne9Q_F1i-PgASP7sZPQj4T_DAWzKDIRbRRBMGyfpOUNK3Fe135_-C6I3SM8ktIGh8_wA48WOD90NcNgzUHowDfu100niwXF0Y6bLfh-Mek334c67416fEumBGEI05YUl0fcft2e2eAQJQ8Qhk9j4qExt-uYFAp9B5iStmE0W7ZCbLruC7B0nP_-NHalXvjFey0EBqVqxZWoOG3hO9X4s4-nkEHqxT1GjyAk5T8rBA""",
                version = "v1"
        )
)
@SecurityScheme(
        name = "bearerAuth",
        scheme = "bearer",
        bearerFormat = "JWT",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}