package com.shimbhu.auto_wiring.annotation;


public class Fort {
    private String name;
    private Location location;

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
