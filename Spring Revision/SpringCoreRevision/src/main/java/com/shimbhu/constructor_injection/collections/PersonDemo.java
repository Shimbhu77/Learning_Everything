package com.shimbhu.constructor_injection.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionForCollections.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
