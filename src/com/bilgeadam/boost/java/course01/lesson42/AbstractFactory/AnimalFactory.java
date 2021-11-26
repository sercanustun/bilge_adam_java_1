package com.bilgeadam.boost.java.course01.lesson42.AbstractFactory;

import com.bilgeadam.boost.java.course01.lesson30.Animal;
import com.bilgeadam.boost.java.course01.lesson30.Cat;

public class AnimalFactory implements AbstractFactory<Animal> {
	
	@Override
	public Animal create(String type) {
		if (type.equalsIgnoreCase("kedi"))
			return new Cat();
		else if (type.equalsIgnoreCase("köpek"))
			return new Dog();
		else if (type.equalsIgnoreCase("ördek"))
			return new Duck();
		else
			return null;
	}
}
