package com.bilgeadam.examples;

import java.util.Scanner;

public class Odev_01_Asalsayi {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		boolean karar = false;
		while (true) {
			System.out.println("L�tfen bir say� giriniz.");
			sayi = klavye.nextInt();
			if (sayi <= 1) {
				System.out.println("bir , s�f�r veya s�f�rdan k���k bir say� giremezsiniz.");
			} else if (sayi == 2) {
			} else {
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0) {
						karar = true;
					}
				}
				if (karar) {
					System.out.println("asal say� de�ildir.");
				} else {
					System.out.println("asal say�d�r.");
				}
				
			}
			
		}
		
	}
	
}
