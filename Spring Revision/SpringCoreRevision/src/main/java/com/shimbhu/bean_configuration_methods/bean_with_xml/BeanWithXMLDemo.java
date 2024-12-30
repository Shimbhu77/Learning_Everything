package com.shimbhu.bean_configuration_methods.bean_with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWithXMLDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-with-xml.xml");
        Home home = applicationContext.getBean("home", Home.class);
        System.out.println(home);
    }
}
