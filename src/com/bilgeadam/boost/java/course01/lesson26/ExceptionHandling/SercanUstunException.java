package com.bilgeadam.boost.java.course01.lesson26.ExceptionHandling;

import java.util.Scanner;

public class SercanUstunException extends Exception {
	
	private static final long serialVersionUID = 1530316406290173746L;
	
	public SercanUstunException(String errorMessage) {
		super(errorMessage);
		
	}
	
	public static void main(String[] args) throws SercanUstunException {
		System.out.println("Kendi istisna durumunu yaptım");
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen pozitif bir sayı yazınız.");
		int sayi = klavye.nextInt();
		
		if (sayi < 0) {
			throw new SercanUstunException("Number istisnası ");
			
		} else {
			System.out.println("Girdiğiniz sayı " + sayi);
			
		}
		// System.out.println("devam ediyor");
	}
	
}
