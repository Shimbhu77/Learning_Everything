package com.shimbhu.init_destroy_lifecycle_method;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMethodTest {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("initDestroyLifecycleMethodConfiguration.xml");

        University university = context.getBean("university", University.class);

        System.out.println(university);

        // this will register call of the destroy method of lifecycle
        context.registerShutdownHook();

        Company company = context.getBean("company", Company.class);

        System.out.println(company);

        Car car = context.getBean("car", Car.class);

        System.out.println(car);
    }
}
