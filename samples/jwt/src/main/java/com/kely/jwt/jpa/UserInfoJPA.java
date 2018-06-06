package com.kely.jwt.jpa;


import com.kely.jwt.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserInfoJPA extends JpaRepository<UserInfoEntity,String>,
        JpaSpecificationExecutor<UserInfoEntity>
{

}