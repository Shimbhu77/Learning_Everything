package com.shimbhu.component_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentAnnotationDemo {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("componentAnnotationConfiguration.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
