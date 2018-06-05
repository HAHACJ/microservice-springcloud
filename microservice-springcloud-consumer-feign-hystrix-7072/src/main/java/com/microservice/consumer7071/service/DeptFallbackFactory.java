package com.microservice.consumer7071.service;

import com.microservice.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptFallbackFactory implements FallbackFactory<DeptFeignService> {

    @Override
    public DeptFeignService create(Throwable throwable) {
        return new DeptFeignService() {
            @Override
            public Dept getById(Integer id) {
                return new Dept().setDname("服务暂停使用！");
            }

            @Override
            public List<Dept> getAll() {
                return null;
            }
        };
    }
}
