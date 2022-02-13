package com.atguigu.config;

import com.atguigu.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

//    @Autowired
//    private MyInterceptor myInterceptor;

    @ConditionalOnClass(MyInterceptor.class)
    @Bean
    public MyInterceptor getMyInterceptor() {
        return new MyInterceptor();
    }

    /**
     * /user/* 单层目录
     * /user/** 多层目录
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor())
                .addPathPatterns("/user/**")
                .excludePathPatterns("static/**", "webapp/**");
    }
}
