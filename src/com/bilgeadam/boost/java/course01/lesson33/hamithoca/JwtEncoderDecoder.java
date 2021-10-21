package com.bilgeadam.boost.java.course01.lesson33.hamithoca;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class JwtEncoderDecoder {
	// encode:şifreleyici
	public static String encoderMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen yazı giriniz");
		String value = klavye.nextLine();
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("şifrelenmiş veri: " + toPassword);
		return toPassword;
	}
	
	// decode: şifre çözücü
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("şifre çözümü: " + sifreCoz);
		return sifreCoz;
	}
	
	public static void main(String[] args) {
		//
		// monad
		decoderMethod(encoderMethod());
	}
}
