package com.atguigu;

import com.atguigu.properties.DataSourceProperties2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Boot03YmlApplicationTests {

    @Autowired
    private DataSourceProperties2 dataSourceProperties2;

    @Test
    public void testDataSourceProperties2(){
        log.info("dataSourceProperties2: {}",dataSourceProperties2);
    }


    @Test
    void contextLoads() {
    }

}
