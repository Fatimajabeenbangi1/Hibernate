package com.Anudip.hibernatelist;

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
       Configuration con1=new Configuration().configure().addAnnotatedClass(Question.class);
       SessionFactory sessionFactory=con1.buildSessionFactory();
       Session session=sessionFactory.openSession();
       Transaction t1=session.beginTransaction();
       Question q1=new Question();
       List<String> answer1List=new ArrayList<>();
       answer1List.add("java is a programming language");
       answer1List.add("java is a platform independent language");
       
       q1.setQname("what is Java");
       q1.setAnswer(answer1List);
       session.save(q1);
       t1.commit();
    }
}
