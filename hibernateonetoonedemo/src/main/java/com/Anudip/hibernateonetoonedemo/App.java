package com.Anudip.hibernateonetoonedemo;

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
    	Configuration con1=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory=con1.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t1=session.beginTransaction();
        student s1=new student();
        s1.setSid(1);
        s1.setSname("fatima");
        s1.setContact("9359689920");
        Laptop l1=new Laptop();
        l1.setLid(101);
        l1.setBrand("Dell");
        l1.setPrice(40000);
        s1.setLaptop(l1);
        session.persist(s1);
        t1.commit();
    }
}

