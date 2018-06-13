package com.kely.exception.handle.demo.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 全局异常通知入口类
 */
@SpringBootApplication
@ComponentScan(value = "com.kely.exception")
public class ExceptionExampleApplication {
    /**
     * logger new instance
     */
    static Logger logger = LoggerFactory.getLogger(ExceptionExampleApplication.class);

    /**
     * 程序入口方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(ExceptionExampleApplication.class, args);
        logger.info("【【【【【业务异常统一处理-启动完成】】】】】");
    }
}