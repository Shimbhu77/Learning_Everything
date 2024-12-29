package com.shimbhu.setter_injection.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjectionForCollections.xml");
        Person person = applicationContext.getBean("person1", Person.class);
        System.out.println(person);
    }
}
