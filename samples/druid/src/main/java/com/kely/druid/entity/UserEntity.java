package com.kely.druid.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 -- 建表语句
 CREATE TABLE `t_user` (
 `t_id` bigint(9) NOT NULL AUTO_INCREMENT,
 `t_name` varchar(50) DEFAULT NULL,
 `t_age` int(3) DEFAULT NULL,
 `t_address` varchar(90) DEFAULT NULL,
 PRIMARY KEY (`t_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}