package com.shimbhu.example;

import com.shimbhu.dao.PersonDAO;
import com.shimbhu.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("dataSource.xml");

        PersonDAO personDAO = context.getBean("personDao",PersonDAO.class);

//        Person person = new Person();
//        person.setId(2);
//        person.setName("Payal Kumawat");
//        person.setGender("Female");
//        person.setCity("Jaipur");
//
//        int numberOfRowsAffected = personDAO.insert(person);
////
//        System.out.println("new rows inserted : "+numberOfRowsAffected);

     /*   Person person = new Person();
        person.setId(7);
        person.setName("Shimbhu Kumawat");
        person.setGender("Male");
        person.setCity("Jaipur");

        int numberOfRowsAffected = personDAO.insert(person);
//
        System.out.println("new rows inserted : "+numberOfRowsAffected);*/

//        Person person = new Person();
//        person.setId(1);
//        person.setName("Payal");
//        person.setCity("Chomu, Jaipur");
//
//        int numberOfRowsAffected = personDAO.update(person);
//
//        System.out.println(" rows updated : "+numberOfRowsAffected);


//        int numberOfRowsAffected = personDAO.delete(1);
//
//        System.out.println(" rows deleted : "+numberOfRowsAffected);

       /* Person person1 = personDAO.findById(2);

        System.out.println(" person object  : "+person1);*/

        List<Person> all = personDAO.findAll();

//        all.forEach(person -> System.out.println(person));
        all.forEach(System.out::println);


    }
}
