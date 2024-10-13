package com.shimbhu.component_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component("student1") now we can use student1 as bean class name while fetching object in application context.
@Component
public class Temple {

    @Value("Kedarnath")
    private String templeName;

    @Value("Uttarakhand")
    private String location;

    @Value("#{cities}")
    private List<String> cities;


    public String getTempleName() {
        return templeName;
    }

    public void setTempleName(String templeName) {
        this.templeName = templeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "templeName='" + templeName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
