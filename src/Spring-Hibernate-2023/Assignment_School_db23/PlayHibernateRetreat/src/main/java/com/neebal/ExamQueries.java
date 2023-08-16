package com.neebal;

import com.neebal.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

public class ExamQueries {

        private static void printStudentAndExam(Session session){


            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);

            Root<StudentExam> examStudentRoot = query.from(StudentExam.class);
            Join<StudentExam, Student> studentJoin = examStudentRoot.join("student");
            Join<StudentExam, Exam> examJoin = examStudentRoot.join("exam");

            query.multiselect(
                    studentJoin.get("name"),
                    examJoin.get("name")
            );

            TypedQuery<Object[]> typedQuery = session.createQuery(query);
            List<Object[]> results = typedQuery.getResultList();

            for (Object[] result : results) {
                String studentName = (String) result[0];
                String examName = (String) result[1];
                System.out.println("Student: " + studentName + ", Exam: " + examName);
            }
        }


        private static void printQuestionAppearedInExam(Session session){


            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);

            Root<ExamQuestion> studentExamRoot = query.from(ExamQuestion.class);
            Join<ExamQuestion, Question> questionJoin = studentExamRoot.join("question");
            Join<ExamQuestion, Exam> examJoin = studentExamRoot.join("exam");

            query.multiselect(
                    questionJoin.get("description"),
                    examJoin.get("name")
            );

            TypedQuery<Object[]> typedQuery = session.createQuery(query);
            List<Object[]> results = typedQuery.getResultList();

            for (Object[] result : results) {
                String question = (String) result[0];
                String examName = (String) result[1];
                System.out.println("Question: " + question + ", Exam: " + examName);
            }
        }

        public static void StudentGroupByGender(Session session){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

            Root<Student> root = cq.from(Student.class);

            cq.multiselect(root.get("gender"),cb.count(root.get("gender"))).groupBy(root.get("gender"));

            List<Object[]> rows = session.createQuery(cq).getResultList();
            rows.forEach(row -> System.out.println(row[0]+" "+row[1]));
        }

        private static void searchQuestionAccordingTopicId(Session session, Long id){


            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Question> cq = criteriaBuilder.createQuery(Question.class);

            Root<Question> questionRoot = cq.from(Question.class);
            Join<Question, Topic> topicJoin = questionRoot.join("topic");


            cq.where(criteriaBuilder.equal(topicJoin.get("id"), id));

            TypedQuery<Question> typedQuery = session.createQuery(cq);
            List<Question> questions = typedQuery.getResultList();

            for (Question question : questions) {
                System.out.println("Question ID: " + question.getId());

            }
        }

        public static void main(String[] args) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            try(Session session = sessionFactory.openSession()){

                printStudentAndExam(session);
                printQuestionAppearedInExam(session);
                StudentGroupByGender(session);
                searchQuestionAccordingTopicId(session, 3l);
            }
        }
}



