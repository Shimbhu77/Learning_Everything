package com.shimbhu.model.one_to_one_mapping;

import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CRUDOperations {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Husband husband = new Husband();
        husband.setFullName("Virat Kohli");
        husband.setAge(35);
        husband.setOccupation("Cricketer");
        husband.setCity("Delhi");

        Wife wife = new Wife();
        wife.setFullName("Anushka Sharma");
        wife.setAge(34);
        wife.setCity("Mumbai");
        wife.setOccupation("Actress");

        husband.setWife(wife);

        wife.setHusband(husband);

        saveHusbandData(husband,wife,sessionFactory);

        sessionFactory.close();

        System.out.println("database disconnected successfully.");

    }


    public static void saveHusbandData(Husband husband, Wife wife, SessionFactory sessionFactory)
    {
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // it will store first wife data than later wife id is stored in husband table correctly
        session.persist(wife);
        session.persist(husband);

        /*
          it will store wife id is NULL because it is first storing the husband and later wife data.
          when storing husband data it does not have reference of wife id

          session.persist(husband);
          session.persist(wife);
        */

        session.close();

        System.out.println("Husband data saved successfully.");

    }

    public static void saveWifeData(Husband husband, Wife wife, SessionFactory sessionFactory)
    {
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(husband);
        session.persist(wife);

        session.close();

        System.out.println("Wife data saved successfully.");
    }

}
