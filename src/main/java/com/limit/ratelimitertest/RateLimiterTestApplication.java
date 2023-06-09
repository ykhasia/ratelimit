package com.limit.ratelimitertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.*")
public class RateLimiterTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateLimiterTestApplication.class, args);
    }

}
