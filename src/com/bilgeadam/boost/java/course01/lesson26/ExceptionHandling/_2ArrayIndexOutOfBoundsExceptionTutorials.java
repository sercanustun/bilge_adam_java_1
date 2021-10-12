package com.bilgeadam.boost.java.course01.lesson26.ExceptionHandling;

public class _2ArrayIndexOutOfBoundsExceptionTutorials {
	public static void main(String[] args) {
		int[] dizi = new int[5];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(dizi[temp] + " ");
		}
		System.out.println(" ");
		try {
			// olmayan dizinin elemanına erişmeye çalışıyorsunuz.
			System.out.println(dizi[4]);
		} catch (ArrayIndexOutOfBoundsException aib) {
			aib.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program Devam Ediyor 2222 ");
	}
}
