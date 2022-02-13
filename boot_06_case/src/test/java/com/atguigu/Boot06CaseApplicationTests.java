package com.atguigu;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Boot06CaseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }

    @Autowired
    private UserService userService;

    @Test
    public void findAll2() {
        List<User> users = userService.findAll();
        users.forEach(System.out::println);
    }


}
