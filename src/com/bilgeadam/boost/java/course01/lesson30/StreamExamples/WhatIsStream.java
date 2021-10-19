package com.bilgeadam.boost.java.course01.lesson30.StreamExamples;

import java.util.Arrays;

public class WhatIsStream {
	// Stream() Akıştır.
	// Kodlarımızı daha az yazmak çok uğraşmamak
	// InputStream() OutputStream() ile Stream() karıştırma..!
	public static void iterativeArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraş" };
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
			
		}
	}
	
	public static void StreamArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraş" };
		// Stream ancak collectiondan kullanıyoruz bunun için diziyi liste çevirmemiz
		// lazım
		Arrays.asList(dizi).stream().forEach(System.out::print);
		;
	}
	
	public static void main(String[] args) {
		System.out.println("İterative For");
		iterativeArray();
		System.out.println("\n***************************");
		System.out.println("Stream Array");
		StreamArray();
	}
	
}
