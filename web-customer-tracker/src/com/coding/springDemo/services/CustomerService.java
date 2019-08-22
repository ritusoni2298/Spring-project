package com.coding.springDemo.services;

import java.util.List;

import com.coding.springDemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer thecustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
}
