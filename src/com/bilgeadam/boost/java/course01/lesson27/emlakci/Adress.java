package com.bilgeadam.boost.java.course01.lesson27.emlakci;

import java.io.Serializable;

public class Adress implements Serializable {
	private String street;
	private String city;
	private String country;
	private int number;
	
	public Adress() {
		
	}
	
	public Adress(String street, String city, String country, int number) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.number = number;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", country=" + country + ", number=" + number + "]";
	}
	
}
