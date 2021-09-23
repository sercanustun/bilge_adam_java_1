package com.bilgeadam.examples;
// scope
// method
// static sýnýf deðiþkenleri
// overloading

public class Methotlar {
	
	// voidli parametresiz
	public static void voidliParametresiz() {
		System.out.println("Ben voidli ve parametresiz metodum");
		
	}
	
	// voidli parametreli
	public static void voidliParametreli(String adiSoyadi) {
		System.out.println(adiSoyadi);
	}
	
	// voidsiz parametresiz
	public static String voidsizParametresiz() {
		return "Manisa";
		
	}
	
	// voidsiz parametreli
	// int dýþ dünyaya bir þeyler göndermek için
	// int sayi1 , int sayi = diþ dünyadan birþeyler almak
	public static int voidsizParametreli(int sayi1, int sayi2) { // int sayi1, int sayi2 parametre
		return sayi1 + sayi2;
	}
	
	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Sercan Üstün");
		String adi = voidsizParametresiz();
		System.out.println(adi);
		System.out.println(voidsizParametresiz());
		int toplam = voidsizParametreli(4, 6); // 4 ve 6 argüman
		System.out.println(toplam);
	}
}
