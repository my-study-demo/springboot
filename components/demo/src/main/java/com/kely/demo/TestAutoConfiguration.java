package com.kely.demo;

import com.kely.demo.interceptor.TestInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ConditionalOnProperty(value = "components.enabled", havingValue = "true", matchIfMissing = false)
public class TestAutoConfiguration extends WebMvcConfigurerAdapter{

    @ConfigurationProperties(prefix="com.kely.componets.interceptor")
    @Bean
    public TestInterceptor testInterceptor(){
        return new TestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}
