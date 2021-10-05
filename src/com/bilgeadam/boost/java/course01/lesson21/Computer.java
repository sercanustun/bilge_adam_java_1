package com.bilgeadam.boost.java.course01.lesson21;

// kalıtım :
// bütün bilgisayarlardaki ortak özellikler
public class Computer {
	
	// özellikler
	private String computerName = "";
	private String computerSerialNumber = "";
	private String computerMainCart = "";
	
	// parametresiz constructor
	public Computer() {
	}
	// parametreli constructor
	// shift + alt + s
	
	public Computer(String computerName, String computerSerialNumber, String computerMainCart) {
		this.computerName = computerName;
		this.computerSerialNumber = computerSerialNumber;
		this.computerMainCart = computerMainCart;
	}
	
	// toString
	// shift + alt + s
	@Override
	public String toString() {
		return "Coumputer [computerName=" + computerName + ", computerSerialNumber=" + computerSerialNumber
				+ ", computerMainCart=" + computerMainCart + "]";
	}
	
	// method
	public void deneme() {
		System.out.println(this.computerSerialNumber.concat("XLS"));
	}
	// getter and setter
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getComputerSerialNumber() {
		return computerSerialNumber;
	}
	
	public void setComputerSerialNumber(String computerSerialNumber) {
		this.computerSerialNumber = computerSerialNumber;
	}
	
	public String getComputerMainCart() {
		return computerMainCart;
	}
	
	public void setComputerMainCart(String computerMainCart) {
		this.computerMainCart = computerMainCart;
	}
	
}
