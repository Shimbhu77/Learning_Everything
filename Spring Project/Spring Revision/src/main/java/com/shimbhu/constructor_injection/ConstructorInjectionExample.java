package com.shimbhu.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("constructorApplicationContext.xml");

        Book book1 = (Book) context.getBean("book1");
        Book book2 = (Book) context.getBean("book2");

        System.out.println(book1);
        System.out.println(book2);

    }
}
