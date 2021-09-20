package com.bilgeadam.examples;

import java.util.Scanner;

public class TekrarCast2 {
	
	public static void main(String[] args) {
		
		/*
		 * String sayi1 = "4";
		 * int sayi2 = 6;
		 * System.out.println(4 + 4);
		 * System.out.println("Java" + "servlet");
		 * System.out.println(4 + " servlet");
		 ** System.out.println(Integer.valueOf(sayi1) + sayi2);
		 * System.out.println(Integer.parseInt(sayi1) + sayi2);
		 * int yeniSayi=Integer.valueOf(sayi1); olarak kullanýp yukarda kullanabilirdik.
		 * 2.ADIM TAM SAYIYI STRING CEVIRMEK
		 */
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz.");
		String userNumber = klavye.nextLine();
		// int castNumber = Integer.valueOf(userNumber);
		int castNumber = Integer.parseInt(userNumber);
		// System.out.println(castNumber*2);
		System.out.println(Math.sqrt(Math.pow(castNumber, 2)));
	}
	
}
