package com.Anudip.hibernateonetomanydemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con1=new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
        SessionFactory sessionFactory=con1.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t1=session.beginTransaction();
        Question q1=new Question();
        q1.setQuestionText("What is Hibernate?");
        q1.setId(101);
        List<Answer> answers=new ArrayList<>();
        Answer a1=new Answer();
        a1.setAnswerText("Hibernate is an ORM tool.");
        Answer a2=new Answer();
        a2.setAnswerText("It is used for mapping java object to database tables.");
        answers.add(a1);
        answers.add(a2);
        q1.setAnswers(answers);
        session.persist(a1);
        t1.commit();
        
    }
}
