package com.shimbhu.bean_configuration_methods.bean_without_xml_with_component_and_component_scan_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Home home = applicationContext.getBean("payalMansion", Home.class);
        System.out.println(home);
    }
}