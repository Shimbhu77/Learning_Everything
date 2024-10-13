package com.shimbhu.spring_expression_language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Something {

    @Value("#{7+11+16}")
    private String x;

    @Value("#{77+57}")
    private String s;

    // calling static methods : T(fully qualified class name).methodName(parameters)
    @Value("#{T(java.lang.Math).sqrt(256)}")
    private double squareRoot;

    // calling static variables :  T(fully qualified class name).variableName
    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    // creating objects : new fully qualified className(parameters)
    @Value("#{new com.shimbhu.spring_expression_language.Person('Shimbhu Kumawat')}")
    private Person person;

    @Value("#{16>11}")
    private boolean isGreater;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public double getSquareRoot() {
        return squareRoot;
    }

    public void setSquareRoot(double squareRoot) {
        this.squareRoot = squareRoot;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public boolean isGreater() {
        return isGreater;
    }

    public void setGreater(boolean greater) {
        isGreater = greater;
    }

    @Override
    public String toString() {
        return "Something{" +
                "x='" + x + '\'' +
                ", s='" + s + '\'' +
                ", squareRoot=" + squareRoot +
                ", pi=" + pi +
                ", person=" + person +
                ", isGreater=" + isGreater +
                '}';
    }
}
