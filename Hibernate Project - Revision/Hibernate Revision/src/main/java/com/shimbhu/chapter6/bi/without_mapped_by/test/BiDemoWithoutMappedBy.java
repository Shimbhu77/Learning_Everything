package com.shimbhu.chapter6.bi.without_mapped_by.test;


import com.shimbhu.chapter6.bi.without_mapped_by.model.BiCar6WithoutMappedBy;
import com.shimbhu.chapter6.bi.without_mapped_by.model.BiPerson6WithoutMappedBy;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class BiDemoWithoutMappedBy {

    private static final Logger log = Logger.getLogger(BiDemoWithoutMappedBy.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of biPerson6WithoutMappedBy and car into hibernate.cfg.xml file

        BiPerson6WithoutMappedBy biPerson6WithoutMappedBy = new BiPerson6WithoutMappedBy();

        biPerson6WithoutMappedBy.setName("Shimbhu Kumawat");
        biPerson6WithoutMappedBy.setCity("Jaipur");

        BiCar6WithoutMappedBy car = new BiCar6WithoutMappedBy();
        car.setCarNumber("1234-568");
        car.setCarCompany("TATA Motors");
        car.setPerson(biPerson6WithoutMappedBy);

        BiCar6WithoutMappedBy car2 = new BiCar6WithoutMappedBy();
        car2.setCarNumber("838-568");
        car2.setCarCompany("Mahindra Motors");
        car2.setPerson(biPerson6WithoutMappedBy);

        List<BiCar6WithoutMappedBy> cars = new ArrayList<>();

        cars.add(car);
        cars.add(car2);

        biPerson6WithoutMappedBy.setCars(cars);

        Transaction transaction = session.beginTransaction();

        // it won't insert data into the car table because we are using many to from car side
        session.persist(biPerson6WithoutMappedBy); // we are using cascadeType.ALL which automatically inserts the child database
        /*session.persist(car);
        session.persist(car2);*/

        transaction.commit();

        System.out.println("Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
