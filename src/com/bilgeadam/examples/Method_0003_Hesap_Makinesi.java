package com.bilgeadam.examples;

import java.util.Scanner;

// kullan�c� taraf�ndan girilen 2 say�y� hesaplama yaps�n
// 1.toplama
// 2.�arpma
// 3.��karma
// 4.b�lme
// 5.kalan

// �dev-1 kullan�c� taraf�ndan girilen iki say�n�n hesap Makine bulan algoritma
// �dev-2 kullan�c� taraf�ndan girilen iki say�n�n �sl� say� bulan algoritma
// �dev-3 kullan�c� taraf�ndan girilen bir say�n�n karek�k bulan algoritma
// �dev-4 kullan�c� taraf�ndan girilen 2 say�y�n�n b�y��� bulan �rnek
// �dev-5 kullan�c� taraf�ndan girilen 2 say�y�n�n k����� bulan �rnek
// �dev-6 kullan�c� taraf�ndan girilen say�y�n� tek mi �ift mi
// �dev-7 kullan�c� taraf�ndan kelimeyi tersten yaz�dan algoritma ?
// �dev-8 kullan�c� taraf�ndan kelimeyi i�erisindeki a harf say�s�n� bulan alg ?
// �dev-9 kullan�c� taraf�ndan kelimeyi i�erisindeki a harfleri e �eviren alg ?
// �dev-10 kullan�c� taraf�ndan girilen bir say�n�n fakt�riyeli bulan �rnek
// �dev-11 kullan�c� taraf�ndan girilen bir say�n�n asal olup olmad���n� bulan
// �dev-12 kullan�c� taraf�ndan girilen bir say�n�n yatay at�� �rne�i bulan
// �dev-12 kullan�c� taraf�ndan girilen bir say�n�n basamak say�lar� bulan alg?
// �dev-13 1-10 aras�ndaki fibonacci say�lar� bulan �rnek algoritma
// �dev-14 kullan�c� taraf�ndan girilen bir say�n�n armstrong olup olmad���n�
// bulan �rnek algoritma
public class Method_0003_Hesap_Makinesi {
	// hesap makinasi metodu
	public void hesapMakinasi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("l�tfen 1.say� giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("l�tfen 2.say� giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("toplama" + (sayi1 + sayi2));
		System.out.println("��karma " + (sayi1 - sayi2));
		System.out.println("�arpma " + (sayi1 * sayi2));
		System.out.println("b�lme: " + (sayi1 / sayi2));
		System.out.println("kalan: " + (sayi1 % sayi2));
	}
	
	// �sl� say�
	public void usluSayi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("l�tfen alt giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("l�tfen �st giriniz");
		sayi2 = klavye.nextInt();
		System.out.println(Math.pow(sayi1, sayi2));
	}
	
	// karek�k
	public void karekokSayi() {
		Scanner klavye = new Scanner(System.in);
		double sayi1;
		System.out.println("l�tfen bir say� giriniz");
		sayi1 = klavye.nextInt();
		System.out.println(Math.sqrt(sayi1));
	}
	
	public int sayi1() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("l�tfen 1.say�y� giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public int sayi2() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("l�tfen 2. say�y� giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public void buyuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " b�y�kt�r");
		} else {
			System.out.println(sayi1 + " k���kt�r");
		}
	}
}