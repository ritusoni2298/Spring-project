package com.code.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import com.code.entity.Student;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	private List<Student> theStudent;
	
	@PostConstruct 
	public void loadData() {
		theStudent.add(new Student(1,"ritu","soni","true"));
		theStudent.add(new Student(3,"ra","sonsfi","true"));
		theStudent.add(new Student(2,"ris","sonfgi","true"));
		theStudent.add(new Student(4,"risu","sodsfni","true"));
	}
	
	@RequestMapping("/hello")
	public String demorest() {
		return "hello World!";
	}
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		
		return theStudent;
	}
	
	@GetMapping("/student/{id}")
	public Student getStd(@PathVariable int id){
		
		return theStudent.get(id);
	}
	
	
	
}
