package com.bilgeadam.examples;

import java.util.Scanner;

public class Odev_01_Asalsayi {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		boolean karar = false;
		while (true) {
			System.out.println("Lütfen bir sayý giriniz.");
			sayi = klavye.nextInt();
			if (sayi <= 1) {
				System.out.println("bir , sýfýr veya sýfýrdan küçük bir sayý giremezsiniz.");
			} else if (sayi == 2) {
			} else {
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0) {
						karar = true;
					}
				}
				if (karar) {
					System.out.println("asal sayý deðildir.");
				} else {
					System.out.println("asal sayýdýr.");
				}
				
			}
			
		}
		
	}
	
}
