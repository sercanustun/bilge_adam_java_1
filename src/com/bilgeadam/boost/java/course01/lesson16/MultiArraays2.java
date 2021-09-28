package com.bilgeadam.boost.java.course01.lesson16;

import java.util.Scanner;

public class MultiArraays2 {
	
	public static void main(String[] args) {
		// 1. soru
		// kullanıcı tarafından satır ve sutunlar girilecek
		// kullanıcıdan bir simge alacağız ve simgeyi ekranda göstereceğiz.
		// 2 2
		
		int satir, sutun;
		String simge;
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen Bir Simge Giriniz");
		simge = klavye.nextLine();
		System.out.println("Lütfen Satır Sayısını Giriniz");
		satir = klavye.nextInt();
		System.out.println("Lütfen Sütun Sayısını Giriniz");
		sutun = klavye.nextInt();
		int[][] matrix = new int[satir][sutun];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "");
			}
			System.out.println(simge);
			
		}
		
		// + +
		// + +
		
		// 2. soru
		// kullanıcı tarafından satır ve sutun girilecek
		// random olarak tek elemanlı sayı girilsin
		// 1 2 3 4 5
		// ortasındaki sayi : diagonal
		// sayılardan büyük olanı üste girilecek
		// sayılardan kücük olanmı alcta gelecek
		
		// 3 5 5 5
		// 1 3 5 5
		// 1 1 3 5
		// 1 1 1 3
	}
	
}
