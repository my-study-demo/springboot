package com.kely.data_validator.anntation;

import com.kely.data_validator.validator.FlagValidatorClass;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = FlagValidatorClass.class) //里面传入了一个validatedBy的字段，这个就是我们自定义注解的实现类的类型
public @interface FlagValidator
{
    //flag的有效值多个使用','隔开
    String values();
    //提示内容
    String message() default "flag不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}