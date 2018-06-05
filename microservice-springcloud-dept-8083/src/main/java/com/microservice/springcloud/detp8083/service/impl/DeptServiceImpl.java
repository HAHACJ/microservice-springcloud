package com.microservice.springcloud.detp8083.service.impl;

import com.microservice.entity.Dept;
import com.microservice.springcloud.detp8083.dao.DeptDao;
import com.microservice.springcloud.detp8083.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept getById(long id) {
        return deptDao.findById(id);
    }

    @Override
    public void add(Dept dept) {
        deptDao.add(dept);
    }

    @Override
    public void delete(long id) {
        deptDao.delete(id);
    }

    @Override
    public void update(Dept dept) {
        deptDao.update(dept);
    }

    @Override
    public List<Dept> getAll() {
        return deptDao.findAll();
    }
}
