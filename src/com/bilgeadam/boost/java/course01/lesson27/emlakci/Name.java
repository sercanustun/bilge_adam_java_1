package com.bilgeadam.boost.java.course01.lesson27.emlakci;

public class Name {
	private String firstName;
	private String lastName;
	private String middleName;
	
	public Name() {
		
	}
	
	public Name(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = "";
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	
}
