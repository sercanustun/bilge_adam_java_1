package com.bilgeadam.boost.java.course01.lesson26.ExceptionHandling;

public class _1ArithmeticExceptionTutorials {
	public static void sendEmail(Exception e) {
		System.out.println("Mail" + _1ArithmeticExceptionTutorials.class + e);
		
	}
	
	public static void main(String[] args) {
		// try catch throw throws finally
		// bir sayıyı sıfıra bölmek = tanımsız (sonsuz)
		// istisnamız
		try {
			int sayi = 3 / 0;
			System.out.println(sayi);
		} catch (ArithmeticException ai) {
			
			sendEmail(ai);
			
		} catch (Exception e) {
			sendEmail(e);
		}
		
		System.out.println("Program Devam Ediyor ... ");
	}
}
