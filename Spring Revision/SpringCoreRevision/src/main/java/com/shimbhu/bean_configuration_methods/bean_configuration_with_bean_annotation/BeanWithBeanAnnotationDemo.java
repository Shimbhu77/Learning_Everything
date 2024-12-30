package com.shimbhu.bean_configuration_methods.bean_configuration_with_bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanWithBeanAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Home home = applicationContext.getBean("payalAbroadHome", Home.class);
        System.out.println(home);
    }
}
