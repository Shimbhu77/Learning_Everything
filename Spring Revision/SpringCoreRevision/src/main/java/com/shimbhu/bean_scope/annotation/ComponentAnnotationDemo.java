package com.shimbhu.bean_scope.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentAnnotationDemo {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("componentAnnotationWithScopeConfiguration.xml");
        Student student1 = applicationContext.getBean("student", Student.class);
        Student student2 = applicationContext.getBean("student", Student.class);
        System.out.println(student1);

        // by default singleton scope which means we get the same object each time from spring container
        // other prototype means each time spring container create new object
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
