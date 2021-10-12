package computer2.maincart.maincart1;

import computer2.maincart.MainCart;

// amd
public class MainCart1 extends MainCart {
	private String amdCart;
	
	public MainCart1() {
		// TODO Auto-generated constructor stub
	}
	
	public MainCart1(String model, String year, String price, String amdCart) {
		super(model, year, price);
		this.amdCart = amdCart;
	}
	
	@Override
	public String toString() {
		return "MainCart1 [amdCart=" + amdCart + ", getPrice()=" + getPrice() + ", getModel()=" + getModel()
				+ ", getYear()=" + getYear() + "]";
	}
	
	// getter and setter
	public String getAmdCart() {
		return amdCart;
	}
	
	public void setAmdCart(String amdCart) {
		this.amdCart = amdCart;
	}
	
}
