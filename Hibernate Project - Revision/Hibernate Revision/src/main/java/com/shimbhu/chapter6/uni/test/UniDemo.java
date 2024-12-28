package com.shimbhu.chapter6.uni.test;


import com.shimbhu.chapter6.uni.model.UniCar6;
import com.shimbhu.chapter6.uni.model.UniPerson6;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class UniDemo {

    private static final Logger log = Logger.getLogger(UniDemo.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of uniPerson6 and car into hibernate.cfg.xml file

        UniPerson6 uniPerson6 = new UniPerson6();

        uniPerson6.setName("Shimbhu Kumawat");
        uniPerson6.setCity("Jaipur");

        UniCar6 car = new UniCar6();
        car.setCarNumber("1234-568");
        car.setCarCompany("TATA Motors");
        car.setPerson(uniPerson6);

        UniCar6 car2 = new UniCar6();
        car2.setCarNumber("838-568");
        car2.setCarCompany("Mahindra Motors");
        car2.setPerson(uniPerson6);

//        List<UniCar6> cars = new ArrayList<>();
//
//        cars.add(car);
//        cars.add(car2);

//        uniPerson6.setCars(cars);

        Transaction transaction = session.beginTransaction();

        // it won't insert data into the car table because we are using many to from car side
        session.persist(uniPerson6); // we are using cascadeType.ALL which automatically inserts the child database
        session.persist(car);
        session.persist(car2);

        transaction.commit();

        System.out.println("Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
