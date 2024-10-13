package com.shimbhu.component_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("componentAnnotation.xml");

        Temple temple = context.getBean("temple", Temple.class);
        Temple temple2 = context.getBean("temple", Temple.class);

        System.out.println(temple);
        System.out.println(temple.getCities());

        System.out.println(temple2);
        System.out.println(temple2.getCities());

        System.out.println(temple.hashCode());
        System.out.println(temple2.hashCode());
    }
}
