package com.shimbhu.model;

public class Person {
    private Integer id;
    private String name;
    private String gender;
    private String city;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person() {
        System.out.println("zero arg called.");
    }

    public Person(Integer id, String name, String gender, String city) {

        System.out.println("parameterized arg called.");

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.city = city;
    }
}
