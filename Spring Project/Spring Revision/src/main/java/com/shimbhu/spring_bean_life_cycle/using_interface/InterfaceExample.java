package com.shimbhu.spring_bean_life_cycle.using_interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfaceExample {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springBeanLifeCycle.xml");

        Waterfall waterfall = (Waterfall) context.getBean("waterfall");

        context.registerShutdownHook();

        System.out.println(waterfall);
    }
}
