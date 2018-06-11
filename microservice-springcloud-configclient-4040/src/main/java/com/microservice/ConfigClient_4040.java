package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient_4040 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_4040.class, args);
    }
}
