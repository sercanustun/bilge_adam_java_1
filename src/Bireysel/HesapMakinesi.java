package Bireysel;

import java.util.Scanner;

public class HesapMakinesi {
	
	public static void ifIleHesap() {
		int num1, num2, select;
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz");
		num1 = klavye.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz");
		num2 = klavye.nextInt();
		
		System.out.println("1-TOPLAMA \n2-ÇIKARMA \n3-ÇARPMA \n4-BÖLME");
		System.out.println("Seçiminiz : ");
		select = klavye.nextInt();
		
		if (select == 1) {
			System.out.println("TOPLAM : " + (num1 + num2));
		} else if (select == 2) {
			System.out.println("ÇIKARMA : " + (num1 - num2));
			
		} else if (select == 3) {
			System.out.println("ÇARPMA : " + (num1 * num2));
			
		} else if (select == 4) {
			System.out.println("BÖLME : " + (num1 / num2));
		} else {
			System.out.println("Yanlış sayı girdiniz. TEKRAR DENEYİNİZ");
		}
	}
	
	public static void SwitchIleHesap() {
		int num1, num2, select;
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz");
		num1 = klavye.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz");
		num2 = klavye.nextInt();
		
		System.out.println("1-TOPLAMA \n2-ÇIKARMA \n3-ÇARPMA \n4-BÖLME");
		System.out.println("Seçiminiz : ");
		select = klavye.nextInt();
		
		switch (select) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.println(num1 * num2);
				break;
			case 4:
				System.out.println(num1 / num2);
				break;
			
		}
		
	}
	
	public static void main(String[] args) {
		// ifIleHesap();
		SwitchIleHesap();
	}
}
