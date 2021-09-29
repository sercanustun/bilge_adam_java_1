package com.bilgeadam.boost.java.course01.lesson16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Examples_4 {
	// 8 lütfen tek sayı giriniz
	// /=Lütfen tek sayı giriniz
	public static void arrayNumber() {
		Scanner klavye = new Scanner(System.in);
		String tekSayi;
		char klavyeChar;
		int cevrilmisChar;
		// döngüyü kullanıcı tek sayı ve simge girmeyene kadar döngü devam etsin
		while (true) {
			System.out.println("Lütfen Tek Bir Sayı Giriniz.");
			tekSayi = klavye.nextLine();
			
			// isDigit için String to Char
			klavyeChar = tekSayi.charAt(0);
			// cast == > String to int
			cevrilmisChar = Integer.parseInt(tekSayi);
			Random rastgele = new Random();
			
			if ((Character.isDigit(klavyeChar)) && (cevrilmisChar % 2 == 1)) {
				int bas, orta, son;
				// Kullanıcı tek sayı girdiği yer ( son rakam bu olacağı için eleman sayısı bu )
				int[] dizi = new int[cevrilmisChar];
				
				for (int i = 0; i < cevrilmisChar; i++) {
					// bir kullanıcının girdiği sayıya kadar üst indis olacak
					int sayi = rastgele.nextInt(cevrilmisChar) + 1;
					dizi[i] = sayi;
					
				}
				// 1 2 3 4 5 6 7
				Arrays.sort(dizi);
				// forEach
				for (int temp : dizi)
				
				{
					System.out.println(temp + " ");
				}
				bas = dizi[0];
				son = dizi[dizi.length - 1];
				// son eleman + ilk eleman / 2
				orta = dizi[((dizi[dizi.length - 1]) + dizi[0]) / 2];
				System.out.println("Baş " + bas + "Orta " + orta + "Son" + son);
				int[] value = { bas, orta, son };
				www(value);
				
				break;
			} else {
				
				System.out.println("\n Tek Sayı veya Sayı Girmediniz");
			}
		}
	}
	
	public static void startArray(int[] value) {
		int satir, sutun;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen satır sayısı giriniz");
		satir = klavye.nextInt();
		System.out.println("Lütfen sutun sayısı giriniz");
		sutun = klavye.nextInt();
		int[][] matrix = new int[satir][sutun];
		// üstte kalan i<j
		// altta kalan
		// i=j
		// 00 01 02
		// 10 11 12
		// 20 21 22
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i > j) {
					matrix[i][j] = value[0];
					System.out.println(matrix[i][j] + " ");
				} else if (i < j) {
					matrix[i][j] = value[2];
					System.out.println(matrix[i][j] + " ");
				}
			}
		}
	}
	
}
