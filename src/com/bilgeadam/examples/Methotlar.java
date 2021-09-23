package com.bilgeadam.examples;
// scope
// method
// static s�n�f de�i�kenleri
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
	// int d�� d�nyaya bir �eyler g�ndermek i�in
	// int sayi1 , int sayi = di� d�nyadan bir�eyler almak
	public static int voidsizParametreli(int sayi1, int sayi2) { // int sayi1, int sayi2 parametre
		return sayi1 + sayi2;
	}
	
	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Sercan �st�n");
		String adi = voidsizParametresiz();
		System.out.println(adi);
		System.out.println(voidsizParametresiz());
		int toplam = voidsizParametreli(4, 6); // 4 ve 6 arg�man
		System.out.println(toplam);
	}
}
