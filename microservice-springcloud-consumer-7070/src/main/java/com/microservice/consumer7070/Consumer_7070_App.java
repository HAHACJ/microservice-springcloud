package com.microservice.consumer7070;


import com.microservice.ribbon.rule.MyCustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "microservice-springcloud-dept", configuration = MyCustomRule.class)
public class Consumer_7070_App {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_7070_App.class, args);
    }
}
