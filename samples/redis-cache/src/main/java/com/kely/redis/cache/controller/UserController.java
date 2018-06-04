package com.kely.redis.cache.controller;

import com.kely.redis.cache.entity.UserEntity;
import com.kely.redis.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserEntity> list() {
        return userService.list();
    }
}