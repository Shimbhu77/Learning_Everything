package com.shimbhu.spring_bean_life_cycle.xml;

public class Journey {

    private String start;
    private String destination;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public void init()
    {
        System.out.println("I am starting my journey from : "+start);
    }

    public void destroy()
    {
        System.out.println("I am ending my journey in : "+destination);
    }
}
