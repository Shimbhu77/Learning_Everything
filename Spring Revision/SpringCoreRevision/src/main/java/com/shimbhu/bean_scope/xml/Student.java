package com.shimbhu.bean_scope.xml;

public class Student {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set name is called.");
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        System.out.println("set age is called.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
