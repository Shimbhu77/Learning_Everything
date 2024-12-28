package com.shimbhu.chapter8.second_level_cache;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SecondLevelCacheUsingEhCache {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session1 = sessionFactory.openSession();

        Student student1 = session1.get(Student.class, 1);
        System.out.println(student1);

        session1.close();

        Session session2 = sessionFactory.openSession();

        Student student2 = session2.get(Student.class, 1);
        System.out.println(student2);

        session2.close();

        sessionFactory.close();

    }
}
