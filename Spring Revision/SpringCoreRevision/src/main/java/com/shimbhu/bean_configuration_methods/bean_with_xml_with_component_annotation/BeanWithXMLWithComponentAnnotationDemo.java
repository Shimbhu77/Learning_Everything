package com.shimbhu.bean_configuration_methods.bean_with_xml_with_component_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWithXMLWithComponentAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-with-xml-with-component-annotation.xml");
        Home home = applicationContext.getBean("house", Home.class);
        System.out.println(home);
    }
}
