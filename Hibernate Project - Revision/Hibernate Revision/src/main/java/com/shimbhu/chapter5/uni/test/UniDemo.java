package com.shimbhu.chapter5.uni.test;


import com.shimbhu.chapter5.uni.model.UniAadhar5;
import com.shimbhu.chapter5.uni.model.UniPerson5;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.logging.Logger;


public class UniDemo {

    private static final Logger log = Logger.getLogger(UniDemo.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of uniPerson5 and uniAadhar5 into hibernate.cfg.xml file

        UniPerson5 uniPerson5 = new UniPerson5();

        uniPerson5.setName("Shimbhu Kumawat");
        uniPerson5.setCity("Jaipur");

        UniAadhar5 uniAadhar5 = new UniAadhar5();
        uniAadhar5.setAadharNumber("1234-568");
        uniPerson5.setUniAadhar5(uniAadhar5);

        Transaction transaction = session.beginTransaction();

        session.persist(uniPerson5); // we are using cascadeType.ALL which automatically inserts the child database

        transaction.commit();

        System.out.println("BiPerson5WithoutMappedBy saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
