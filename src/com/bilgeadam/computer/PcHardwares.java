package com.bilgeadam.computer;

public class PcHardwares {
	public PcHardwares() {
		super();
		
	}
	
	private String model = "";
	private String year = "";
	private double price = 0d;
	
	@Override
	public String toString() {
		return "PcHardwares [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
