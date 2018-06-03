package com.kely.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 基于SpringBoot项目提供一个继承OAuth2安全框架的REST API服务端，必须获取访问授权令牌后才可以访问资源。
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/6/3 16:33
 * @see {https://www.jianshu.com/p/ded9dc32f550}
 */
@SpringBootApplication
public class Oauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class,args);
    }
}
