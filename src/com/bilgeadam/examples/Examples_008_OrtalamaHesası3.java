
package com.bilgeadam.examples;

import java.util.Scanner;

// Java 17 gelen özellikler

// Kullanýcý manuel olarak 5 tane sayý girsin ve bu sayýlarýn ortlamasýný bulsun
public class Examples_008_OrtalamaHesasý3 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi, toplam = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". sayýyý giriniz");
			sayi = klavye.nextInt();
			toplam = toplam + sayi;
		}
		toplam = (toplam) / 5;
		System.out.println("ortalama: " + toplam);
		klavye.close();
	}
}