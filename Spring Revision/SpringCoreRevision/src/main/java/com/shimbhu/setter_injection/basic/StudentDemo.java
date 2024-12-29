package com.shimbhu.setter_injection.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjectionConfiguration.xml");

        Student student1 = applicationContext.getBean("student1", Student.class);

        System.out.println(student1);

        Student student2 = applicationContext.getBean("student2", Student.class);

        System.out.println(student2);
    }
}
