package com.bilgeadam.boost.java.course01.factory.animalfactory;

public class AnimalFactory {
	
	public static Animal create(String animalType) {
		if (animalType.equalsIgnoreCase("köpek")) {
			return new Dog();
		}
		
		if (animalType.equalsIgnoreCase("kuþ"))
			return new Bird();
		
		return new Lion();
	}
	
}