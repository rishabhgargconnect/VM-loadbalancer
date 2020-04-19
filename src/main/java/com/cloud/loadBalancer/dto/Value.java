package com.cloud.loadBalancer.dto;
import lombok.Data;

@Data
public class Value {
    private String value;

    public Value(String value) {
        this.value = value;
    }

}
