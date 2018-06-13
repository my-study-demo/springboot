package com.kely.exception.handle.demo.example.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private String name;
    private int age;
}
