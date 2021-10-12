package computer2.maincart;

import computer2.CommonProperty;
import computer2.othercommonproperties.IOtherCommonPro;

public class MainCart extends CommonProperty implements IOtherCommonPro {
	// Nesne değişkeni
	protected String price;
	
	// parametresiz constructor
	public MainCart() {
		
	}
	
	// parametreli constructor
	public MainCart(String model, String year, String price) {
		super(model, year);
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MainCart [price=" + price + ", model=" + getModel() + ", year=" + getYear() + "]";
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public void deneme2() {
		System.out.println("Önceden Gövdesizdin şimdi Gövdelisin");
		
	}
	
	public void farkliOrtakOzellikler() {
		
	}
	
	@Override
	public String farkliOrtakOzellikler(String kelime) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void farkliOrtakOzellikler(String kelime, String kelime2) {
		// TODO Auto-generated method stub
		
	}
	
}
