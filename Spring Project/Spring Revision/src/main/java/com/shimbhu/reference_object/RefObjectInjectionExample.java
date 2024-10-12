package com.shimbhu.reference_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefObjectInjectionExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("referenceApplicationContext.xml");

        Fort amberFort = (Fort) context.getBean("amberFort");
        Fort redFort = (Fort) context.getBean("redFort");

        System.out.println(amberFort);
        System.out.println(redFort);
    }
}
