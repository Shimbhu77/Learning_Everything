package com.shimbhu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // opening a new session

        Session session = sessionFactory.openSession();

        Transaction transaction = null;

        transaction = session.beginTransaction();

        Gems gems = new Gems();
        gems.setPlaceName("Valley of Flowers");
        gems.setDescription("This valley contains 4500+ types of flowers and provide beautiful nature views.");
        gems.setCity("Dehradun");
        gems.setState("Uttarakhand");

        session.persist(gems);

        transaction.commit();

        System.out.println("data inserted successfully.");

        session.close();

        sessionFactory.close();

    }
}