package com.shimbhu.init_destroy_lifecycle_method;

import lombok.ToString;

@ToString
public class University {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setting the university name.");
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        System.out.println("setting the university location.");
        this.location = location;
    }

    public void init()
    {
        System.out.println("calling init life cycle method");
    }

    public void destroy()
    {
        System.out.println("calling destroy life cycle method");
    }

}
