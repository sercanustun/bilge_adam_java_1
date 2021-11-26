package com.bilgeadam.boost.java.course01.lesson42.AbstractFactory;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(String factoryType) {
		
		if (factoryType.equalsIgnoreCase("hayvan"))
			return new AnimalFactory();
		else
			return new ColorFactory();
	}
}
