package com.coding.abcd;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {	
	try {
	ObjectMapper mapper = new ObjectMapper();
	Student s = mapper.readValue(new File("data/sample.json"), Student.class);
	
	System.out.println("Student name: "+s.getFirstName());
	System.out.println("Student id: "+s.getId());
	System.out.println("Student lstname: "+s.getLastName());
	System.out.println("Student activity: "+s.getActive());
	
	//getting address fields.
	Address myaddress = s.getAddress(); 
	System.out.println("Student address: "+myaddress.getCity());
	System.out.println("Student address: "+myaddress.getState());

	System.out.println("langugaes are");
	for(String st: s.getLanguages()) {
		System.out.print("   "+st+"  ");
	}
	
	
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
