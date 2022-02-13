package com.atguigu.controller;

import com.atguigu.autoconfig.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@EnableConfigurationProperties(DataSourceProperties.class)
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println(dataSource.getClass()); // 打印DruidDataSource数据源
        return "Hello Spring Boot ! ";
    }
}
