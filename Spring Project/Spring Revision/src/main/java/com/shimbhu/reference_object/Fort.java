package com.shimbhu.reference_object;

public class Fort {
    private String name;
    private String builtBy;
    private Location location;

    public Fort(String name, String builtBy, Location location) {
        System.out.println("fort parameterized constructor called.");
        this.name = name;
        this.builtBy = builtBy;
        this.location = location;
    }

    public Fort(){
        System.out.println("fort default constructor called.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("fort set name called.");
        this.name = name;
    }

    public String getBuiltBy() {
        return builtBy;
    }

    public void setBuiltBy(String builtBy) {
        this.builtBy = builtBy;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Fort{" +
                "name='" + name + '\'' +
                ", builtBy='" + builtBy + '\'' +
                ", location=" + location +
                '}';
    }
}
