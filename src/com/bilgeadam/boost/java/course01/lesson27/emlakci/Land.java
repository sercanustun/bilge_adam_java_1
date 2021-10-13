package com.bilgeadam.boost.java.course01.lesson27.emlakci;

import java.time.LocalDate;

public class Land extends Realty {
	
	public Land(String name, Adress adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
	}
	
	public Land(String name, Adress adr, Dimension dim, LocalDate listingDate, double price) {
		super(name, adr, dim, listingDate);
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		return "Land [" + super.toString() + "]";
	}
	
}
