package com.atguigu.service;

import com.atguigu.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();
}
