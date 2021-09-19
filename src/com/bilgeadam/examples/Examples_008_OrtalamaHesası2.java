package com.bilgeadam.examples;

import java.util.Scanner;

// Kullanýcý manuel olarak 5 tane sayý girsin ve bu sayýlarýn ortlamasýný bulsun
public class Examples_008_OrtalamaHesasý2 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2, sayi3, sayi4, sayi5, toplam = 0;
		System.out.println("1. sayýyý giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("2. sayýyý giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("3. sayýyý giriniz");
		sayi3 = klavye.nextInt();
		System.out.println("4. sayýyý giriniz");
		sayi4 = klavye.nextInt();
		System.out.println("5. sayýyý giriniz");
		sayi5 = klavye.nextInt();
		toplam = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
		System.out.println("ortalama: " + toplam);
		
	}
	
}