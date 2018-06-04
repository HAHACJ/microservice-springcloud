package com.microservice.springcloud.detp8084.controller;

import com.microservice.entity.Dept;
import com.microservice.springcloud.detp8084.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    private final Logger log = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/find/{id}")
    @HystrixCommand(fallbackMethod = "errorFind")
    public Dept findById(@PathVariable Long id) {
        if (id == 0) {
            new RuntimeException();
        }
       return deptService.getById(id);
    }

    @GetMapping("/dept/find/all")
    public List<Dept> findAll() {
        return deptService.getAll();
    }

    @PostMapping("/dept/add")
    public void add(Dept dept) {
        deptService.add(dept);
    }

    @PutMapping("/dept/update")
    public void update(Dept dept) {
        deptService.update(dept);
    }

    @DeleteMapping("/dept/delete/{id}")
    public void delete(@PathVariable Long id) {
        deptService.delete(id);
    }

    public Dept errorFind(@PathVariable("id") Long id) {
        return new Dept().setDname("后台服务繁忙，请稍后重试！");
    }
}
