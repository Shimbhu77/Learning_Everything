package com.shimbhu.model.many_to_many_mapping;

import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        List<Writer> writers = getWriter();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(writers.getFirst());
//        session.persist(writers.get(1));

        transaction.commit();

        session.close();

        sessionFactory.close();

    }

    private static List<Writer> getWriter() {

        Writer writer1 = new Writer();
        writer1.setWriterName("J.K. Rowling");

        Writer writer2 = new Writer();
        writer2.setWriterName("Jack Thorne");

        Publication publication1 = new Publication();
        publication1.setPublicationName("Harry Potter and the Philosopher's Stone");

        Publication publication2 = new Publication();
        publication2.setPublicationName("Harry Potter and the Chamber of Secrets");

        List<Publication> publications = new ArrayList<>();
        List<Writer> writers = new ArrayList<>();

        publications.add(publication1);
        publications.add(publication2);

        writers.add(writer1);
        writers.add(writer2);

        writer1.setPublications(publications);

        publication1.setWriters(writers);

        return writers;
    }
}
