package com.shimbhu.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionExample {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterApplicationContext.xml");

        Person person1 = (Person) applicationContext.getBean("person1");
        Person person2 = (Person) applicationContext.getBean("person2");

        System.out.println(person1);
        System.out.println(person2);
    }
}
