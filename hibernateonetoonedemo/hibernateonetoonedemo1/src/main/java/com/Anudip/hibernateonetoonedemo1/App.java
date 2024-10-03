package com.Anudip.hibernateonetoonedemo1;

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
    	Configuration con1=new Configuration().configure().addAnnotatedClass(Student1.class).addAnnotatedClass(Person.class);
        SessionFactory sessionFactory=con1.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t1=session.beginTransaction();
        Student1 s1=new Student1();
   
        s1.setName("Almas");
        
        Person p1=new Person();
     
        p1.setStreet("Maindargi");
        p1.setCountry("KHOLAPUR");
        session.persist(p1);
        session.persist(s1);
        t1.commit();
    }
}
