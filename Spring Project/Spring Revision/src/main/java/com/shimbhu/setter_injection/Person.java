package com.shimbhu.setter_injection;


public class Person {

    private String name;
    private Integer age;
    private String city;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set name called.");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("set age called.");
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("set city called.");
        this.city = city;
    }
}
