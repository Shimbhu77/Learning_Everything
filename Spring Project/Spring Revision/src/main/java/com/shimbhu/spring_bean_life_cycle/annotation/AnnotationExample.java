package com.shimbhu.spring_bean_life_cycle.annotation;

import com.shimbhu.spring_bean_life_cycle.using_interface.Waterfall;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExample {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springBeanLifeCycle.xml");

        Valley valley = (Valley) context.getBean("valley");

        context.registerShutdownHook();

        System.out.println(valley);
    }
}
