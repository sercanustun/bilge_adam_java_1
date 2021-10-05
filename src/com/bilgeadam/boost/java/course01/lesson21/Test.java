package com.bilgeadam.boost.java.course01.lesson21;

public class Test {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Araba", "Wolkswagen", 220.5);
		System.out.println(vehicle);
		vehicle.setColor("Blue");
		System.out.println(vehicle);
		System.out.println();
		Vehicle vehicle1 = new Vehicle("Uçak", "Airbus", 1800.0, 12200.75, "Grey");
		System.out.println(vehicle1);
		AirVehicle air = new AirVehicle("Helikopter", "atak", 400.0, 5000.0, "Black");
		System.out.println(air);
	}
	
}
