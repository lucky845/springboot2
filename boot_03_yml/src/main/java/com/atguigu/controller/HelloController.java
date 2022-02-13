package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import com.atguigu.properties.DataSourceProperties2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(DataSourceProperties2.class)
@Slf4j
@RestController
public class HelloController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Autowired
    private DataSourceProperties2 dataSourceProperties2;

    @RequestMapping("/hello")
    public String sayHello(){
        log.info("DataSourceProperties: {}",dataSourceProperties);
        log.info("DataSourceProperties2: {}",dataSourceProperties2);
        return "hello3 spring boot2";
    }

}
