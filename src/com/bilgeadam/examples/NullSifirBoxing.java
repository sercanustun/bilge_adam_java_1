package com.bilgeadam.examples;

import java.util.Scanner;

public class NullSifirBoxing {
	
	public static void main(String[] args) {
		// null i�erde hi� bir�ey yok
		// s�f�r olu�turulmu� bir �ey var ama i�inde de�eri s�f�r
		// boxing primitiv t�r� wrapper t�re benzetme
		// unboxing wrapper t�r� pirkmitiv t�re benzetiyoruz
		// DataType=primitive+wrapper class
		// primitive types: byte,short,int,long,boolean,char,float,double
		
		// int sayi = 5;
		// wrapper class
		
		// kullan�c�dan alm�� oldu�umuz byte t�r�ndeki primitive say�y� Boxing yapan
		// algoritma?
		
		// BOXING
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz. -128<= x<=127");
		
		byte primitivNumber = klavye.nextByte();
		
		Byte wrapperNumber = primitivNumber; // BOXING
		
		System.out.println(wrapperNumber);
		
		// UNBOXING
		// Long wrapperSayi = new Long(44);
		// long primitiveSayi = wrapperSayi; // UNBOXING
	}
	
}
