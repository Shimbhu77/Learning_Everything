package com.shimbhu.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Researcher {

    private String name;

    // field injection it won't call any setter and constructor to inject the values
    // @Autowired
    private Thesis thesis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Thesis getThesis() {
        return thesis;
    }

    // setter injection it will call the setter methods
    // @Autowired
    public void setThesis(Thesis thesis) {
        System.out.println("Setting the thesis values.");
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "Researcher{" +
                "name='" + name + '\'' +
                ", thesis=" + thesis +
                '}';
    }

    public Researcher() {
        System.out.println("Researcher Zero Argument constructor is called.");
    }

    public Researcher(String name, Thesis thesis) {

        System.out.println("Researcher Parameterized constructor is called.");

        this.name = name;
        this.thesis = thesis;
    }

    // Constructor injection it will call researcher class constructor
    @Autowired
    public Researcher(Thesis thesis) {
        System.out.println("Researcher only thesis constructor is called.");
        this.thesis = thesis;
    }
}
