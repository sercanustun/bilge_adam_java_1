package com.bilgeadam.boost.java.course01.util;

public class BilgeAdamUtilsTest {
	
	public static void main(String[] args) {
		BAUtils.header("oldu mu?");
		boolean proceeding = true;
		do {
			String str = BAUtils.readString("Lütfen bir değer giriniz");
			System.out.println("Okunan değer: " + str);
			
			int j = BAUtils.readInt("Lütfen bir tam sayı giriniz");
			System.out.println("Okunan değer: " + j);
			
			double d = BAUtils.readDouble("Lütfen bir virgüllü sayı giriniz");
			System.out.println("Okunan değer: " + d);
			
			int[] inputs = BAUtils.readInt("Lütfen ", "tam sayı giriniz", 4);
			
			for (int i = 0; i < inputs.length; i++) {
				System.out.println(i + ". girilen değer: " + inputs[i]);
			}
			
			proceeding = BAUtils.proceeding("Devam etmek istiyor musunuz? (Evet / Hayır)", "Hayır");
		} while (!proceeding);
		
		// boolean proceed = BAUtils.proceeding("Devam etmek istiyor musunuz) (Evet /
		// Hayır)", "Evet");
		// System.out.println("Okunan değer: " + proceed);
		// int[] ints = BAUtils.readInt("Lütfen", "adet tam sayı giriniz", 10);
		// System.out.println("Okunan değer: " + ints);
		
		BAUtils.footer();
		
	}
	
}
