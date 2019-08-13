package com.coding.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class queryDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session sn= factory.getCurrentSession();

		try {
			//begin transaction 
			sn.beginTransaction();
			
			List<Student> theStudent=sn.createQuery("from Student").getResultList();
			for(Student i : theStudent) {
				System.out.println(i);
			}
			
			System.out.println();
			
			//running query like %@gmail
			List<Student> theStd = sn.createQuery("from Student s where s.email Like '%gmail.com'").getResultList();
			
			for(Student i : theStd) {
				System.out.println(i);
			}
			System.out.println();
			
			//running one query with or clause
			
			List<Student> std1= sn.createQuery("from Student s where s.firstName='yashu' " + " or s.lastName='khatri'").getResultList();
			
			for(Student i : std1) {
				System.out.println(i);
			}
			System.out.println();
			
			List<Student> st=sn.createQuery("from Student s where s.firstName='r%'").getResultList();
			
			for(Student i : st) {
				System.out.println(i);
			}
			System.out.println();
			
			sn.getTransaction().commit();

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
