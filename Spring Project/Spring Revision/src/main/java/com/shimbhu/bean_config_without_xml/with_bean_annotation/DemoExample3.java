package com.shimbhu.bean_config_without_xml.with_bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoExample3 {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        MahaRani mahaRani = context.getBean("maharani", MahaRani.class);

        System.out.println(mahaRani);
    }
}
