package com.kely.rabbitmq.topic.provider;

import com.kely.rabbitmq.topic.common.enums.ExchangeEnum;

/**
 * 消息队列业务
 */
public interface QueueMessageService {
    /**
     * 发送消息到rabbitmq消息队列
     *
     * @param message      消息内容
     * @param exchangeEnum 交换配置枚举
     * @param routingKey   路由key
     * @throws Exception
     */
    void send(Object message, ExchangeEnum exchangeEnum, String routingKey) throws Exception;
}