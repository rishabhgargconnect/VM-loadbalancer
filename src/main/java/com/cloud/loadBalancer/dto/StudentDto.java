package com.cloud.loadBalancer.dto;

import lombok.Data;

@Data
public class StudentDto {
    private String name;
    private int age;

    public StudentDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
