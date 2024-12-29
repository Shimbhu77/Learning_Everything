package com.shimbhu.component_annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Data
@Component // we can change object name using this : @Component("st"), now it will create object using st name
public class Student {

    @Value("Shimbhu Kumawat")
    private String name;

    @Value("22") // it is also using Reflection API similar to Field Injection
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
