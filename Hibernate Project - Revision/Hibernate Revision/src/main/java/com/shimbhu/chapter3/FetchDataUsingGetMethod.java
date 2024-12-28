package com.shimbhu.chapter3;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * FetchDataUsingGetMethod demonstrates how to retrieve data from the database using Hibernate's `get` method.
 */
public class FetchDataUsingGetMethod {

    public static void main(String[] args) {

        // Obtain the SessionFactory instance from HibernateUtil.
        // The SessionFactory is a heavyweight object and should be reused throughout the application.
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Open a new session from the SessionFactory.
        // A session is used to interact with the database.
        Session session = sessionFactory.openSession();

        // Note: A transaction is not required when fetching (reading) data from the database.
        // The `get` method is used to fetch an object by its primary key.

        // Fetch the Student object with primary key value 1.
        // The `get` method returns null if the object is not found in the database.
        Student student = session.get(Student.class, 1);

        // Print the fetched student object.
        // If the object is null (not found), this will print "null".
        System.out.println(student);

        // Demonstrate Hibernate's first-level caching:
        // The `get` method will not execute a new query for the same primary key within the same session.
        // Uncomment to test caching behavior:
        Student cachedStudent = session.get(Student.class, 1); // No query will be fired for this line.
        System.out.println(cachedStudent);

        // Close the session to release resources.
        // Always close the session after use to prevent resource leaks.
        session.close();

        // Close the SessionFactory to clean up resources.
        // Typically, this is done when the application shuts down.
        sessionFactory.close();
    }
}
