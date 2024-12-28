package com.shimbhu.chapter7.uni.test;


import com.shimbhu.chapter7.uni.model.UniCompany7;
import com.shimbhu.chapter7.uni.model.UniPerson7;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class UniDemo {

    private static final Logger log = Logger.getLogger(UniDemo.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of uniPerson7 and car into hibernate.cfg.xml file

        UniPerson7 uniPerson7 = new UniPerson7();

        uniPerson7.setName("Shimbhu Kumawat");
        uniPerson7.setCity("Jaipur");

        UniPerson7 uniPerson = new UniPerson7();

        uniPerson.setName("Payal Kumawat");
        uniPerson.setCity("Chomu, Jaipur");

        UniCompany7 company = new UniCompany7();
        company.setCompanyName("ShimbhuAI");

        UniCompany7 company2 = new UniCompany7();
        company2.setCompanyName("Kumawat Research Labs");

        UniCompany7 company3 = new UniCompany7();
        company3.setCompanyName("Payal Quantum Labs");

        List<UniCompany7> companyList1 = new ArrayList<>();
        List<UniCompany7> companyList2 = new ArrayList<>();

        companyList1.add(company);
        companyList1.add(company2);

        companyList2.add(company3);

        uniPerson7.setCompanies(companyList1);
        uniPerson.setCompanies(companyList2);

        Transaction transaction = session.beginTransaction();

        // it won't insert data into the car table because we are using many to from car side
        session.persist(uniPerson7); // we are using cascadeType.ALL which automatically inserts the child database
        session.persist(uniPerson); // we are using cascadeType.ALL which automatically inserts the child database

        transaction.commit();

        System.out.println("Both Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
