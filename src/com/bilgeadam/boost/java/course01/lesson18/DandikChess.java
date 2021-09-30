package com.bilgeadam.boost.java.course01.lesson18;

import java.util.Scanner;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class DandikChess {
	public static void main(String[] args) {
		
		BAUtils.header("Atın Hareketleri");
		
		System.out.println("Lütfen Atın Bulunduğu Yatay Pozisyonu Rakam Olarak Giriniz.");
		Scanner klavye = new Scanner(System.in);
		int yatayPoziyon = klavye.nextInt();
		System.out.println("Lütfen Atın Bulunduğu Düşey Pozisyonu Rakam Olarak Giriniz.");
		Scanner klavye2 = new Scanner(System.in);
		int duseyPozisyon = klavye2.nextInt();
		
		System.out.println("At " + yatayPoziyon + duseyPozisyon + "Pozisyonunda Gidebileceği Yerler: "
				+ (yatayPoziyon - 1) + (duseyPozisyon + 1) + " " + (yatayPoziyon) + (duseyPozisyon + 2) + " " + " "
				+ (yatayPoziyon + 2) + (duseyPozisyon + 2) + " " + (yatayPoziyon + 3) + (duseyPozisyon + 1) + " "
				+ (yatayPoziyon + 3) + (duseyPozisyon - 1) + " " + (yatayPoziyon + 2) + (duseyPozisyon - 2) + " "
				+ (yatayPoziyon) + (duseyPozisyon - 2) + " " + (yatayPoziyon - 1) + (duseyPozisyon - 1) + " Dir"
		
		);
		
		do {
			
		} while (BAUtils.wantToEnd("Devam Etmek İster Misiniz ?", "Hayır"));
		BAUtils.footer();
		
	}
}