package com.bilgeadam.examples;

import java.util.Scanner;

public class Odev_Sifre_Kontrol {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		// static veri �a��rd�m Ctrl+Mouse left click
		String dbEmail = "root@com";
		String dbPassword = "root";
		
		int sayi1;
		int sayi2;
		
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
				System.out.println("Hesap Makinesi ��lemi Se�in");
				Scanner hesap = new Scanner(System.in);
				int giris = hesap.nextInt();
				while (giris == 1) {
					
					System.out.println("L�tfen Birinci Say�y� yaz�n�z");
					sayi1 = hesap.nextInt();
					System.out.println("L�tfen �kinci Say�y� yaz�n�z");
					sayi2 = hesap.nextInt();
					int toplam = sayi1 + sayi2;
					System.out.println("Toplama i�leminin sonucu " + toplam + "dir");
					break;
				}
				while (giris == 2) {
					
					System.out.println("L�tfen Birinci Say�y� yaz�n�z");
					sayi1 = hesap.nextInt();
					System.out.println("L�tfen �kinci Say�y� yaz�n�z");
					sayi2 = hesap.nextInt();
					int cikarma = sayi1 - sayi2;
					System.out.println("��karma i�leminin sonucu " + cikarma + "dir");
					break;
				}
				while (giris == 5) {
					
					System.out.println("L�tfen Birinci Say�y� yaz�n�z");
					sayi1 = hesap.nextInt();
					System.out.println("L�tfen �kinci Say�y� yaz�n�z");
					sayi2 = hesap.nextInt();
					int uslu = (int) Math.pow(sayi1, sayi2);
					System.out.println("�sl� i�lem sonucunuz " + uslu + "dir");
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
