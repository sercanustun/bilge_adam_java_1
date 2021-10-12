package com.bilgeadam.boost.java.course01.lesson25;

public class FrozenProduct extends Product {
	private MilkProduct milkyPart;
	private MakarnaProduct makarnaPart;
	
	public FrozenProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
		milkyPart = new MilkProduct(name, price, productionDate);
		makarnaPart = new MakarnaProduct(name, price, productionDate);
	}
	
	@Override
	public void buy(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount += number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + " kutu " + this.getName() + " alındı");
	}
	
	@Override
	public void sell(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount -= number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + " kutu " + this.getName() + " satıldı");
	}
	
}
