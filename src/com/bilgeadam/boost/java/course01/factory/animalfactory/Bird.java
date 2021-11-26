package com.bilgeadam.boost.java.course01.factory.animalfactory;

public class Bird extends Animal {
	
	public Bird() {
		super(2, true, "Kanarya");
	}
	
	@Override
	public void giveVoice() {
		System.out.println("cik cik");
	}
	
}