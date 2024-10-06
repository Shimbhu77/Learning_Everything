package com.shimbhu.model.embeddable_objects.saving_data;

import com.shimbhu.model.embeddable_objects.TouristPlace;
import com.shimbhu.model.embeddable_objects.TouristPlaceLocation;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PersistData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        TouristPlace touristPlace = getTouristPlace();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(touristPlace);

        transaction.commit();

        session.close();

        sessionFactory.close();

        System.out.println("database disconnected successfully.");
    }

    private static TouristPlace getTouristPlace() {

        TouristPlace touristPlace = new TouristPlace();

        touristPlace.setName("Gaumukh Tapovan Trek");
        touristPlace.setDescription("The Gaumukh Tapovan trek begins from Gangotri. Gaumukh or Gomukh means Cow's Mouth. This is the place where Bhagirathi river originates from. Tapovan is a meadow situated above a glacier which is few kilometers from Gaumukh.");

        TouristPlaceLocation touristPlaceLocation = new TouristPlaceLocation();
        touristPlaceLocation.setCityName("Gangotri");
        touristPlaceLocation.setStateName("Uttarakhand");

        touristPlace.setTouristPlaceLocation(touristPlaceLocation);

        return touristPlace;
    }
}
