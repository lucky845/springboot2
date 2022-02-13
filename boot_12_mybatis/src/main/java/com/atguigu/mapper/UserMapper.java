package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    // @Select("select * from user")
    List<User> findAll();
}
