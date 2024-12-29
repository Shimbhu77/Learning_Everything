package com.shimbhu.auto_wiring.annotation;


import org.springframework.beans.factory.annotation.Autowired;

public class Fort {

    private String name;

    @Autowired // it will use Field Injection using Java Reflection APIs
    private Location location;

    //@Autowired // here it Fort one arg constructor is called, and it will use constructor Injection method
    public Fort(Location location) {
        this.location = location;
        System.out.println("fort one arg constructor called.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set name called in fort.");
    }

    public Location getLocation() {
        return location;
    }

    //@Autowired // here Set Location is called, and it will use Setter Injection method
    public void setLocation(Location location) {
        this.location = location;

        System.out.println("set location called in fort.");
    }

    public Fort(String name, Location location) {
        this.name = name;
        this.location = location;

        System.out.println("fort all arg constructor called.");
    }

    public Fort() {
        System.out.println("fort zero arg constructor called.");
    }

    @Override
    public String toString() {
        return "Fort{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
