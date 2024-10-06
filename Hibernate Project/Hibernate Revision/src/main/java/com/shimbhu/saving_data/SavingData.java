package com.shimbhu.saving_data;

import com.shimbhu.model.Gems;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SavingData {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // opening a new session

        Session session = sessionFactory.openSession();

        Transaction transaction = null;

        transaction = session.beginTransaction();

        Gems gems = new Gems();

//        gems.setPlaceName("Valley of Flowers");
//        gems.setDescription("This valley contains 4500+ types of flowers and provide beautiful nature views.");
//        gems.setCity("Dehradun");
//        gems.setState("Uttarakhand");

        gems.setPlaceName("Kedarkantha");
        gems.setDescription("Kedarkantha is a popular trekking destination in Uttarakhand, known for its stunning views of snow-capped peaks and vibrant rhododendron forests. It offers a unique blend of adventure and natural beauty, attracting trekkers and nature enthusiasts alike.");
        gems.setCity("Sankri");
        gems.setState("Uttarakhand");

        // before hibernate 6.0 version using save method
        // after hibernate 6.0 version using save method is replaced by persist method

        session.persist(gems);

        transaction.commit();

        System.out.println("data inserted successfully.");

        session.close();

        sessionFactory.close();

    }
}