package com.bilgeadam.examples;
// kullan�c�dan hesap makinesi �rne�i yapmas�n� isteyece�iz admin sayfas�nda
// kullan�c�dan alm�� oldu�um 2 tane say�da i�lem yap
// switch case
// 1 tu�una basarsa toplama yaps�n
// 2 tu�una basarsa ��karma
// 3 tu�una basarsa b�lme
// 4 tu�una basarsa �arpma
// 5 tu�una basarsa �sl� say� n (Math)
// 6 tu�una basarsa kullan�c�dan alm�� oldu�umuz kelimeyi ters �evirecek.
// (Java -> avaJ yap�lacak)
// kullan�c�dan alm�s oldugumuz kelimenin i�inde ka� tane harf var
// kullan�c�dan girmi� oldu�u s harfi varsa hepsini � ye �evirsin.

// 0 tu�una basarsa ��k�� yaps�n

import java.util.Scanner;

public class Sifre_kontrol {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		// static veri �a��rd�m Ctrl+Mouse left click
		String dbEmail = "root@com";
		String dbPassword = "root";
		// hakk�n�z:4
		int attempt = 4;
		while (attempt >= -1) {
			System.out.println("\nL�tfen Kullan�c� email giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nL�tfen Kullan�c� �ifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
			}
			System.out.println("Maskelenemi� �ifre:" + maskString);
			if ((userEmail.equals(dbEmail)) && (userPassword.equals(dbPassword))) {
				System.out.println("Admin sayfas�na y�nlendiriliyorsunuz");
			} else {
				System.out.println("Email veya �ifre yanl�� girdiniz");
				System.out.println("kalan hakk�n�z: " + (attempt - 1));
				if (attempt == 1) {
					System.out.println(
							"4 kere yanl�� hakk�m�z kart�n�z bloke oldu m��teri hizmetlerini aray�n�z 444 555 99622");
					// System.exit(0);
					break;
				}
				attempt--;
			}
		}
	}
}