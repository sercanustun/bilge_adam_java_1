package com.bilgeadam.classexamples;

import java.util.Scanner;

public class LoginClass {
	
	// özellikler
	private String adi;
	private String soyadi;
	private String email;
	private String telefon;
	// constructor:yapıcı metotlardır.
	// constructor: classımızda instance oluşturursak (new)
	// return sevmezler
	// class ismiyle aynıdır.
	// overloading yapabiliriz.
	// biz eğer constructor oluşturmazsak java arka planda kendisi oluşturur.
	// parametresiz constructor.
	// Ctrl+space
	
	// parametreli constructor
	// getter setter
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefon() {
		return telefon;
	}
	
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	//
	public void loginClassOrnegi() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen adınızı giriniz");
		this.adi = klavye.nextLine();
		System.out.println("Lütfen soyadınız giriniz");
		this.soyadi = klavye.nextLine();
		System.out.println("Lütfen email giriniz");
		this.email = klavye.nextLine();
		System.out.println("Lütfen telefon giriniz");
		telefon = klavye.nextLine();
		System.out.println("adınız: " + adi + " soyadınız: " + soyadi + " email: " + email + " telefon: " + telefon);
	}
	
	@Override
	public String toString() {
		return "LoginClass [adi=" + adi + ", soyadi=" + soyadi + ", email=" + email + ", telefon=" + telefon + "]";
	}
	
}