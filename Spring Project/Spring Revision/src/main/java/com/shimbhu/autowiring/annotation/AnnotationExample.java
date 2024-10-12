package com.shimbhu.autowiring.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springAutowiringAnnotation.xml");

        Researcher researcher3 = context.getBean("researcher3", Researcher.class);

        System.out.println(researcher3);
    }
}
