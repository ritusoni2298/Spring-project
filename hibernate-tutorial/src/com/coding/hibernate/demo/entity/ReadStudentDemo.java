package com.coding.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			//create an object
			Student std = new Student("a","b","a@b.com");
			
			//begin transaction
			session.beginTransaction();
			
			//save the object
			session.save(std);			
			//commit transaction
			session.getTransaction().commit();
			
			//new session
			Session s= factory.getCurrentSession();
			//begin the transaction
			s.beginTransaction();
			
			//get the object through the ID
			System.out.println("primary key is: "+std.getId());
			Student std1 = s.get(Student.class,std.getId());
			System.out.println("values: "+std1);
			
			//commit
			s.getTransaction().commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
