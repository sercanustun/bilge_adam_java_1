package com.bilgeadam.examples;

import java.util.Scanner;

public class Odev_Sifre_Kontrol {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		// static veri çaðýrdým Ctrl+Mouse left click
		String dbEmail = "root@com";
		String dbPassword = "root";
		
		int sayi1;
		int sayi2;
		
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
				System.out.println("Hesap Makinesi Ýþlemi Seçin");
				Scanner hesap = new Scanner(System.in);
				int giris = hesap.nextInt();
				while (giris == 1) {
					
					System.out.println("Lütfen Birinci Sayýyý yazýnýz");
					sayi1 = hesap.nextInt();
					System.out.println("Lütfen Ýkinci Sayýyý yazýnýz");
					sayi2 = hesap.nextInt();
					int toplam = sayi1 + sayi2;
					System.out.println("Toplama iþleminin sonucu " + toplam + "dir");
					break;
				}
				while (giris == 2) {
					
					System.out.println("Lütfen Birinci Sayýyý yazýnýz");
					sayi1 = hesap.nextInt();
					System.out.println("Lütfen Ýkinci Sayýyý yazýnýz");
					sayi2 = hesap.nextInt();
					int cikarma = sayi1 - sayi2;
					System.out.println("Çýkarma iþleminin sonucu " + cikarma + "dir");
					break;
				}
				while (giris == 5) {
					
					System.out.println("Lütfen Birinci Sayýyý yazýnýz");
					sayi1 = hesap.nextInt();
					System.out.println("Lütfen Ýkinci Sayýyý yazýnýz");
					sayi2 = hesap.nextInt();
					int uslu = (int) Math.pow(sayi1, sayi2);
					System.out.println("Üslü iþlem sonucunuz " + uslu + "dir");
					break;
					
				}
				while (giris == 6) {
					
					Scanner oku = new Scanner(System.in);
					String kelime;
					
					kelime = oku.next().toUpperCase();
					
					for (int i = kelime.length() - 1; i >= 0; i--) {
						System.out.print(kelime.charAt(i));
					}
					
					break;
				}
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
