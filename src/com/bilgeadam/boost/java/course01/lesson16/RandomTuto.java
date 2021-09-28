package com.bilgeadam.boost.java.course01.lesson16;

import java.util.Random;

public class RandomTuto {
	
	public static void main(String[] args) {
		// random = rastgele sayılar veren yapıdır.
		// 1-) Math = Random
		double rastgeleSayi = Math.floor(Math.random() * 5 + 1);
		// 1 <= x <= 5
		System.out.println(rastgeleSayi);
		
		// 2-) Class düzeyinden olan -> OOP daha yakınd
		// java.util
		Random rastgeleClass = new Random();
		// 1 <= x <= 4
		int rastgeleSayi2 = rastgeleClass.nextInt(4) + 1;
		System.out.println(rastgeleSayi2);
	}
	
}
