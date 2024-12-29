package com.shimbhu.init_destroy_lifecycle_method;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;

@Data
public class Car {

    private String car;
    private String companyName;

    @PostConstruct
    public void init()
    {
        System.out.println("calling the init method using annotation.");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("calling the init method using annotation.");
    }
}
