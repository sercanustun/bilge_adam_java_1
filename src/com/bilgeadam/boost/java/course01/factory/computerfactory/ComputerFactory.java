package com.bilgeadam.boost.java.course01.factory.computerfactory;

public class ComputerFactory {
	public static Computeable createComputer(int ramSize) {
		if (ramSize < 30) {
			return new Laptop();
		}
		if (ramSize < 128) {
			return new PC();
		}
		return new Server();
	}
	
}
