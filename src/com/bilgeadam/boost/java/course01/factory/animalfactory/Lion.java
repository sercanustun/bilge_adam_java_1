package com.bilgeadam.boost.java.course01.factory.animalfactory;

public class Lion extends Animal {
	
	public Lion() {
		super(4, false, "Lion");
	}
	
	@Override
	public void giveVoice() {
		System.out.println("voawww");
	}
	
}