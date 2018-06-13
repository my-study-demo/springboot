package com.kely.rabbitmq.demo.provider.repository;


import com.kely.rabbitmq.demo.provider.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<UserEntity, Long> {
}