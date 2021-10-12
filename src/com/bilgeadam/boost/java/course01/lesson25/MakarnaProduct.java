package com.bilgeadam.boost.java.course01.lesson25;

public class MakarnaProduct extends Product {
	private String brandName;
	private MakarnaType type;
	
	public MakarnaProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
	}
	
	@Override
	public String toString() {
		return "MakarnaProduct [brandName=" + this.brandName + ", type=" + this.type + ", toString()="
				+ super.toString() + "]";
	}
	
	public String getBrandName() {
		return this.brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public MakarnaType getType() {
		return this.type;
	}
	
	public void setType(MakarnaType type) {
		this.type = type;
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
