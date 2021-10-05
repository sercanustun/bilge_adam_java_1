package com.bilgeadam.classexamples;
// class: calss+class+class
// paketler
// Pascal case ClassTutoails

// global scope
// local scope
// nesne değişkeni
// class değişkeni
// final

// access modifier :
// public bonkör her taraftan erişim sağlıyor
// private sadece o classta calisir getter and setter.
public class ClassExamples {
	// telefon markası
	// class değişkeni
	public static String telephoneTrade;
	private double telephonePrice;
	private String telephoneColour;
	private boolean isProduction;
	private int yearOfProduction;
	
	// getter and setter
	// getter : verileri getirmek
	public double telephonePrice() {
		return telephonePrice;
	}
	
	// setter: yazmak
	// this yapısı global erişim sağlamak için kuıllanıyoruz
	public void setTelephonePrice(double abc) {
		this.telephonePrice = abc;
		
	}
	
	public String getTelephoneColour() {
		return telephoneColour;
	}
	
	public void setTelephoneColour(String telephoneColour) {
		this.telephoneColour = telephoneColour;
	}
	
	public boolean isProduction() {
		return isProduction;
	}
	
	public void setProduction(boolean isProduction) {
		this.isProduction = isProduction;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	public double getTelephonePrice() {
		return telephonePrice;
	}
	// login sayfası olsun.
	// kullanıcı tarafından aldığımız bilgiler ışığında
	// adı
	// soyadı
	// email
	// telefon numarası 2 şekilde
	// metot ile yapalım
	// class ile yapalım
	
}
