package com.automanage.base.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BaseAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseAuthApplication.class);
    }
}
