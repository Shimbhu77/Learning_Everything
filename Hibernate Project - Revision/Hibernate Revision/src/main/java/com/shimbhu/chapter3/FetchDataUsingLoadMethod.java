package com.shimbhu.chapter3;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * FetchDataUsingLoadMethod demonstrates how to retrieve data using Hibernate's `load` method.
 * The `load` method uses lazy loading and returns a proxy object that is initialized when accessed.
 */
public class FetchDataUsingLoadMethod {

    public static void main(String[] args) {

        // Obtain the SessionFactory instance from HibernateUtil.
        // SessionFactory is a heavy object and should be reused throughout the application lifecycle for efficiency.
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Open a new session from the SessionFactory.
        // A session is used to interact with the database and represents a single unit of work (transaction).
        Session session = sessionFactory.openSession();

        // Note: A transaction is not needed for fetching (reading) data.
        // The `load` method returns a proxy object, which is lazily loaded (data fetched only when accessed).
        // If the object with the given primary key doesn't exist, `load` throws an ObjectNotFoundException when accessed.

        // Section A: Fetch the Student object with primary key 1 using the `load` method.
        // If the student with id 1 is not found, accessing its properties will throw an exception.
        Student student = session.load(Student.class, 1);

        // Print the fetched student object.
        // The query to the database will only be executed when the student object is accessed.
        System.out.println(student);

        // Section B: Lazy loading behavior.
        // If you call `load` with an id that is not found in the database, it won't throw an exception
        // until you try to access the object's properties. However, if not accessed, no exception is thrown.

        // Uncomment to test lazy loading with a non-existing student:
        // Student nonExistentStudent = session.load(Student.class, 10); // No exception yet, as it's lazily loaded.
        // System.out.println(nonExistentStudent); // This will throw ObjectNotFoundException when accessed if not found.

        // Section C: Hibernate's first-level cache demonstration.
        // The `load` method caches the object within the current session after the first retrieval.
        // If the same object is requested again within the same session, no new query will be executed.

        // Uncomment to observe first-level caching:
        Student cachedStudent = session.load(Student.class, 1); // No new query will be executed.
        System.out.println(cachedStudent);

        // Close the session to release database resources.
        // Always close the session after use to avoid memory leaks and ensure resources are properly cleaned up.
        session.close();

        // Close the SessionFactory to clean up resources.
        // Typically, this is done when the application is shutting down.
        sessionFactory.close();
    }
}
