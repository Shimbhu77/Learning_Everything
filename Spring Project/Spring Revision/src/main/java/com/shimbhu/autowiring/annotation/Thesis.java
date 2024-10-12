package com.shimbhu.autowiring.annotation;

public class Thesis {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thesis(String title, String description) {
        System.out.println("Thesis parameterized constructor is called.");
        this.title = title;
        this.description = description;
    }

    public Thesis() {
        System.out.println("Thesis zero arg constructor is called.");
    }

    @Override
    public String toString() {
        return "Thesis{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
