package com.shimbhu.chapter5.bi.mapped_by.test;


import com.shimbhu.chapter5.bi.mapped_by.model.BiAadhar5MappedBy;
import com.shimbhu.chapter5.bi.mapped_by.model.BiPerson5MappedBy;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.logging.Logger;


public class BiMappedByDemo {

    private static final Logger log = Logger.getLogger(BiMappedByDemo.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of biPerson5MappedBy and biAadhar5MappedBy into hibernate.cfg.xml file

        BiPerson5MappedBy biPerson5MappedBy = new BiPerson5MappedBy();

        biPerson5MappedBy.setName("Shimbhu Kumawat");
        biPerson5MappedBy.setCity("Jaipur");

        BiAadhar5MappedBy biAadhar5MappedBy = new BiAadhar5MappedBy();
        biAadhar5MappedBy.setAadharNumber("1234-568");
        biPerson5MappedBy.setAadhar(biAadhar5MappedBy);

        Transaction transaction = session.beginTransaction();

        session.persist(biPerson5MappedBy); // we are using cascadeType.ALL which automatically inserts the child database

        transaction.commit();

        System.out.println("Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
