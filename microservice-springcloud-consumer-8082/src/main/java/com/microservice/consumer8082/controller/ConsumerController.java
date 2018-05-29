package com.microservice.consumer8082.controller;

import com.microservice.entity.Dept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    private final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${consumer_8082.rest_url_prefix}")
    private String restUrlPrefix;

    @GetMapping("/consumer/find/{id}")
    public Dept getById(@PathVariable Integer id) {

        log.info("restUrlPrefix:{}", restUrlPrefix);
        return restTemplate.getForObject(restUrlPrefix + "/dept/find/" + id, Dept.class);
    }


    @GetMapping("/consumer/find/all")
    public List<Dept> getAll() {
        return restTemplate.getForObject(restUrlPrefix + "/dept/find/all", List.class);
    }
}
