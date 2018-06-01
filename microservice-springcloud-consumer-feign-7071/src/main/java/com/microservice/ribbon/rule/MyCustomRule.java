package com.microservice.ribbon.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomRule {

    @Bean
    public IRule round() {
        return new Call3times();
    }
}
