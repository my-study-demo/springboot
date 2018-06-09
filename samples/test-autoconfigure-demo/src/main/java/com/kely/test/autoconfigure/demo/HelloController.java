package com.kely.test.autoconfigure.demo;

import com.kely.autoconfigure.demo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/6/9 22:47
 */
@RestController
public class HelloController {

    //注入自定义starter内逻辑
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return helloService.sayHello();
    }
}
