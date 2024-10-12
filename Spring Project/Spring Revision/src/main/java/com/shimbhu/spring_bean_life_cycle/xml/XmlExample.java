package com.shimbhu.spring_bean_life_cycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlExample {

    public static void main(String[] args) {

        // it will automatically call the init method but not the destroy method
//        ApplicationContext context = new ClassPathXmlApplicationContext("springBeanLifeCycle.xml");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springBeanLifeCycle.xml");

        Journey journey = (Journey) context.getBean("jpToSh");

        System.out.println(journey);

        context.registerShutdownHook();

    }

}
