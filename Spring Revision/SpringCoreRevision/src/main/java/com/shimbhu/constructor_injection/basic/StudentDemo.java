package com.shimbhu.constructor_injection.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionBasicConfiguration.xml");

        Student student = applicationContext.getBean("student", Student.class);

        System.out.println(student);
    }
}
