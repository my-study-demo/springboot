package com.kely.interceptor.controller;

import com.kely.interceptor.annotation.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/5/29 23:36
 */
@RestController
@RequestMapping("/")
public class CommonController {

    @GetMapping("login")
    @Authorization
    public String login(@RequestParam(name = "token", required = false) String token) {
        return "登录成功！";
    }

    @GetMapping("get")
    public String login() {
        return "get success！";
    }
}
