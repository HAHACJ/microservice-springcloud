package com.microservice.springcloud.detp8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Dept_8082_App {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8082_App.class, args);
    }
}
