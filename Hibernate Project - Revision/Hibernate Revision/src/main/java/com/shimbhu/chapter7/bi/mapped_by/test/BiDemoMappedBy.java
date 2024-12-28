package com.shimbhu.chapter7.bi.mapped_by.test;


import com.shimbhu.chapter7.bi.mapped_by.model.BiCompany7MappedBy;
import com.shimbhu.chapter7.bi.mapped_by.model.BiPerson7MappedBy;
import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class BiDemoMappedBy {

    private static final Logger log = Logger.getLogger(BiDemoMappedBy.class.getName());

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // add mapping of biPerson7MappedBy and car into hibernate.cfg.xml file

        BiPerson7MappedBy biPerson7MappedBy = new BiPerson7MappedBy();

        biPerson7MappedBy.setName("Shimbhu Kumawat");
        biPerson7MappedBy.setCity("Jaipur");

        BiPerson7MappedBy uniPerson = new BiPerson7MappedBy();

        uniPerson.setName("Payal Kumawat");
        uniPerson.setCity("Chomu, Jaipur");

        BiCompany7MappedBy company = new BiCompany7MappedBy();
        company.setCompanyName("ShimbhuAI");

        BiCompany7MappedBy company2 = new BiCompany7MappedBy();
        company2.setCompanyName("Kumawat Research Labs");

        BiCompany7MappedBy company3 = new BiCompany7MappedBy();
        company3.setCompanyName("Payal Quantum Labs");

        List<BiCompany7MappedBy> companyList1 = new ArrayList<>();
        List<BiCompany7MappedBy> companyList2 = new ArrayList<>();

        companyList1.add(company);
        companyList1.add(company2);
        companyList2.add(company3);

        List<BiPerson7MappedBy> personList1 = new ArrayList<>();
        List<BiPerson7MappedBy> personList2 = new ArrayList<>();
        List<BiPerson7MappedBy> personList3 = new ArrayList<>();

        personList1.add(biPerson7MappedBy);

        personList1.add(uniPerson);

        personList2.add(biPerson7MappedBy);

        personList3.add(uniPerson);

        company.setPersons(personList2);

        company2.setPersons(personList1);

        company3.setPersons(personList3);

        biPerson7MappedBy.setCompanies(companyList1);

        uniPerson.setCompanies(companyList2);

        Transaction transaction = session.beginTransaction();

        // it won't insert data into the car table because we are using many to from car side
        session.persist(biPerson7MappedBy); // we are using cascadeType.ALL which automatically inserts the child database
        session.persist(uniPerson); // we are using cascadeType.ALL which automatically inserts the child database

        transaction.commit();

        System.out.println("Both Person saved successfully.");

        session.close();

        sessionFactory.close();
    }
}
