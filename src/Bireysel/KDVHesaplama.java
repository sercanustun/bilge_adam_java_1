package Bireysel;

import java.util.Scanner;

public class KDVHesaplama {
	static Scanner klavye = new Scanner(System.in);
	
	public static void SabitKdv() {
		
		System.out.println("Lütfen ürün fiyatını giriniz.");
		double urunFiyati = klavye.nextDouble();
		
		double kdv = (urunFiyati * 18 / 100);
		double kdvliFiyat = urunFiyati + kdv;
		
		System.out.println("Girdiğiniz ürünün vergisiz fiyatı " + urunFiyati + "TL" + " kdv ücreti " + kdv + "TL"
				+ " Kdvli ürün fiyatı " + kdvliFiyat + "TL" + "dir");
		
	}
	
	public static void DegiskenKdv() {
		
		System.out.println("Lütfen ürün fiyatını giriniz.");
		double urunFiyati = klavye.nextDouble();
		if (urunFiyati < 1000) {
			double kdv = (urunFiyati * 18 / 100);
			double kdvliFiyat = urunFiyati + kdv;
			System.out.println("Girdiğiniz ürünün vergisiz fiyatı " + urunFiyati + "TL" + " kdv ücreti " + kdv + "TL"
					+ " Kdvli ürün fiyatı " + kdvliFiyat + "TL" + "dir");
		} else {
			double kdv = (urunFiyati * 8 / 100);
			double kdvliFiyat = urunFiyati + kdv;
			System.out.println("Girdiğiniz ürünün vergisiz fiyatı " + urunFiyati + "TL" + " kdv ücreti " + kdv + "TL"
					+ " Kdvli ürün fiyatı " + kdvliFiyat + "TL" + "dir");
		}
	}
	
	public static void main(String[] args) {
		
		// SabitKdv();
		DegiskenKdv();
	}
	
}
