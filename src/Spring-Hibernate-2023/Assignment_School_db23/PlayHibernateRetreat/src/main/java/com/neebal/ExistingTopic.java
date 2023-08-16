package com.neebal;

import com.neebal.entities.Question;
import com.neebal.entities.QuestionOption;
import com.neebal.entities.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class ExistingTopic {
    public static void main(String[] args) {

        QuestionOption opt1 = new QuestionOption("A. Shrikant",false);
        QuestionOption opt2 = new QuestionOption("B. James Gosling",true);
        QuestionOption opt3 = new QuestionOption("C. Rupendra",false);
        QuestionOption opt4 = new QuestionOption("D. Rajshree",false);

        Question question = new Question("Who invented Java?",5);

        opt1.setQuestion(question);
        opt2.setQuestion(question);
        opt3.setQuestion(question);
        opt4.setQuestion(question);

        Set<QuestionOption> questionOptionSet = new HashSet<>();
        questionOptionSet.add(opt1);
        questionOptionSet.add(opt2);
        questionOptionSet.add(opt3);
        questionOptionSet.add(opt4);
        question.setQuestionOptionSet(questionOptionSet);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            Topic topic = session.get(Topic.class,1l);
            Transaction transaction = session.beginTransaction();
            question.setTopic(topic);
            session.save(question);
            transaction.commit();
        }
    }
}
