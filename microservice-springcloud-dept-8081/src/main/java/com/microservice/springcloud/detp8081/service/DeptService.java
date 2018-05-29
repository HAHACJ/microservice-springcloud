package com.microservice.springcloud.detp8081.service;

import com.microservice.entity.Dept;

import java.util.List;

public interface DeptService {

    Dept getById(long id);

    void add(Dept dept);

    void delete(long id);

    void update(Dept dept);

    List<Dept> getAll();
}
