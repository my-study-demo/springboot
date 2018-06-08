package com.kely.event.demo.listener.disorder;

import com.kely.event.demo.bean.UserBean;
import com.kely.event.demo.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 无序
 */
//@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent> {

    /**
     * 实现监听
     *
     * @param userRegisterEvent
     */
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //输出注册用户信息
        System.out.println("ApplicationListener注册信息，用户名：" + user.getName() + "，密码：" + user.getPassword());

    }
}
