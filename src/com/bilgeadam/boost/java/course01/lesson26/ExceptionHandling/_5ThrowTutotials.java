package com.bilgeadam.boost.java.course01.lesson26.ExceptionHandling;

// bazen projelerimizde isteyerek istisna oluştururuz ki istisna durumunda
// kalsın
// devam etmesin . Bu yapıya biz throw diyoruz.
public class _5ThrowTutotials {
	public static void main(String[] args) {
		System.out.println("Hata meydana gelsin");
		
		throw new ArrayIndexOutOfBoundsException("Burada istisna meydana geldi.");
		
		// System.out.println("Program devam ediyor ");
		
	}
}
