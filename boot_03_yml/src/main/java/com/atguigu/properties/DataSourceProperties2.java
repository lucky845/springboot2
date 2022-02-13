package com.atguigu.properties;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.jdbc.datasource")
@Data
@ToString
@Component
public class DataSourceProperties2 {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

}
