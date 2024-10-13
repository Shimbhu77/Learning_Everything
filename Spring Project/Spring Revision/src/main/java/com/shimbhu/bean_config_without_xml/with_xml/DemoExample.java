package com.shimbhu.bean_config_without_xml.with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("componentDemo.xml");

        MahaRaja mahaRaja = context.getBean("mahaRaja", MahaRaja.class);

        System.out.println(mahaRaja);
    }
}
