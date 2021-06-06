package com.luv2code.springbootdemo.mycoolapp.rest;

public class Human {
	
	private String gender;
	private int age;
	private String name;
	private String maritalStatus;
	
	public Human() {
		
	}

	public Human(String gender, int age, String name, String maritalStatus) {
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.maritalStatus = maritalStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	

}
