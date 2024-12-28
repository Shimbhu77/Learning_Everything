package com.shimbhu.chapter8.hql;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class SQLDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // pagination with hibernate HQL

        String query = "select * From student_details";

        NativeQuery nativeQuery = session.createNativeQuery(query);

        List<Object[]> resultList = nativeQuery.getResultList();

        resultList.forEach((objects -> System.out.println(Arrays.toString(objects))));


        session.close();

        sessionFactory.close();

    }
}
