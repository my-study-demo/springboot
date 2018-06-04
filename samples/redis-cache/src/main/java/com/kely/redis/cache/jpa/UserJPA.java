package com.kely.redis.cache.jpa;


import com.kely.redis.cache.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA extends JpaRepository<UserEntity,Long>
{

}