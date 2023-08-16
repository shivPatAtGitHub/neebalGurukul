package com.neebal.entities;

import com.neebal.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ExistingPublicationHouse {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            PublicationHouse publicationHouse = session.get(PublicationHouse.class, 2l);
            Book book = new Book("snow white", 900, 3000.0);

            Transaction transaction = session.beginTransaction();
            book.setPublicationHouse(publicationHouse);
            session.save(book);
            transaction.commit();
        }
    }
}
