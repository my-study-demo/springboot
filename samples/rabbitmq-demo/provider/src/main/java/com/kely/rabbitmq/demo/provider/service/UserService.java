package com.kely.rabbitmq.demo.provider.service;

import com.kely.rabbitmq.demo.common.enums.ExchangeEnum;
import com.kely.rabbitmq.demo.common.enums.QueueEnum;
import com.kely.rabbitmq.demo.provider.entity.UserEntity;
import com.kely.rabbitmq.demo.provider.rabbitmq.QueueMessageService;
import com.kely.rabbitmq.demo.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    @Autowired
    private UserRepository userRepository;
    /**
     * 消息队列业务逻辑实现
     */
    @Autowired
    private QueueMessageService queueMessageService;

    /**
     * 保存用户
     * 并写入消息队列
     *
     * @param userEntity
     * @return
     */
    public Long save(UserEntity userEntity) throws Exception {
        /**
         * 保存用户
         */
        userRepository.save(userEntity);
        /**
         * 将消息写入消息队列
         */
        queueMessageService.send(userEntity.getId(), ExchangeEnum.USER_REGISTER, QueueEnum.USER_REGISTER);

        return userEntity.getId();
    }
}