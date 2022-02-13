package com.atguigu.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "id") // 主键字段
    private Long id;

    @Column(name = "username", length = 20, nullable = false) // 字段名 username ，字段长度 20 ，非空约束
    private String username;

    @Column(name = "password",length = 20,nullable = false)
    private String password;

    @Column(name = "name")
    private String name;

}
