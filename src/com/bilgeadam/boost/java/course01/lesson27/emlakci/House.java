package com.bilgeadam.boost.java.course01.lesson27.emlakci;

import java.time.LocalDate;

public class House extends Realty {
	private int numOfRooms;
	private int levelNumber;
	
	public House(String name, Adress adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
		this.numOfRooms = 0;
		this.levelNumber = 0;
		
	}
	
	public void setPrice(double price) { // bu gereksiz zaten realty ' nin setPrice ' ı public olduğundan her yerde
											// çağrılabilir.
		super.setPrice(price); // sadece super kullanamıza örnek olsun diye.
	}
	
	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public int getLevelNumber() {
		return levelNumber;
	}
	
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	
	@Override
	public String toString() {
		return "House [getNumOfRooms()=" + getNumOfRooms() + ", getLevelNumber()=" + getLevelNumber() + "]";
	}
	
}
