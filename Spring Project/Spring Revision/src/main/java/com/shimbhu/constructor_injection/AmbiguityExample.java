package com.shimbhu.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("constructorApplicationContext.xml");

        Addition addition = (Addition) context.getBean("addition");

        addition.doSum();
    }
}
