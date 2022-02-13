package com.atguigu.properties;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class DataSourceProperties {

    @Value("${spring.jdbc.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.jdbc.datasource.url}")
    private String url;
    @Value("${spring.jdbc.datasource.username}")
    private String username;
    @Value("${spring.jdbc.datasource.password}")
    private String password;

}
