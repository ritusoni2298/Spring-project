package com.coding.springDemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coding.springDemo.entity.Customer;

@Repository 
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override 
	@Transactional
	public List<Customer> getCustomers() {
		//get the current hibernate session
		Session session=sessionfactory.getCurrentSession();
		
		Query<Customer> theQuery =session.createQuery("from Customer", Customer.class);
		
		
		//create query
		List<Customer> temp = theQuery.getResultList();
		
		//save the session
		//return list
		return temp;
	}
	
}
