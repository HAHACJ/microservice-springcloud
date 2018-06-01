package com.microservice.consumer7071.service;


import com.microservice.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-springcloud-dept")
public interface DeptFeignService {

    @GetMapping("/dept/find/{id}")
    Dept getById(@PathVariable Integer id);


    @GetMapping("/dept/find/all")
    List<Dept> getAll();
}
