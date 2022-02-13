package com.atguigu.pojo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@ToString
@Data
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String address;
    private String qq;
    private String email;
    private String username;
    private String phone;

}
