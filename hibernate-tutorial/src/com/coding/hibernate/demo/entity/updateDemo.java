package com.coding.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updateDemo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();		//update a query 
		Session session =factory.getCurrentSession();
		
		try {
		session.beginTransaction();
		
		session.createQuery("update Student set email='r@s.com' where firstName='yashu'").executeUpdate();
		session.createQuery("delete from Student where id=4").executeUpdate();
		/*
		List<Student> s= session.createQuery("from student s where s.fisrtName='rimpy'").getResultList();
		
		for(Student se: s) {
			System.out.println("se"+se);
		}*/
		session.getTransaction().commit();
		//commit transaction
		//session=factory.getCurrentSession();
		
		/*session.beginTransaction();
		List<Student> stf= session.createQuery("from student s where s.firstName='yashu'").getResultList();
		
		for(Student se: stf) {
			System.out.println("se"+se);
			}
		
		session.getTransaction().commit();
		*/}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
