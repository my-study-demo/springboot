package com.kely.exception.handle.demo.example.configuration;

import com.kely.exception.handle.demo.core.LogicException;
import com.kely.exception.handle.demo.example.entity.ApiResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * 控制器异常通知类
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class ExceptionAdvice {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 处理业务逻辑异常
     *
     * @param e 业务逻辑异常对象实例
     * @return 逻辑异常消息内容
     */
    @ExceptionHandler(LogicException.class)
    @ResponseStatus(code = HttpStatus.OK)
    public ApiResponseEntity<String> logicException(LogicException e) {
        logger.error("遇到业务逻辑异常：【{}】", e.getErrCode());
        // 返回响应实体内容
        return ApiResponseEntity.<String>builder().errorMsg(e.getErrMsg()).errorCode(e.getErrCode()).build();
    }
}