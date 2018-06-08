package com.kely.event.demo.event;

import com.kely.event.demo.bean.UserBean;
import org.springframework.context.ApplicationEvent;

/**
 * 同步
 */
public class UserRegisterEvent extends ApplicationEvent {
    //注册用户对象
    private UserBean user;

    /**
     * 重写构造函数
     *
     * @param source 发生事件的对象
     * @param user   注册用户对象
     */
    public UserRegisterEvent(Object source, UserBean user) {
        super(source);
        this.user = user;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }
}
