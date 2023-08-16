package com.neebal;



import com.neebal.entities.Exam;
import com.neebal.entities.ExamQuestion;
import com.neebal.entities.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class CreateExamQuestion {
    public static void main(String[] args) {

        long examId = 6;
        long questionId1 = 1;
        long questionId2 = 2;
        long questionId3 = 5;
        long questionId4 = 7;
        long questionId5 = 8;
        long questionId6 = 6;
//
//        try(Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter exam id: ");
//            examId = scanner.nextLong();
//
//            System.out.println("enter question id: ");
//            questionId = scanner.nextLong();
//        }

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            Exam exam =session.get(Exam.class, examId);
            Question question1 = session.get(Question.class,questionId1);
            Question question2 = session.get(Question.class,questionId2);
            Question question3 = session.get(Question.class,questionId3);
            Question question4 = session.get(Question.class,questionId4);
            Question question5 = session.get(Question.class,questionId5);
            Question question6 = session.get(Question.class,questionId6);

            ExamQuestion examQuestion1 = new ExamQuestion(exam, question1);
            ExamQuestion examQuestion2 = new ExamQuestion(exam, question2);
            ExamQuestion examQuestion3 = new ExamQuestion(exam, question3);
            ExamQuestion examQuestion4 = new ExamQuestion(exam, question4);
            ExamQuestion examQuestion5 = new ExamQuestion(exam, question5);
            ExamQuestion examQuestion6 = new ExamQuestion(exam, question6);

            Transaction transaction = session.beginTransaction();
            session.save(examQuestion1);
            session.save(examQuestion2);
            session.save(examQuestion3);
            session.save(examQuestion4);
            session.save(examQuestion5);
            session.save(examQuestion6);
            transaction.commit();
        }
    }
}
