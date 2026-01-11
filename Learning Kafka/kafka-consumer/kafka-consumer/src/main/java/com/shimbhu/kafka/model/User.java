package com.shimbhu.kafka.model;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String name;
    private String city;
    private String education;
}
