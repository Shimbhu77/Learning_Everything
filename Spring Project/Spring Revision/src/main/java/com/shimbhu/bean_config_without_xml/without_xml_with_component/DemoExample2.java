package com.shimbhu.bean_config_without_xml.without_xml_with_component;

import com.shimbhu.bean_config_without_xml.with_xml.MahaRaja;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoExample2 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Raja raja = context.getBean("raja", Raja.class);

        System.out.println(raja);
    }
}
