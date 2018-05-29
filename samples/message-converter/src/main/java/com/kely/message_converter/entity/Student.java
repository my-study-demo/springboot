package com.kely.message_converter.entity;

import java.util.Date;

/**
 * @description:
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/5/29 22:35
 */
public class Student {
    private Long id;
    private String name;
    private int age;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
