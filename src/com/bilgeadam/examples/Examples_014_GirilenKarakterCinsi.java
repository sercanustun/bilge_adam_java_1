
package com.bilgeadam.examples;

import java.util.Scanner;

public class Examples_014_GirilenKarakterCinsi {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		boolean isResult = true;
		while (isResult) {
			System.out.println("l�tfen bir karakter giriniz");
			String simge;
			simge = klavye.nextLine();
			char karakter = simge.charAt(0);
			
			if (Character.isDigit(karakter)) {
				System.out.println("Bu bir say�d�r");
			} else if (Character.isLetter(karakter)) {
				System.out.println("Bu bir harftir");
			} else {
				System.out.println("�zel simgedir.");
			}
		}
		
	}
	
}