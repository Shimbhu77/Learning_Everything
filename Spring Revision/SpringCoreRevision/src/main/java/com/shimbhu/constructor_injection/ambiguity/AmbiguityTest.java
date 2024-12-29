package com.shimbhu.constructor_injection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjectionAmbiguityConfiguration.xml");
        Addition addition = applicationContext.getBean("addition",Addition.class);
        System.out.println(addition);
    }
}
