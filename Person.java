package com.fmt;

import java.util.ArrayList;

public class Person{
	private String code;
	private String firstName;
	private String lastName;
	private Address address;
	private ArrayList<String> emails;

	// class to create people objects
	
	
	public Person(String code, String firstName, String lastName, String street, String city, String state, String zip,
			String country) {
		super();
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(street,city,state,zip,country);
	}
	
	public Person(String managerCode) {
		this.code=managerCode;
		this.firstName="";
		this.lastName="";
		this.address= new Address();
	}

	public Person(String code, String firstName, String lastName, String street, String city, String state,
			String zip, String country, ArrayList<String> emails) {
		this.code=code;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address = new Address(street,city,state,zip,country);
		this.emails=emails;

	}

	public String getCode() {
		return code;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}
	public void getEmails() {
		for(int x=0;x<emails.size();x++) {
			System.out.print(emails.get(x) + " ");
		}
	}
	public String toString() {
		return lastName+ " " + firstName;
	}
	
	
	
	
	
}