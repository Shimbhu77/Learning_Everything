package com.shimbhu.chapter8.criteria_api;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaRoot;

import java.util.List;

public class CriteriaAPI {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        HibernateCriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        JpaCriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
        JpaRoot<Student> root = query.from(Student.class);
        JpaCriteriaQuery<Student> jpaCriteriaQuery = query.select(root);
        List<Student> students = session.createQuery(query).getResultList();

        students.forEach(System.out::println);


        session.close();

        sessionFactory.close();
    }
}
