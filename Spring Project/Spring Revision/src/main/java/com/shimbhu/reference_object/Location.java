package com.shimbhu.reference_object;

public class Location {
    private String country;
    private String city;

    public Location(String country, String city) {
        System.out.println("location parameterized constructor called");
        this.country = country;
        this.city = city;
    }

    public Location(){
        System.out.println("location default constructor called.");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
