
package com.bilgeadam.examples;

import java.util.Scanner;

// 2 pi*r
public class Examples_013_DaireCevreHesab� {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen yar��ap   giriniz");
		int yaricap = klavye.nextInt();
		double sonuc = 2 * yaricap * Math.PI;
		System.out.println("Cevre hesab�: " + sonuc);
		
	}
	
}