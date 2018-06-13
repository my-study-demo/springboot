package com.kely.exception.handle.demo.example.controller;

import com.kely.exception.handle.demo.core.LogicException;
import com.kely.exception.handle.demo.example.entity.ApiResponseEntity;
import com.kely.exception.handle.demo.example.entity.UserInfo;
import com.kely.exception.handle.demo.example.enums.ErrorCodeEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 */
@RestController
public class IndexController {
    /**
     * 首页方法
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public ApiResponseEntity<String> index() throws LogicException {
        /**
         * 模拟用户不存在
         * 抛出业务逻辑异常
         */
        if (true) {
            throw new LogicException(ErrorCodeEnum.USER_STATUS_FAILD.toString(), UserInfo.builder().name("张三").age(1).build().toString());
        }
        return ApiResponseEntity.<String>builder().data("this is index mapping").build();
    }
}