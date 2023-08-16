package com.neebal;

import com.neebal.entities.Question;
import com.neebal.entities.QuestionOption;
import com.neebal.entities.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class CreateTopic {
    public static void main(String[] args) {

//        Topic topic = new Topic("General Knowledge");
//
//        // Questions
//        Question question1 = new Question("Who won the 2011 ICC Cricket World Cup",5);
//        Question question2 = new Question("Who won the 2016 UEFA Euro Cup",5);
//
//
//        //Options to the above Questions
//        QuestionOption opt1 = new QuestionOption("A. India",true);
//        QuestionOption opt2 = new QuestionOption("B. England",false);
//        QuestionOption opt3 = new QuestionOption("C. Australia",false);
//        QuestionOption opt4 = new QuestionOption("D. West Indies",false);
//
//        QuestionOption opt5 = new QuestionOption("A. Spain",false);
//        QuestionOption opt6 = new QuestionOption("B. Portugal",true);
//        QuestionOption opt7 = new QuestionOption("C. France",false);
//        QuestionOption opt8 = new QuestionOption("D. Germany",false);


//        Topic topic = new Topic("History");
//
//        // Questions
//        Question question1 = new Question("In what year did the National Uprising took place in India?",5);
//        Question question2 = new Question("Who led the Dandi March of 1930",5);
//
//
//        //Options to the above Questions
//        QuestionOption opt1 = new QuestionOption("A. 1857",true);
//        QuestionOption opt2 = new QuestionOption("B. 1947",false);
//        QuestionOption opt3 = new QuestionOption("C. 1950",false);
//        QuestionOption opt4 = new QuestionOption("D. 1833",false);
//
//        QuestionOption opt5 = new QuestionOption("A. Kasturba Gandhi",false);
//        QuestionOption opt6 = new QuestionOption("B. Mahatma Gandhi",true);
//        QuestionOption opt7 = new QuestionOption("C. Jawaharlal Nehru",false);
//        QuestionOption opt8 = new QuestionOption("D. Sarojini Naidu",false);


//        Topic topic = new Topic("Geography");
//
//        // Questions
//        Question question1 = new Question("What is the capital of India",5);
//        Question question2 = new Question("What is the capital of Russia",5);
//
//
//        //Options to the above Questions
//        QuestionOption opt1 = new QuestionOption("A. New Delhi",true);
//        QuestionOption opt2 = new QuestionOption("B. Mumbai",false);
//        QuestionOption opt3 = new QuestionOption("C. Ahmedabad",false);
//        QuestionOption opt4 = new QuestionOption("D. Bangalore",false);
//
//        QuestionOption opt5 = new QuestionOption("A. Saint Petersburg",false);
//        QuestionOption opt6 = new QuestionOption("B. Moscow",true);
//        QuestionOption opt7 = new QuestionOption("C. Kazan",false);
//        QuestionOption opt8 = new QuestionOption("D. Perm",false);


        Topic topic = new Topic("Information Tech");

        // Questions
        Question question1 = new Question("Who is the founder of Java",5);
        Question question2 = new Question("Who founded Linux Operating system",5);


        //Options to the above Questions
        QuestionOption opt1 = new QuestionOption("A. James Gosling",true);
        QuestionOption opt2 = new QuestionOption("B. Dennis Ritchie",false);
        QuestionOption opt3 = new QuestionOption("C. Ken Thompson",false);
        QuestionOption opt4 = new QuestionOption("D. Linus Torvalds",false);

        QuestionOption opt5 = new QuestionOption("A. James Gosling",false);
        QuestionOption opt6 = new QuestionOption("B. Linus Torvalds",true);
        QuestionOption opt7 = new QuestionOption("C. Ken Thompson",false);
        QuestionOption opt8 = new QuestionOption("D. Dennis Ritchie",false);


        opt1.setQuestion(question1);
        opt2.setQuestion(question1);
        opt3.setQuestion(question1);
        opt4.setQuestion(question1);

        opt5.setQuestion(question2);
        opt6.setQuestion(question2);
        opt7.setQuestion(question2);
        opt8.setQuestion(question2);

        Set<QuestionOption> questionOptionSet = new HashSet<>();
        questionOptionSet.add(opt1);
        questionOptionSet.add(opt2);
        questionOptionSet.add(opt3);
        questionOptionSet.add(opt4);
        question1.setQuestionOptionSet(questionOptionSet);

        Set<QuestionOption> questionOptionSet1 = new HashSet<>();
        questionOptionSet1.add(opt5);
        questionOptionSet1.add(opt6);
        questionOptionSet1.add(opt7);
        questionOptionSet1.add(opt8);
        question2.setQuestionOptionSet(questionOptionSet1);

        question1.setTopic(topic);
        question2.setTopic(topic);
        Set<Question> questionSet = new HashSet<>();
        questionSet.add(question1);
        questionSet.add(question2);
        topic.setQuestionSet(questionSet);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(topic);
            transaction.commit();
        }
    }
}
