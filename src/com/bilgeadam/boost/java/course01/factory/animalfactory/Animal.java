package com.bilgeadam.boost.java.course01.factory.animalfactory;

public abstract class Animal {
	
	private int numberOflegs;
	private boolean pet;
	private String type;
	
	public Animal(int numberOflegs, boolean pet, String type) {
		super();
		this.numberOflegs = numberOflegs;
		this.pet = pet;
		this.type = type;
	}
	
	public abstract void giveVoice();
	
	public int getNumberOflegs() {
		return this.numberOflegs;
	}
	
	public boolean isPet() {
		return this.pet;
	}
	
	public String getType() {
		return this.type;
	}
}