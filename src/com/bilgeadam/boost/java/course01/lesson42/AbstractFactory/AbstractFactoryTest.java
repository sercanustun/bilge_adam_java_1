package com.bilgeadam.boost.java.course01.lesson42.AbstractFactory;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		
		AnimalFactory aF = (AnimalFactory) FactoryProvider.getFactory("hayvan");
		ColorFactory cF = (ColorFactory) FactoryProvider.getFactory("renk");
		
		aF.create("kedi").makeSound();
		System.out.println(cF.create("mavi").getColor());
	}
	
}
