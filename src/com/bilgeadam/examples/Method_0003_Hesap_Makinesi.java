package com.bilgeadam.examples;

import java.util.Scanner;

// kullanýcý tarafýndan girilen 2 sayýyý hesaplama yapsýn
// 1.toplama
// 2.çarpma
// 3.çýkarma
// 4.bölme
// 5.kalan

// ödev-1 kullanýcý tarafýndan girilen iki sayýnýn hesap Makine bulan algoritma
// ödev-2 kullanýcý tarafýndan girilen iki sayýnýn üslü sayý bulan algoritma
// ödev-3 kullanýcý tarafýndan girilen bir sayýnýn karekök bulan algoritma
// ödev-4 kullanýcý tarafýndan girilen 2 sayýyýnýn büyüðü bulan örnek
// ödev-5 kullanýcý tarafýndan girilen 2 sayýyýnýn küçüðü bulan örnek
// ödev-6 kullanýcý tarafýndan girilen sayýyýný tek mi çift mi
// ödev-7 kullanýcý tarafýndan kelimeyi tersten yazýdan algoritma ?
// ödev-8 kullanýcý tarafýndan kelimeyi içerisindeki a harf sayýsýný bulan alg ?
// ödev-9 kullanýcý tarafýndan kelimeyi içerisindeki a harfleri e çeviren alg ?
// ödev-10 kullanýcý tarafýndan girilen bir sayýnýn faktöriyeli bulan örnek
// ödev-11 kullanýcý tarafýndan girilen bir sayýnýn asal olup olmadýðýný bulan
// ödev-12 kullanýcý tarafýndan girilen bir sayýnýn yatay atýþ örneði bulan
// ödev-12 kullanýcý tarafýndan girilen bir sayýnýn basamak sayýlarý bulan alg?
// ödev-13 1-10 arasýndaki fibonacci sayýlarý bulan örnek algoritma
// ödev-14 kullanýcý tarafýndan girilen bir sayýnýn armstrong olup olmadýðýný
// bulan örnek algoritma
public class Method_0003_Hesap_Makinesi {
	// hesap makinasi metodu
	public void hesapMakinasi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("lütfen 1.sayý giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("lütfen 2.sayý giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("toplama" + (sayi1 + sayi2));
		System.out.println("çýkarma " + (sayi1 - sayi2));
		System.out.println("çarpma " + (sayi1 * sayi2));
		System.out.println("bölme: " + (sayi1 / sayi2));
		System.out.println("kalan: " + (sayi1 % sayi2));
	}
	
	// üslü sayý
	public void usluSayi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("lütfen alt giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("lütfen üst giriniz");
		sayi2 = klavye.nextInt();
		System.out.println(Math.pow(sayi1, sayi2));
	}
	
	// karekök
	public void karekokSayi() {
		Scanner klavye = new Scanner(System.in);
		double sayi1;
		System.out.println("lütfen bir sayý giriniz");
		sayi1 = klavye.nextInt();
		System.out.println(Math.sqrt(sayi1));
	}
	
	public int sayi1() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 1.sayýyý giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public int sayi2() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 2. sayýyý giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public void buyuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " büyüktür");
		} else {
			System.out.println(sayi1 + " küçüktür");
		}
	}
}