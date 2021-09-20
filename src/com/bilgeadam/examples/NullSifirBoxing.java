package com.bilgeadam.examples;

import java.util.Scanner;

public class NullSifirBoxing {
	
	public static void main(String[] args) {
		// null içerde hiç birþey yok
		// sýfýr oluþturulmuþ bir þey var ama içinde deðeri sýfýr
		// boxing primitiv türü wrapper türe benzetme
		// unboxing wrapper türü pirkmitiv türe benzetiyoruz
		// DataType=primitive+wrapper class
		// primitive types: byte,short,int,long,boolean,char,float,double
		
		// int sayi = 5;
		// wrapper class
		
		// kullanýcýdan almýþ olduðumuz byte türündeki primitive sayýyý Boxing yapan
		// algoritma?
		
		// BOXING
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz. -128<= x<=127");
		
		byte primitivNumber = klavye.nextByte();
		
		Byte wrapperNumber = primitivNumber; // BOXING
		
		System.out.println(wrapperNumber);
		
		// UNBOXING
		// Long wrapperSayi = new Long(44);
		// long primitiveSayi = wrapperSayi; // UNBOXING
	}
	
}
