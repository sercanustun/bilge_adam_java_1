
package com.bilgeadam.examples;

import java.util.Scanner;

// Java 17 gelen �zellikler

// Kullan�c� manuel olarak 5 tane say� girsin ve bu say�lar�n ortlamas�n� bulsun
public class Examples_008_OrtalamaHesas�3 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi, toplam = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". say�y� giriniz");
			sayi = klavye.nextInt();
			toplam = toplam + sayi;
		}
		toplam = (toplam) / 5;
		System.out.println("ortalama: " + toplam);
		klavye.close();
	}
}