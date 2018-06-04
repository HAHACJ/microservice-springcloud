package com.microservice.springcloud.detp8084;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class Dept_8084_App {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8084_App.class, args);
    }
}
