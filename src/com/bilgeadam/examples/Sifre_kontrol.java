package com.bilgeadam.examples;
// kullanýcýdan hesap makinesi örneði yapmasýný isteyeceðiz admin sayfasýnda
// kullanýcýdan almýþ olduðum 2 tane sayýda iþlem yap
// switch case
// 1 tuþuna basarsa toplama yapsýn
// 2 tuþuna basarsa çýkarma
// 3 tuþuna basarsa bölme
// 4 tuþuna basarsa çarpma
// 5 tuþuna basarsa üslü sayý n (Math)
// 6 tuþuna basarsa kullanýcýdan almýþ olduðumuz kelimeyi ters çevirecek.
// (Java -> avaJ yapýlacak)
// kullanýcýdan almýs oldugumuz kelimenin içinde kaç tane harf var
// kullanýcýdan girmiþ olduðu s harfi varsa hepsini þ ye çevirsin.

// 0 tuþuna basarsa çýkýþ yapsýn

import java.util.Scanner;

public class Sifre_kontrol {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		// static veri çaðýrdým Ctrl+Mouse left click
		String dbEmail = "root@com";
		String dbPassword = "root";
		// hakkýnýz:4
		int attempt = 4;
		while (attempt >= -1) {
			System.out.println("\nLütfen Kullanýcý email giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nLütfen Kullanýcý þifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
			}
			System.out.println("Maskelenemiþ þifre:" + maskString);
			if ((userEmail.equals(dbEmail)) && (userPassword.equals(dbPassword))) {
				System.out.println("Admin sayfasýna yönlendiriliyorsunuz");
			} else {
				System.out.println("Email veya þifre yanlýþ girdiniz");
				System.out.println("kalan hakkýnýz: " + (attempt - 1));
				if (attempt == 1) {
					System.out.println(
							"4 kere yanlýþ hakkýmýz kartýnýz bloke oldu müþteri hizmetlerini arayýnýz 444 555 99622");
					// System.exit(0);
					break;
				}
				attempt--;
			}
		}
	}
}