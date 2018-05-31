package com.microservice.consumer8082;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Consumer_7070_App {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_7070_App.class, args);
    }
}
