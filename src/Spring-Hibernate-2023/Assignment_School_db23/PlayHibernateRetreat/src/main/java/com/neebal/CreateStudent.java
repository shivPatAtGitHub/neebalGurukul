package com.neebal;


import com.neebal.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateStudent {

    public static void main(String[] args) {
        Student s1 = new Student("Akshay",'M',101);
        Student s2 = new Student("Rajshree",'F',102);
        Student s3 = new Student("Shrikant",'M',103);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();
            session.save(s1);
            session.save(s2);
            session.save(s3);
            transaction.commit();
        }
    }
}
