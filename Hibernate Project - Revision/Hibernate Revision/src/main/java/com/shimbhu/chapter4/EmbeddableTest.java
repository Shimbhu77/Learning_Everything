package com.shimbhu.chapter4;

import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmbeddableTest {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Person person1 = new Person();

        person1.setName("Shimbhu Kumawat");
        person1.setCity("Jaipur");

        Job job1 = new Job();

        job1.setCompanyName("ShimbhuAI");
        job1.setRole("Research Scientist");
        job1.setSalary("24 Lakh");
        job1.setWorkCity("Bharatvarsh");

        person1.setJob(job1);

        Person person2 = new Person();

        person2.setName("Payal Kumawat");
        person2.setCity("Jaipur");

        Job job2 = new Job();

        job2.setCompanyName("Maa Ganga University");
        job2.setRole("Quantum Computer Research Scientist");
        job2.setSalary("30 Lakh");
        job2.setWorkCity("Bharatvarsh");

        person2.setJob(job2);

        session.persist(person1);
        session.persist(person2);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
