package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查找所有用户
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findUsers();
    }

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @RequestMapping("/findUserById")
    public User findUserById(Long id) {
        return userService.findUserById(id);
    }

    /**
     * 保存用户
     *
     * @param user
     */
    @RequestMapping("/saveUser")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    /**
     * 修改用户
     *
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    /**
     * 根据id删除用户
     *
     * @param id
     */
    @RequestMapping("deleteUserById")
    public void daleteUserById(Long id) {
        userService.deleteUserById(id);
    }

}
