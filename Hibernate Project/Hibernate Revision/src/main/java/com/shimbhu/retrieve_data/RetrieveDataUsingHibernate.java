package com.shimbhu.retrieve_data;


import com.shimbhu.model.Gems;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RetrieveDataUsingHibernate {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // no need to start transaction because we are just reading the data not performing create,update,delete operations
        // using transaction reading is good recommended approach
        // using get method to retrieve data

        Gems gems = session.get(Gems.class, 3);
        Gems gems2 = session.get(Gems.class, 3);
        System.out.println(gems);
        System.out.println(gems2);

        // using load method to retrieve data before hibernate 6.0 version
        // after hibernate 6.0 version load is replaced by getReference()

        Gems gemsDetails = session.getReference(Gems.class,1);

        System.out.println(gemsDetails);

        session.close();

        sessionFactory.close();

        System.out.println("database disconnected successfully.");

    }
}
