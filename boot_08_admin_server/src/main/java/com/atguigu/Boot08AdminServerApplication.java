package com.atguigu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer // 开启管理服务
@SpringBootApplication
public class Boot08AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot08AdminServerApplication.class, args);
    }

}
