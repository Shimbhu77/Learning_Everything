package com.shimbhu.init_destroy_lifecycle_method;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMethodTest {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("initDestroyLifecycleMethodConfiguration.xml");

        University university = context.getBean("university", University.class);

        System.out.println(university);

        // this will call the destroy method of lifecycle
        context.registerShutdownHook();
    }
}
