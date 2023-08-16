package com.neebal;

import com.neebal.entities.Author;
import com.neebal.entities.Book;
import com.neebal.entities.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class NewAuthor {
    public static void main(String[] args) {
        String name;
        int ratings;
        char gender;
        String state;
        String country;
        int pincode;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter Author name: ");
            name = scanner.nextLine();
            System.out.println("Enter ratings: ");
            ratings = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter gender");
            gender = scanner.nextLine().charAt(0);
            System.out.println("Enter state: ");
            state = scanner.nextLine();
            System.out.println("Enter country: ");
            country = scanner.nextLine();
            System.out.println("Enter pincode: ");
            pincode = scanner.nextInt();
        }

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            Location location = new Location(state,country,pincode);
            Author author = new Author(name,ratings,gender,location);
            Transaction transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
        }
    }
}
