package com.shimbhu.example;

import com.shimbhu.dao.PersonDAO;
import com.shimbhu.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("dataSource.xml");

        PersonDAO personDAO = context.getBean("personDao",PersonDAO.class);

        Person person = new Person();
        person.setId(1);
        person.setName("Payal Kumawat");
        person.setGender("Female");
        person.setCity("Jaipur");

        int numberOfRowsAffected = personDAO.insert(person);

        System.out.println("new rows inserted : "+numberOfRowsAffected);

    }
}
