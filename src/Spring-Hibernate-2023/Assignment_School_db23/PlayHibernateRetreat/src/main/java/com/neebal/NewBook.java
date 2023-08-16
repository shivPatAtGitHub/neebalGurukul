package com.neebal;

import com.neebal.entities.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class NewBook {

    public static void main(String[] args) {
        String title;
        double price;
        int pages;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter title: ");
            title = scanner.nextLine();

            System.out.println("Enter price: ");
            price = scanner.nextDouble();

            System.out.println("Enter pages: ");
            pages = scanner.nextInt();
        }

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            Book book = new Book(title, pages, price);

            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        }
    }
}
