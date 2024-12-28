package com.shimbhu.chapter8.hql;

import com.shimbhu.chapter2.Student;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HQLDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();


        // basic fetch query for all the rows
        String hqlQuery = "From Student";

        Query<Student> query = session.createQuery(hqlQuery, Student.class);

        List<Student> students = query.getResultList();

        System.out.println("Fetching All the Students");

        students.forEach(System.out::println);

        // parameterized query

        String parameterQuery = "From Student where name = :name";

        Query<Student> studentQueryByName = session.createQuery(parameterQuery, Student.class);

        studentQueryByName.setParameter("name","Shimbhu Kumawat");

        List<Student> resultList = studentQueryByName.getResultList();

        System.out.println("Fetching Students based on the name");

        System.out.println(resultList);

        // parameterized query

        String parameterQuery2 = "From Student where name = :name and city = :city";

        Query<Student> studentQueryByNameAndCity = session.createQuery(parameterQuery2, Student.class);

        studentQueryByNameAndCity.setParameter("name","Shimbhu Kumawat");
        studentQueryByNameAndCity.setParameter("city","Jaipur");

        Student singleResult = studentQueryByNameAndCity.getSingleResult();

        System.out.println("Fetching Students based on the name and city");

        System.out.println(singleResult);


        // update query

        // String hql = "UPDATE Person p SET p.age = :newAge WHERE p.id = :personId";

        Transaction transaction = session.beginTransaction();

        String updateStudent = "update Student s SET s.city = :city where s.id = :studentId";

        Query updateStudentQuery = session.createQuery(updateStudent);

        updateStudentQuery.setParameter("city","London");
        updateStudentQuery.setParameter("studentId",1);

        int updatedRows = updateStudentQuery.executeUpdate();

        System.out.println(updatedRows + " is updated Rows");

        // delete query

        String deleteQuery = "delete from Student s where s.id = :id";

        Query deleteStudentQuery = session.createQuery(deleteQuery);

        deleteStudentQuery.setParameter("id",3);

        int deletedRows = deleteStudentQuery.executeUpdate();

        System.out.println(deletedRows+" are deleted.");

        transaction.commit();

        session.close();

        sessionFactory.close();

    }
}
