package com.bilgeadam.examples;

import java.util.Scanner;

// Kullanýcýnmýn girmiþ olduðu bir kelimenin
// kelime sayýsý
// bütün karakterleri küçük ypasýn
// bütün karakterleri büyük yapsýn
// baþý a ile baþlýyorsa evet a ile baþlýyor
// sonu a ile bitiyorsa evet a ile bitiyor.
// çok haneli karakter girince 0-10 arasýndak.i bize göstersin sonuna ...
// kelimenin sonuna "Bilge Adam" eklensin

public class Girilen_Kelimenin_Ozellikleri {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen Bir Kelime Giriniz");
		String kelime = klavye.nextLine();
		System.out.println("Eleman Sayýsý " + kelime.trim().length());
		System.out.println("Büyük " + kelime.toUpperCase());
		System.out.println("Küçük " + kelime.toLowerCase());
		if (kelime.startsWith("a")) {
			System.out.println("Evet a ile baþlýyor");
		} else {
			System.out.println("Hayýr!!! a ile baþlamýyor");
			
		}
		String ends = (kelime.endsWith("a")) ? "evet a ile bitiyor" : " hayýr a ile bitmiyor";
		System.out.println(ends);
		if (kelime.length() > 10) {
			System.out.println(kelime.substring(0, 10).concat("..."));
		}
		System.out.println(kelime.concat("Bilge Adam"));
		
	}
	
}
