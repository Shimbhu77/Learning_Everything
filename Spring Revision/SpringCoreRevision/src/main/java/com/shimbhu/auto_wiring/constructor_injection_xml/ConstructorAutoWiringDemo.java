package com.shimbhu.auto_wiring.constructor_injection_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorAutoWiringDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionAutoWiringConfiguration.xml");
        Fort fort1 = applicationContext.getBean("fort1", Fort.class);
        System.out.println(fort1);
    }
}
