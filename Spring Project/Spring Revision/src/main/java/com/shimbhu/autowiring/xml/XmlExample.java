package com.shimbhu.autowiring.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springAutowiring.xml");

//        Researcher researcher1 = context.getBean("researcher1", Researcher.class);
//        Researcher researcher2 = context.getBean("researcher2", Researcher.class);
        Researcher researcher3 = context.getBean("researcher3", Researcher.class);

//        System.out.println(researcher1);
//        System.out.println(researcher2);
        System.out.println(researcher3);
    }
}
