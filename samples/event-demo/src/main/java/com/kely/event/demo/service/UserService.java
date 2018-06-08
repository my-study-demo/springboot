package com.kely.event.demo.service;

import com.kely.event.demo.bean.UserBean;
import com.kely.event.demo.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    ApplicationContext applicationContext;

    /**
     * 用户注册方法
     *
     * @param user
     */
    public void register(UserBean user) {
        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}
