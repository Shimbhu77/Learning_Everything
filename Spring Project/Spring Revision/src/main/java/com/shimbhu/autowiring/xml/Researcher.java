package com.shimbhu.autowiring.xml;

public class Researcher {

    private String name;
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

    public void setThesis(Thesis thesis) {
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

    public Researcher(Thesis thesis) {
        System.out.println("thesis only constructor is called.");
        this.thesis = thesis;
    }
}
