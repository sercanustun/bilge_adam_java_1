package com.bilgeadam.boost.java.course01.factory.animalfactory;

public class Dog extends Animal {
	
	public Dog() {
		super(4, true, "Dog");
	}
	
	@Override
	public void giveVoice() {
		System.out.println("hav hav");
	}
	
}