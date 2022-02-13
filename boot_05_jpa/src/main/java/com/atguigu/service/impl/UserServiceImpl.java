package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @Override
    public User findUserById(Long  id) {
        return userDao.getOne(id);
    }

    /**
     * 保存用户
     *
     * @param user
     */
    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    /**
     * 修改用户
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    /**
     * 根据id删除一个用户
     *
     * @param id
     */
    @Override
    public void deleteUserById(Long  id) {
        userDao.deleteById(id);
    }
}
