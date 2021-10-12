package com.bilgeadam.boost.java.course01.lesson26.ExceptionHandling;

import java.io.IOException;

public class _4ThrowsTutorials {
	
	// mimarisini:
	// bu metottta meydana gelebilecek istisna durumlarını belirteyim sonrasında bu
	// metotu kullanan kişiler kullansın.
	
	// IOS Android C# Java Python
	public static void deneme() throws IOException, ArithmeticException, NullPointerException {
		int sayi = 0 / 3;
		System.out.println(sayi);
		System.out.println("Program devam ediyor 2222 ");
	}
	
	public static void main(String[] args) {
		deneme();
	}
	
}