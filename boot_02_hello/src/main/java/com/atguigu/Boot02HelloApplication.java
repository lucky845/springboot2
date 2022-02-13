package com.atguigu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Boot02HelloApplication {

    public static void main(String[] args) {
        //获取容器的引用
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Boot02HelloApplication.class, args);

        //获取并输出容器创建的Bean的数量
        int count = applicationContext.getBeanDefinitionCount();
        log.info("javabean 的 count为: {}",count);

        //获取并输出容器创建的每个Bean的名称
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            log.info("beanNames: {}",beanName);
        }

    }

}
