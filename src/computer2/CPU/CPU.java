package computer2.CPU;

import computer2.CommonProperty;
import computer2.othercommonproperties.IOtherCommonPro;

public class CPU extends CommonProperty implements IOtherCommonPro {
	protected String price;
	protected String pin;
	
	public CPU() {
		super();
	}
	
	public CPU(String price, String pin) {
		super();
		this.price = price;
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "CPU [price=" + price + ", pin=" + pin + "]";
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Override
	public String farkliOrtakOzellikler(String kelime) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
