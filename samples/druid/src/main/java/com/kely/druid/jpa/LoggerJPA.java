package com.kely.druid.jpa;

import com.kely.druid.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerJPA
        extends JpaRepository<LoggerEntity, Long> {

}