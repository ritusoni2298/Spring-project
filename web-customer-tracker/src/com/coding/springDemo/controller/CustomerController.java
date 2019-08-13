package com.coding.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding.springDemo.dao.CustomerDAO;
import com.coding.springDemo.entity.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDAO customerDAO ;
	
	@GetMapping("/list")
	public String ListCustomer(Model theModel) {
		List<Customer> theCustomer = customerDAO.getCustomers();
		
		//add the customers to model
		theModel.addAttribute("customers",theCustomer);
		
		return "listView";
	}
	}

/*
@Autowired
private CustomerDAO customerDAO;

@RequestMapping("/list")
public String ListCustomer(Model theModel) {
	//get the customers from the dao
	
	
	
	return "listView";
*/