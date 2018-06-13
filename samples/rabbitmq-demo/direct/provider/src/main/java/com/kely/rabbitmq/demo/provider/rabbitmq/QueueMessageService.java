package com.kely.rabbitmq.demo.provider.rabbitmq;

import com.kely.rabbitmq.demo.common.enums.ExchangeEnum;
import com.kely.rabbitmq.demo.common.enums.QueueEnum;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public interface QueueMessageService
        extends RabbitTemplate.ConfirmCallback {
    /**
     * 发送消息到rabbitmq消息队列
     *
     * @param message      消息内容
     * @param exchangeEnum 交换配置枚举
     * @param queueEnum    队列配置枚举
     * @throws Exception
     */
    void send(Object message, ExchangeEnum exchangeEnum, QueueEnum queueEnum) throws Exception;
}