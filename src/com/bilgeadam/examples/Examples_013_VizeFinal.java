
package com.bilgeadam.examples;

import java.util.Scanner;

/*
 * ��renciden vize ve final notlar� istenecek
 * vize%40+final%60
 * Kullan�c� :
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
			System.out.println("L�tfen vize notunu giriniz");
			vizeNotu = klavye.nextDouble();
			
			System.out.println("L�tfen Final notunu giriniz");
			finalNotu = klavye.nextDouble();
			ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
			
			if (vizeNotu <= 0 || finalNotu <= 0) {
				System.out.println("L�tfen s�f�r veya s�f�rdan k���k girmeyiniz");
			} else {
				if (ortalama < 50) {
					System.out.println("ortalaman�z: " + ortalama + " Kald�n�z");
				} else if ((50 <= ortalama) && (ortalama < 60)) {
					System.out.println("ortalaman�z: " + ortalama + " Ge�me Notunuz: CC");
				} else if ((60 <= ortalama) && (ortalama < 70)) {
					System.out.println("ortalaman�z: " + ortalama + " Ge�me Notunuz: CC");
				} else if ((70 <= ortalama) && (ortalama < 80)) {
					System.out.println("ortalaman�z: " + ortalama + " Ge�me Notunuz: BA");
				} else if ((80 <= ortalama) && (ortalama <= 100)) {
					System.out.println("ortalaman�z: " + ortalama + " Ge�me Notunuz: AA");
				} else {
					System.out.println("Belirtilen aral�kta say� girmediniz");
				}
			}
			
		}
		
	}
	
}