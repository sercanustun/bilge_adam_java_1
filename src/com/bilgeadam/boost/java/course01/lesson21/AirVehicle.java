package com.bilgeadam.boost.java.course01.lesson21;

public class AirVehicle extends Vehicle {
	
	public AirVehicle(String name, String brand, double maxSpeed) {
		super(name, brand, maxSpeed);
		
	}
	
	public AirVehicle(String name, String brand, double maxSpeed, double mass, String color) {
		super(name, brand, maxSpeed, mass, color);
		super.name = "Ana Arac"; // Vehicle's name
		this.name = name; // AirVehicle's name
		
	}
	
}
