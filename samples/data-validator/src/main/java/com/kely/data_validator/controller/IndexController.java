package com.kely.data_validator.controller;

import com.kely.data_validator.entity.DemoEntity;
import com.kely.framework.web.BaseController;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@Validated
@RestController
@RequestMapping("index/")
public class IndexController extends BaseController {

//    @Autowired
//    private MessageSource messageSource;

    /**
     * 实体参数校验
     *
     * @param entity
     * @return
     */
    @GetMapping(value = "validator")
    public String validator(@ModelAttribute @Validated DemoEntity entity) {
        if (entity.getAge() == 1) {
            throw new RuntimeException();
        }
        return "验证通过，" + "名称：" + entity.getName() + "年龄：" + entity.getAge() + "邮箱地址：" + entity.getMail();
    }

    /**
     * 全局异常
     *
     * @return
     */
    @GetMapping(value = "get")
    public String get() {
        int i = 1 / 0;
        System.out.println(i);
        return "success";
    }

    /**
     * 方法级参数校验
     *
     * @param name
     * @param age
     * @return
     */
    @GetMapping(value = "save")
    public String save(@RequestParam @Length(min = 1, max = 3, message = "name长度应该在1到3之间") String name, @RequestParam @Min(value = 1, message = "age最小值1") int age) {
        return "success";
    }

//    @RequestMapping(value = "/validator")
//    public String validator(@Valid DemoEntity entity, BindingResult result) {
//        if (result.hasErrors()) {
//            StringBuffer msg = new StringBuffer();
//            //获取错误字段集合
//            List<FieldError> fieldErrors = result.getFieldErrors();
//            //获取本地locale,zh_CN
//            Locale currentLocale = LocaleContextHolder.getLocale();
//            //遍历错误字段获取错误消息
//            for (FieldError fieldError :
//                    fieldErrors) {
//                //获取错误信息
//                String errorMessage = messageSource.getMessage(fieldError, currentLocale);
//                //添加到错误消息集合内
//                msg.append(fieldError.getField() + "：" + errorMessage + " , ");
//            }
//            return msg.toString();
//        }
//        return "验证通过，" + "名称：" + entity.getName() + "年龄：" + entity.getAge() + "邮箱地址：" + entity.getMail();
//    }
}