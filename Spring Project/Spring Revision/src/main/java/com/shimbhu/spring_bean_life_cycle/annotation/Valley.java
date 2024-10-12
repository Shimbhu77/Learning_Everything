package com.shimbhu.spring_bean_life_cycle.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Valley {

    private String valleyName;
    private String location;

    public String getValleyName() {
        return valleyName;
    }

    public void setValleyName(String valleyName) {
        this.valleyName = valleyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Valley{" +
                "valleyName='" + valleyName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Start exploring the valley of : "+valleyName);
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("End exploring the valley of : "+valleyName);
    }
}
