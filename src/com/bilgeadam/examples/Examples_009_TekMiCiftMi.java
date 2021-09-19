
package com.bilgeadam.examples;

import java.util.Scanner;

// Kullan�c�da Girilen pozitif bir say�n�n Tek mi �ift mi oldu�unu bulan
// ve s�rekli kullan�c�dan say� isteyen ve girilen say�lardan e�er kullan�c� -1
// sonsuz d�ng�den ��k�� olsun
public class Examples_009_TekMiCiftMi {
	// String ,Math ,�rne�i
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		// sonsuz d�ng�
		while (true) {
			System.out.println("\nL�tfen bir say� giriniz");
			int sayi = klavye.nextInt();
			
			if (sayi == -1) {
				System.out.println("Sistemden ��k�� sa�lan�yor ... ");
				System.exit(0);
			} else {
				if (sayi >= 0) {
					if (sayi % 2 == 0) {
						System.out.println("\n�ift Say�d�r");
					} else {
						System.out.println("Tek Say�d�r");
					}
				} else {
					System.out.println("Negatif say� girdiniz l�tfen pozitif giriniz.");
				}
			}
			
		}
		
	}
	
}