package com.code.entity;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String action;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(int id, String firstName, String lastName, String action) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.action = action;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public Student() {
		
	}

	
}
