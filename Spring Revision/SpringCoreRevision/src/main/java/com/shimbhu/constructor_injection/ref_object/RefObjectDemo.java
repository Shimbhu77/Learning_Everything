package com.shimbhu.constructor_injection.ref_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefObjectDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionForRefObjectConfiguration.xml");
        SDE sde = applicationContext.getBean("sde1", SDE.class);
        System.out.println(sde);

    }
}
