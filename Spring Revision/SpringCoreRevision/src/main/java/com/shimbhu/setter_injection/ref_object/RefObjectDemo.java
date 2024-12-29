package com.shimbhu.setter_injection.ref_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefObjectDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjectionForRefObjectConfiguration.xml");
        SDE sde = applicationContext.getBean("sde", SDE.class);
        System.out.println(sde);

    }
}
