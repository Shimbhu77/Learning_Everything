package com.shimbhu.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("scopeAnnotation.xml");

        Desert desert1 = context.getBean("desert", Desert.class);
        Desert desert2 = context.getBean("desert", Desert.class);

        System.out.println(desert1.hashCode());
        System.out.println(desert2.hashCode());

    }
}
