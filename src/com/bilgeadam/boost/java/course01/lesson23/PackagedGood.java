package com.bilgeadam.boost.java.course01.lesson23;

public class PackagedGood extends Product implements Spoilable {
	private int expirationDate;
	
	public PackagedGood(String EAN, String name, float price, int VATRate, int minStock, int expirationDate) {
		super(EAN, name, price, VATRate, minStock);
		this.expirationDate = expirationDate;
	}
	
	@Override
	public boolean isSpoiled() {
		return (expirationDate - Spoilable.MAX_DAYS) < 0;
	}
	
}
