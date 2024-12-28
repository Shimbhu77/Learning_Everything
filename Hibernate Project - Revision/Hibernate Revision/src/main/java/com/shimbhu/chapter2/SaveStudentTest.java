package com.shimbhu.chapter2;

import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * SaveStudentTest demonstrates how to use Hibernate to persist an object (Student) into the database.
 */
public class SaveStudentTest {

    public static void main(String[] args) {

        // Get the SessionFactory instance from HibernateUtil.
        // This establishes the connection with the database when the application starts.
        // Creating a SessionFactory is expensive, and it is recommended to reuse it across the application lifecycle.
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Open a new session from the SessionFactory. A session is a single-threaded unit of work.
        Session session = sessionFactory.openSession();

        // Create a Student object and populate its fields with data.
        Student student = new Student();
        student.setId(1); // Set the student ID (primary key).
        student.setName("Shimbhu Kumawat"); // Set the student's name.
        student.setCity("Jaipur"); // Set the student's city.
        student.setCareer("Software Engineer"); // Set the student's career.

        // Note: Ensure that the Student class is mapped in the hibernate.cfg.xml file.
        // Without proper mapping, Hibernate will not recognize the Student entity.

        // Begin a transaction. Transactions are required for persisting data to the database.
        Transaction transaction = session.beginTransaction();

        // Save the Student object using the persist method (preferred over save in Hibernate 6.0+).
        session.persist(student);

        // Commit the transaction to apply changes to the database.
        transaction.commit();

        // Print a success message to indicate data has been inserted.
        System.out.println("Successfully inserted data into the student details table.");

        // Close the session to release resources. Always close the session after use.
        session.close();

        // Close the SessionFactory to clean up resources.
        // This is typically done when the application shuts down.
        sessionFactory.close();
    }
}
