package com.coding.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.springDemo.entity.Customer;
import com.coding.springDemo.services.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerservice ;
	
	@GetMapping("/list")
	public String ListCustomer(Model theModel) {
		List<Customer> theCustomer = customerservice.getCustomers();
		
		//add the customers to model
		theModel.addAttribute("customers",theCustomer);
		
		return "listView";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model themodel) {
		
		Customer customer =new Customer();
		
		themodel.addAttribute("customers",customer);
		
		return "customer-form";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customers") Customer thecustomer) {
		
		customerservice.saveCustomer(thecustomer);
		return "redirect:/customer/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String ShowFormForUpdate(@RequestParam(value="customerId") int theId, Model themodel) {
		//get the value using id
		Customer customer = customerservice.getCustomer(theId);
		
		//set it to a model
		themodel.addAttribute("customers", customer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(value="customerId") int theId , Model theModel) {
		
		customerservice.deleteCustomer(theId);
		return "redirect:/customer/list";
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