
package com.bilgeadam.examples;

import java.util.Scanner;

/*
 * Öðrenciden vize ve final notlarý istenecek
 * vize%40+final%60
 * Kullanýcý :
 * 50<=hiz<60 ==> DC
 * 60<=hiz<70 ==> CC
 * 70<=hiz<80 ==> BA
 * 80<=hiz<=100 ==> AA
 */

public class Examples_013_VizeFinal {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		double vizeNotu, finalNotu, ortalama;
		
		while (true) {
			System.out.println("Lütfen vize notunu giriniz");
			vizeNotu = klavye.nextDouble();
			
			System.out.println("Lütfen Final notunu giriniz");
			finalNotu = klavye.nextDouble();
			ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
			
			if (vizeNotu <= 0 || finalNotu <= 0) {
				System.out.println("Lütfen sýfýr veya sýfýrdan küçük girmeyiniz");
			} else {
				if (ortalama < 50) {
					System.out.println("ortalamanýz: " + ortalama + " Kaldýnýz");
				} else if ((50 <= ortalama) && (ortalama < 60)) {
					System.out.println("ortalamanýz: " + ortalama + " Geçme Notunuz: CC");
				} else if ((60 <= ortalama) && (ortalama < 70)) {
					System.out.println("ortalamanýz: " + ortalama + " Geçme Notunuz: CC");
				} else if ((70 <= ortalama) && (ortalama < 80)) {
					System.out.println("ortalamanýz: " + ortalama + " Geçme Notunuz: BA");
				} else if ((80 <= ortalama) && (ortalama <= 100)) {
					System.out.println("ortalamanýz: " + ortalama + " Geçme Notunuz: AA");
				} else {
					System.out.println("Belirtilen aralýkta sayý girmediniz");
				}
			}
			
		}
		
	}
	
}