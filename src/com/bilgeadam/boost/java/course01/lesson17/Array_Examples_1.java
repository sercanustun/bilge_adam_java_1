package com.bilgeadam.boost.java.course01.lesson17;

import java.util.Scanner;

public class Array_Examples_1 {
	// kullanıcı tarafından girilen Tek sayıya kadarki sayıların diziye atanması ve
	// ortancasını bulma algoritmasını yazalım
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5 6 7
		// (son terim+ilk terim)/2
		Scanner klavye = new Scanner(System.in);
		int rakam;
		System.out.println("Lütfen tek bir rakam giriniz");
		rakam = klavye.nextInt();
		int[] array = new int[rakam];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
	}
	
}
