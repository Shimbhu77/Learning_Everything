package hibernate_util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Objects;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (Objects.isNull(sessionFactory)) {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
            System.out.println("database connected successfully.");
        } else {
            System.out.println("database already connected.");
        }

        return sessionFactory;
    }
}
