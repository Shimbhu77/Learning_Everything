package com.shimbhu.chapter8.hql;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class HQLPaginationDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // pagination with hibernate HQL

        String query = "From Student";

        Query<Student> paginationQuery = session.createQuery(query, Student.class);

        // page 1
        paginationQuery.setFirstResult(0);
        paginationQuery.setMaxResults(5);

        List<Student> resultList = paginationQuery.getResultList();

        System.out.println("page 1 results ");

        resultList.forEach(System.out::println);


        // page 2
        paginationQuery.setFirstResult(5);
        paginationQuery.setMaxResults(10);

        List<Student> resultList2 = paginationQuery.getResultList();

        System.out.println("page 2 results ");

        resultList2.forEach(System.out::println);


        session.close();

        sessionFactory.close();

    }
}
