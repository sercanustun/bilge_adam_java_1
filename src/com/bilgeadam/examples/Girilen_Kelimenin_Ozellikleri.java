package com.bilgeadam.examples;

import java.util.Scanner;

// Kullan�c�nm�n girmi� oldu�u bir kelimenin
// kelime say�s�
// b�t�n karakterleri k���k ypas�n
// b�t�n karakterleri b�y�k yaps�n
// ba�� a ile ba�l�yorsa evet a ile ba�l�yor
// sonu a ile bitiyorsa evet a ile bitiyor.
// �ok haneli karakter girince 0-10 aras�ndak.i bize g�stersin sonuna ...
// kelimenin sonuna "Bilge Adam" eklensin

public class Girilen_Kelimenin_Ozellikleri {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen Bir Kelime Giriniz");
		String kelime = klavye.nextLine();
		System.out.println("Eleman Say�s� " + kelime.trim().length());
		System.out.println("B�y�k " + kelime.toUpperCase());
		System.out.println("K���k " + kelime.toLowerCase());
		if (kelime.startsWith("a")) {
			System.out.println("Evet a ile ba�l�yor");
		} else {
			System.out.println("Hay�r!!! a ile ba�lam�yor");
			
		}
		String ends = (kelime.endsWith("a")) ? "evet a ile bitiyor" : " hay�r a ile bitmiyor";
		System.out.println(ends);
		if (kelime.length() > 10) {
			System.out.println(kelime.substring(0, 10).concat("..."));
		}
		System.out.println(kelime.concat("Bilge Adam"));
		
	}
	
}
