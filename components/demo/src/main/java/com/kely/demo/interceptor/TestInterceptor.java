package com.kely.demo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(TestInterceptor.class);

    //需依赖该工程传入
    boolean hanlderSwitch = true;

    public boolean isHanlderSwitch() {
        return hanlderSwitch;
    }

    public void setHanlderSwitch(boolean hanlderSwitch) {
        this.hanlderSwitch = hanlderSwitch;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logger.info("----------------->components interceptor!");
        logger.info("----------------->" + hanlderSwitch);
        return true;
    }
}
