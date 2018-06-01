package com.microservice.consumer7070.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    /**
//     * 选取随机规则
//     * @return
//     */
//    @Bean
//    public IRule myRule() {
//        return new RandomRule();
//    }


}
