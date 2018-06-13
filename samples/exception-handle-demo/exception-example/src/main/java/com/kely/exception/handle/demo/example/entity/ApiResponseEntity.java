package com.kely.exception.handle.demo.example.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 接口响应实体
 */
@Data
@Builder
public class ApiResponseEntity<T extends Object> {
    /**
     * 错误消息
     */
    private String errorMsg;

    private String errorCode;
    /**
     * 数据内容
     */
    private T data;
}