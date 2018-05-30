package com.kely.framework.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Iterator;
import java.util.Set;

/**
 * @description: web全局处理
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/5/30 23:32
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(Exception e) throws Exception {
        logger.error("内部异常",e);
        return "咦，系统出错了";
    }

    /**
     * 校验参数
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    public String bindExceptionHandler(BindException e) {
        StringBuilder message = new StringBuilder();
        BindingResult bindingResult = e.getBindingResult();
        if (bindingResult.hasErrors()) {
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                if (message.length() > 0) {
                    message.append("|");
                }
                // 收集错误信息
                message.append(objectError.getDefaultMessage());
            }
        }
        return "参数验证失败，" + message.toString();
    }

    /**
     * 校验方法级参数
     * @param e
     * @return
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    public String constraintViolationExceptionHandler(ConstraintViolationException e){
        StringBuilder message = new StringBuilder();
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        Iterator<ConstraintViolation<?>> constraintViolationIterator = constraintViolations.iterator();
        if (constraintViolationIterator.hasNext()) {
            ConstraintViolation<?> constraintViolation = constraintViolationIterator.next();
            if (message.length() > 0) {
                message.append("|");
            }
            // 收集错误信息
            message.append(constraintViolation.getMessage());
        }
        return "参数验证失败，" + message.toString();
    }
}
