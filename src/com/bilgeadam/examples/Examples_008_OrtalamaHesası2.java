package com.bilgeadam.examples;

import java.util.Scanner;

// Kullan�c� manuel olarak 5 tane say� girsin ve bu say�lar�n ortlamas�n� bulsun
public class Examples_008_OrtalamaHesas�2 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2, sayi3, sayi4, sayi5, toplam = 0;
		System.out.println("1. say�y� giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("2. say�y� giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("3. say�y� giriniz");
		sayi3 = klavye.nextInt();
		System.out.println("4. say�y� giriniz");
		sayi4 = klavye.nextInt();
		System.out.println("5. say�y� giriniz");
		sayi5 = klavye.nextInt();
		toplam = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
		System.out.println("ortalama: " + toplam);
		
	}
	
}