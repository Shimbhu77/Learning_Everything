package com.shimbhu.chapter6.bi.mapped_by.test;


import com.shimbhu.chapter6.bi.mapped_by.model.BiCar6MappedBy;
import com.shimbhu.chapter6.bi.mapped_by.model.BiPerson6MappedBy;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class BiDemoMappedBy {

    private static final Logger log = Logger.getLogger(BiDemoMappedBy.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of biPerson6MappedBy and car into hibernate.cfg.xml file

        BiPerson6MappedBy biPerson6MappedBy = new BiPerson6MappedBy();

        biPerson6MappedBy.setName("Shimbhu Kumawat");
        biPerson6MappedBy.setCity("Jaipur");

        BiCar6MappedBy car = new BiCar6MappedBy();
        car.setCarNumber("1234-568");
        car.setCarCompany("TATA Motors");
        car.setPerson(biPerson6MappedBy);

        BiCar6MappedBy car2 = new BiCar6MappedBy();
        car2.setCarNumber("838-568");
        car2.setCarCompany("Mahindra Motors");
        car2.setPerson(biPerson6MappedBy);

        List<BiCar6MappedBy> cars = new ArrayList<>();

        cars.add(car);
        cars.add(car2);

        biPerson6MappedBy.setCars(cars);

        Transaction transaction = session.beginTransaction();

        // it won't insert data into the car table because we are using many to from car side
        session.persist(biPerson6MappedBy); // we are using cascadeType.ALL which automatically inserts the child database
        /*session.persist(car);
        session.persist(car2);*/

        transaction.commit();

        System.out.println("Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
