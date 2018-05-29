package com.kely.interceptor.interceptor;

import com.kely.interceptor.annotation.Authorization;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;

/**
 * @description: 登录token验证
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/5/29 23:22
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        //正常应该在header中
        String token = request.getParameter("token");

        if ((token == null || "".equals(token)) && (handlerMethod.getBeanType().getAnnotation(Authorization.class) != null   // 查看方法所在的Controller是否有注解
                || method.getAnnotation(Authorization.class) != null)) {              // 查看方法上是否有注解
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(response.getOutputStream()));
            writer.write("{\n" +
                    "  \"ret\": 401\n" +
                    "}");
            writer.close();
            return false;
        }

        return true;
    }
}
