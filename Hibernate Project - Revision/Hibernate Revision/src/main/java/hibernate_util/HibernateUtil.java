package hibernate_util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Objects;


/**
 * HibernateUtil class to provide a singleton SessionFactory instance for database operations.
 * This utility ensures that a single SessionFactory instance is created and shared across the application.
 */
public class HibernateUtil {

    // Singleton instance of SessionFactory
    private static SessionFactory sessionFactory;

    /**
     * Provides the SessionFactory instance. Creates it lazily if it doesn't already exist.
     *
     * @return SessionFactory instance for database interactions.
     */
    public static SessionFactory getSessionFactory() {

        // Check if the SessionFactory is null (not yet initialized)
        if (Objects.isNull(sessionFactory)) {
            // Create a Configuration object to configure Hibernate
            Configuration configuration = new Configuration();
            System.out.println("Configuration object is created.");

            // Load settings and mappings from hibernate.cfg.xml
            configuration.configure();
            System.out.println("Hibernate configuration file is processed.");

            // Build the SessionFactory using the configured settings
            sessionFactory = configuration.buildSessionFactory();
            System.out.println("SessionFactory created, database connected successfully.");
        } else {
            // If the SessionFactory already exists, skip reinitialization
            System.out.println("SessionFactory already initialized, database already connected.");
        }

        // Return the singleton SessionFactory instance
        return sessionFactory;
    }
}
