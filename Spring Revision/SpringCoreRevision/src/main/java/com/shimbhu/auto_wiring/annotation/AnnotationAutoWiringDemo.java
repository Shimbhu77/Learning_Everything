package com.shimbhu.auto_wiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutoWiringDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionAutoWiringConfiguration.xml");
        Fort fort1 = applicationContext.getBean("fort1", Fort.class);
        System.out.println(fort1);
    }
}
