package com.shimbhu.example;

import com.shimbhu.configuration.JdbcConfig;
import com.shimbhu.dao.PersonDAO;
import com.shimbhu.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DemoWithAnnotationConfiguration {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        PersonDAO personDAO = context.getBean("personDaoBean",PersonDAO.class);

        List<Person> personList = personDAO.findAll();

        personList.forEach(person -> System.out.println(person));

    }
}
