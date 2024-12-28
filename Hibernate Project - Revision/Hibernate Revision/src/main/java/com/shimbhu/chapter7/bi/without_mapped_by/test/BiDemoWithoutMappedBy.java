package com.shimbhu.chapter7.bi.without_mapped_by.test;


import com.shimbhu.chapter7.bi.without_mapped_by.model.BiCompany7WithoutMappedBy;
import com.shimbhu.chapter7.bi.without_mapped_by.model.BiPerson7WithoutMappedBy;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class BiDemoWithoutMappedBy {

    private static final Logger log = Logger.getLogger(BiDemoWithoutMappedBy.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of biPerson7WithoutMappedBy and car into hibernate.cfg.xml file

        BiPerson7WithoutMappedBy biPerson7WithoutMappedBy = new BiPerson7WithoutMappedBy();

        biPerson7WithoutMappedBy.setName("Shimbhu Kumawat");
        biPerson7WithoutMappedBy.setCity("Jaipur");

        BiPerson7WithoutMappedBy uniPerson = new BiPerson7WithoutMappedBy();

        uniPerson.setName("Payal Kumawat");
        uniPerson.setCity("Chomu, Jaipur");

        BiCompany7WithoutMappedBy company = new BiCompany7WithoutMappedBy();
        company.setCompanyName("ShimbhuAI");

        BiCompany7WithoutMappedBy company2 = new BiCompany7WithoutMappedBy();
        company2.setCompanyName("Kumawat Research Labs");

        BiCompany7WithoutMappedBy company3 = new BiCompany7WithoutMappedBy();
        company3.setCompanyName("Payal Quantum Labs");

        List<BiCompany7WithoutMappedBy> companyList1 = new ArrayList<>();
        List<BiCompany7WithoutMappedBy> companyList2 = new ArrayList<>();

        companyList1.add(company);
        companyList1.add(company2);
        companyList2.add(company3);

        List<BiPerson7WithoutMappedBy> personList1 = new ArrayList<>();
        List<BiPerson7WithoutMappedBy> personList2 = new ArrayList<>();
        List<BiPerson7WithoutMappedBy> personList3 = new ArrayList<>();

        personList1.add(biPerson7WithoutMappedBy);

        personList1.add(uniPerson);

        personList2.add(biPerson7WithoutMappedBy);

        personList3.add(uniPerson);

        company.setPersons(personList2);

        company2.setPersons(personList1);

        company3.setPersons(personList3);

        biPerson7WithoutMappedBy.setCompanies(companyList1);

        uniPerson.setCompanies(companyList2);

        Transaction transaction = session.beginTransaction();

        // it won't insert data into the car table because we are using many to from car side
        session.persist(biPerson7WithoutMappedBy); // we are using cascadeType.ALL which automatically inserts the child database
        session.persist(uniPerson); // we are using cascadeType.ALL which automatically inserts the child database

        transaction.commit();

        System.out.println("Both Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
