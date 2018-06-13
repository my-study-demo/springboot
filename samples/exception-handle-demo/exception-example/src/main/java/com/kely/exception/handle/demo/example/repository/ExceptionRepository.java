package com.kely.exception.handle.demo.example.repository;


import com.kely.exception.handle.demo.example.entity.ExceptionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 异常数据接口定义
 */
public interface ExceptionRepository
        extends JpaRepository<ExceptionInfoEntity, Integer> {
    /**
     * 根据异常码获取异常配置信息
     *
     * @param code 异常码
     * @return
     */
    ExceptionInfoEntity findTopByCode(String code);
}