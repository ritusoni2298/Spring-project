package com.coding.springDemo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.springDemo.dao.CustomerDAO;
import com.coding.springDemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private SessionFactory sessionfactory; 
	

	@Autowired
	private CustomerDAO customerdao;
	
	
	@Override 
	@Transactional
	public List<Customer> getCustomers(){
		
		Session session = sessionfactory.getCurrentSession();
		
		Query<Customer> temp1 = session.createQuery("from Customer",Customer.class);
			List<Customer>	temp =temp1.getResultList();
		return temp;
		
	}
	
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {	
		customerdao.saveCustomer(customer);
		
	}

	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
			Customer customer= customerdao.getCustomer(theId);
			return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerdao.deleteCustomer(theId);
		
	}
	
}
