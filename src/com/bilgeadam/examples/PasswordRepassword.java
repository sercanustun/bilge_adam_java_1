package com.bilgeadam.examples;

import java.util.Scanner;

public class PasswordRepassword {
	// kullanýcýnýn önce passrod repassword(constant) verileri alsýn ayný veri mi
	// deðilmi
	
	private static final String Sercan123 = null;
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		String password, rePassword;
		System.out.println("Lütfen Þifrenizi giriniz");
		password = Input.nextLine();
		
		System.out.println("Lütfen Þifrenizi tekrar giriniz");
		rePassword = Input.nextLine();
		if (password.equals(rePassword)) {
			System.out.println("Þifreniz aynýdýr");
		} else {
			System.out.println("Þifreler birbirine uymadý");
			
		}
	}
	// Valuof ile parseInt arasýndaki fark
	// primitive ile wrapper arasýndaki fark
	// cast: boxing/ unboxing çalýþ
	
}
