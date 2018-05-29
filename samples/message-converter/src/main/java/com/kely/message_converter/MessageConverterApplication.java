package com.kely.message_converter;

import com.kely.message_converter.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: kely [email:yangqinghua39@163.com]
 * @date: 2018/5/29 22:33
 */
@RestController
@SpringBootApplication
public class MessageConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageConverterApplication.class,args);
    }

    @GetMapping
    public Student get(){
        Student stu = new Student();
        stu.setId(1L);
        stu.setBirthday(new Date());
        return stu;
    }
}
