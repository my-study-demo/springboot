package com.kely.jwt.jpa;


import com.kely.jwt.entity.TokenInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TokenJPA extends JpaRepository<TokenInfoEntity,String>,
        JpaSpecificationExecutor<TokenInfoEntity> {
}