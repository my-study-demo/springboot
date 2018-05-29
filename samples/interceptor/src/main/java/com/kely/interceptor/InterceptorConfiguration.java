package com.kely.interceptor;

import com.kely.interceptor.interceptor.AuthorizationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description:
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/5/29 23:25
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public AuthorizationInterceptor authorizationInterceptor(){
        return new AuthorizationInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
