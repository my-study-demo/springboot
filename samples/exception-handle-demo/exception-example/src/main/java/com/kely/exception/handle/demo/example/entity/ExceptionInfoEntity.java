package com.kely.exception.handle.demo.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统异常基本信息实体
 */
@Data
@Entity
@Table(name = "sys_exception_info")
public class ExceptionInfoEntity implements Serializable {
    /**
     * 异常消息编号
     */
    @Id
    @GeneratedValue
    @Column(name = "EI_ID")
    private Integer id;
    /**
     * 异常消息错误码
     */
    @Column(name = "EI_CODE")
    private String code;
    /**
     * 异常消息内容
     */
    @Column(name = "EI_MESSAGE")
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}