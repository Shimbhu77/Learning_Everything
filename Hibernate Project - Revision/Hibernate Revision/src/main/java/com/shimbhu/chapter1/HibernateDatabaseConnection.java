package com.shimbhu.chapter1;

import hibernate_util.HibernateUtil;
import org.hibernate.SessionFactory;

public class HibernateDatabaseConnection {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        System.out.println(sessionFactory);

        sessionFactory.close();
    }
}
