package com.bilgeadam.examples;

import java.util.Scanner;

public class PasswordRepassword {
	// kullan�c�n�n �nce passrod repassword(constant) verileri als�n ayn� veri mi
	// de�ilmi
	
	private static final String Sercan123 = null;
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		String password, rePassword;
		System.out.println("L�tfen �ifrenizi giriniz");
		password = Input.nextLine();
		
		System.out.println("L�tfen �ifrenizi tekrar giriniz");
		rePassword = Input.nextLine();
		if (password.equals(rePassword)) {
			System.out.println("�ifreniz ayn�d�r");
		} else {
			System.out.println("�ifreler birbirine uymad�");
			
		}
	}
	// Valuof ile parseInt aras�ndaki fark
	// primitive ile wrapper aras�ndaki fark
	// cast: boxing/ unboxing �al��
	
}
