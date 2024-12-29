package com.shimbhu.auto_wiring.annotation;

public class Location {
    private String city;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("set state called in location.");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

        System.out.println("set city called in location.");
    }

    public Location(String city, String state) {
        this.city = city;
        this.state = state;

        System.out.println("location all arg constructor called.");
    }

    public Location() {
        System.out.println("location zero arg constructor called.");
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
