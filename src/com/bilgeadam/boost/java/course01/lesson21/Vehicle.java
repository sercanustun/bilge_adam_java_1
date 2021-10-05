package com.bilgeadam.boost.java.course01.lesson21;

public class Vehicle {
	protected String name;
	protected String brand;
	protected double mass;
	protected String color;
	protected double maxSpeed;
	protected double currSpeed;
	
	public Vehicle(String name, String brand, double maxSpeed) {
		this.name = name;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	public Vehicle(String name, String brand, double maxSpeed, double mass, String color) {
		this.name = name;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.mass = mass;
		this.color = color;
		this.currSpeed = 0.0;
	}
	
	public double getCurrSpeed() {
		return currSpeed;
	}
	
	public void setCurrSpeed(double currSpeed) {
		this.currSpeed = currSpeed;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getMass() {
		return mass;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public double getcurrSpeed() {
		return currSpeed;
	}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", mass=" + mass + ", color=" + color + ", maxSpeed="
				+ maxSpeed + ", currSpeed=" + currSpeed + "]";
	}
	
}
