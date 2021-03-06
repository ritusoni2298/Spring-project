package com.coding.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrivateDemoCode {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session= factory.getCurrentSession();
		
		try {
			
			
			//create the obj of student 
			Student temp1=new Student("samikshu","shrivastav","samikshu@gmail.com");
			Student temp2=new Student("yashu","khatri","yashu@gmail.com");
			Student temp3=new Student("riyaz","ul haq","riyaz@gmail.com");
			
			//begin the transaction
			
			session.beginTransaction();
			
			//save the objects
			
			session.save(temp1);
			session.save(temp2);
			session.save(temp3);
			
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
