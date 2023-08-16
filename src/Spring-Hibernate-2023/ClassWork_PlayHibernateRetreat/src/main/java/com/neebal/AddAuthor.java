package com.neebal;

import com.neebal.entities.Author;
import com.neebal.entities.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class AddAuthor {
    public static void main(String[] args) {

        String name;
        char gender;
        int ratings;

        String country;
        String state;
        int pincode;


        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("enter Author's name: ");
            name = scanner.nextLine();

            System.out.println("enter Author's gender: ");
            gender = scanner.nextLine().charAt(0);

            System.out.println("enter Author's ratings");
            ratings = scanner.nextInt();

            // takes "\n of ratings"
            scanner.nextLine();

            System.out.println("enter Author's country: ");
            country = scanner.nextLine();

            System.out.println("enter Author's state");
            state = scanner.nextLine();

            System.out.println("enter Author's pincode");
            pincode = scanner.nextInt();
        }

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            Location location = new Location(country, state, pincode);
            Author author = new Author(name, ratings, gender, location);
            Transaction transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
        }



    }
}
