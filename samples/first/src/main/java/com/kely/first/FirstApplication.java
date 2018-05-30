package com.kely.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstApplication {

    private static final Logger logger = LoggerFactory.getLogger(FirstApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FirstApplication.class, args);
    }

    @GetMapping
    public String hello(){
        logger.info("------>info");
        logger.debug("------->debug");
        logger.error("-------->error");
        return "hello world!";
    }
}
