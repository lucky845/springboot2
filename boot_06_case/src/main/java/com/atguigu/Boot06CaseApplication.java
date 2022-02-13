package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableTransactionManagement
@MapperScan(basePackages = "com.atguigu.dao")
@SpringBootApplication
public class Boot06CaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot06CaseApplication.class, args);
    }

}
