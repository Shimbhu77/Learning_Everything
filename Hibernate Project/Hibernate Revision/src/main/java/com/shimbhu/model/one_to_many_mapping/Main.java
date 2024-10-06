package com.shimbhu.model.one_to_many_mapping;

import hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Author author = getAuthor();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(author);

        transaction.commit();

        session.close();

        sessionFactory.close();

    }

    private static Author getAuthor() {
        Author author = new Author();
        author.setAuthorName("J.K. Rowling");

        Book book1 = new Book();
        book1.setBookName("Harry Potter and the Philosopher's Stone");
        book1.setAuthor(author);

        Book book2 = new Book();
        book2.setBookName("Harry Potter and the Chamber of Secrets");
        book2.setAuthor(author);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);

        author.setBooks(books);
        return author;
    }
}
