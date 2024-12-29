package com.shimbhu.auto_wiring.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAutoWiringDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjectionAutoWiringConfiguration.xml");
        Fort fort1 = applicationContext.getBean("fort1", Fort.class);
        System.out.println(fort1);
    }
}
