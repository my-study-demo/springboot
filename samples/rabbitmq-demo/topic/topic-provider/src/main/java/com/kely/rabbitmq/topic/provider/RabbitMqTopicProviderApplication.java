package com.kely.rabbitmq.topic.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.kely.rabbitmq")
public class RabbitMqTopicProviderApplication {

    private static Logger logger = LoggerFactory.getLogger(RabbitMqTopicProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqTopicProviderApplication.class, args);

        logger.info("【【【【【Topic队列消息Provider启动成功】】】】】");
    }
}