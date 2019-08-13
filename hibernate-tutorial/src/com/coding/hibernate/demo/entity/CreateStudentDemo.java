package com.coding.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try {
			//use a session obj to save the java obj
			
			//create student obj
			Student temp = new Student("ritu","soni","ritu@gmail.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the obj
			session.save(temp);
		
			//commit the transaction
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}
}
