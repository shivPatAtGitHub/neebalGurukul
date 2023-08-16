package com.neebal;

import com.neebal.entities.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ExamSimulation {

    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Scanner scanner = new Scanner(System.in);
            long studentId;
            long examId;
            System.out.println("Enter student's id: ");
            studentId = scanner.nextLong();

            System.out.println("Enter exam ID: ");
            examId = scanner.nextLong();

            Student student = session.get(Student.class,studentId);
            Exam exam = session.get(Exam.class, examId);

            if (student == null) {
                System.out.println("Student Id not found.");
                return;
            }
            if (exam == null) {
                System.out.println("Exam not found.");
                return;
            }

            System.out.println("Welcome, " + student.getName() + "! You are taking the exam: " + exam.getName());
            System.out.println("Duration: " + exam.getDuration() + " minutes");

            Set<StudentExam> studentExamSet = new HashSet<>();

            long studentScore = 0;

            // Load questions for the exam
            for (ExamQuestion examQuestion : exam.getExamQuestionSet()) {
                Question question = examQuestion.getQuestion();
                System.out.println("Question: " + question.getDescription());

                for (QuestionOption option : question.getQuestionOptionSet()) {
                    System.out.println(option.getQuestionOption());
                }

                System.out.println("Enter your answer (A, B, C, D): ");
                String studentAnswer = scanner.next().toUpperCase();

                char correctAnswer = getCorrectAnswer(question);

                int questionScore = studentAnswer.equals(String.valueOf(correctAnswer)) ? question.getMarks() : 0;

                studentScore += questionScore;
            }


            StudentExam studentExam = new StudentExam(exam, student, studentScore, new Date());

            Transaction transaction = session.beginTransaction();
            System.out.println(studentExam);
            session.save(studentExam);
            transaction.commit();

            System.out.println("Exam completed. Score: " + studentScore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static char getCorrectAnswer(Question question) {
        for (QuestionOption option : question.getQuestionOptionSet()) {
            if (Boolean.TRUE.equals(option.getCorrectAnswer())) {
                return option.getQuestionOption().charAt(0);
            }
        }
        return ' ';
    }
}
