package com.greatlearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.greatlearning.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");  // Or use cfg.configure(); without xml file name  
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
//    	Student s1 = new Student();
//    	s1.setSname("Aice");
//    	s1.setPer(98.5);
//    	
//    	session.save(s1);
//    	
    	Student s2 = (Student)session.get(Student.class, 1);
    	System.out.println(s2);
    	s2.setPer(77.7);
    	//session.update(s3);
    	session.saveOrUpdate(s2);
    	//session.delete(s3);
    	
    	tx.commit();
    	session.close();
    	factory.close();

    }
}
