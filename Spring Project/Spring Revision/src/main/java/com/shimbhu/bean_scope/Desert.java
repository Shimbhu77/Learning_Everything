package com.shimbhu.bean_scope;

public class Desert {

    private String desertName;
    private String country;

    public String getDesertName() {
        return desertName;
    }

    public void setDesertName(String desertName) {
        this.desertName = desertName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "desertName='" + desertName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
