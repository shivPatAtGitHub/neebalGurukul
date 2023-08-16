package com.neebal;

import com.neebal.entities.Exam;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateExam {

    public static void main(String[] args) {
        Exam exam1 = new Exam("Sem1",30.0,25l);
        Exam exam2 = new Exam("Sem2",30.0,25l);
        Exam exam3 = new Exam("Sem3",30.0,25l);
        Exam exam4 = new Exam("Sem4",30.0,25l);
        Exam exam5 = new Exam("Sem5",30.0,25l);
        Exam exam6 = new Exam("Sem6",30.0,25l);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();
            session.save(exam1);
            session.save(exam2);
            session.save(exam3);
            session.save(exam4);
            session.save(exam5);
            session.save(exam6);
            transaction.commit();
        }
    }
}
