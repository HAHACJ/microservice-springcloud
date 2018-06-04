package com.microservice.consumer7072.controller;

import com.microservice.consumer7072.service.DeptFeignService;
import com.microservice.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private DeptFeignService deptFeignService;


    @GetMapping("/consumer/find/{id}")
    public Dept getById(@PathVariable Integer id) {
        return deptFeignService.getById(id);
    }


    @GetMapping("/consumer/find/all")
    public List<Dept> getAll() {
        return deptFeignService.getAll();
    }
}
