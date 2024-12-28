package com.shimbhu.chapter5.bi.not_mapped_by.test;

import com.shimbhu.chapter5.bi.not_mapped_by.model.BiAadhar5WithoutMappedBy;
import com.shimbhu.chapter5.bi.not_mapped_by.model.BiPerson5WithoutMappedBy;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.logging.Logger;

/**
 * Demonstrates the bidirectional relationship without using `mappedBy` in Hibernate.
 * Ensures the correct handling of foreign keys in the absence of `mappedBy`.
 */
public class BiWithoutMappedByDemo {

    // Logger to track the application's behavior
    private static final Logger log = Logger.getLogger(BiWithoutMappedByDemo.class.getName());

    public static void main(String[] args) {

        // Obtain the SessionFactory instance from HibernateUtil.
        // This object manages Hibernate sessions and is reused across the application lifecycle.
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Open a new session for database interaction.
        Session session = sessionFactory.openSession();

        // Step 1: Add mapping of BiPerson5WithoutMappedBy and BiAadhar5WithoutMappedBy in the hibernate.cfg.xml file.
        // This step ensures that Hibernate recognizes these entities and their relationships.

        // Step 2: Create and populate the `BiPerson5WithoutMappedBy` entity.
        BiPerson5WithoutMappedBy biPerson5WithoutMappedBy = new BiPerson5WithoutMappedBy();
        biPerson5WithoutMappedBy.setName("Shimbhu Kumawat");
        biPerson5WithoutMappedBy.setCity("Jaipur");

        // Step 3: Create and populate the `BiAadhar5WithoutMappedBy` entity.
        BiAadhar5WithoutMappedBy biAadhar5MappedBy = new BiAadhar5WithoutMappedBy();
        biAadhar5MappedBy.setAadharNumber("1234-568");

        // Establish the bidirectional relationship:
        // Set the `aadhar` property in the `biPerson5WithoutMappedBy` object.
        biPerson5WithoutMappedBy.setAadhar(biAadhar5MappedBy);

        // Set the `person` property in the `biAadhar5MappedBy` object.
        // This ensures that Hibernate handles the bidirectional foreign key relationship properly.
        biAadhar5MappedBy.setPerson(biPerson5WithoutMappedBy);

        // Begin a transaction for persisting the entities.
        Transaction transaction = session.beginTransaction();

        // Step 4: Persist the `biPerson5WithoutMappedBy` entity.
        // Using `CascadeType.ALL` ensures that the associated `biAadhar5MappedBy` is also saved automatically.
        session.persist(biPerson5WithoutMappedBy);

        // Note: Since `mappedBy` is not used in this example, Hibernate does not automatically handle
        // the `person_id` foreign key in the Aadhar table. To avoid null values for `person_person_id` in the
        // Aadhar table, we must manually persist the `biAadhar5MappedBy` object if needed.
        // Uncomment the following line if necessary:
        // session.persist(biAadhar5MappedBy);

        // Commit the transaction to save changes to the database.
        transaction.commit();

        // Log a success message after data is saved.
        log.info("Person and Aadhar details saved successfully.");

        // Close the session to release database resources.
        session.close();

        // Close the SessionFactory during application shutdown to clean up resources.
        sessionFactory.close();
    }
}
