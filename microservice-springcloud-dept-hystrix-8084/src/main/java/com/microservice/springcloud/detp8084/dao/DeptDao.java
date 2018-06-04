package com.microservice.springcloud.detp8084.dao;

import com.microservice.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    Dept findById(long id);

    void add(Dept dept);

    void delete(long id);

    void update(Dept dept);

    List<Dept> findAll();

}
