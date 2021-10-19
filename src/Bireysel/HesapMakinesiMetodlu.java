package Bireysel;

import java.util.Scanner;

public class HesapMakinesiMetodlu {
	
	static int sum(int a, int b) {
		int result = a + b;
		System.out.println("TOPLAM = " + result);
		return result;
		
	}
	
	static int minus(int a, int b) {
		int result = a - b;
		System.out.println("ÇIKARMA = " + result);
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1-TOPLAMA\n" + "2-ÇIKARMA\n" + "3-ÇARPMA\n" + "4-BÖLME\n" + "5-ÜSLÜ SAYI HESAPKAMA\n"
				+ "6-MOD ALMA\n" + "7-DİKTÖRTGEN ALAN VE ÇEVRE HESABI\n" + "0-ÇIKIŞ YAP\n";
		while (true) {
			System.out.println(menu);
			
			System.out.print("Bir işlem seçiniz : ");
			select = scan.nextInt();
			
			if (select == 0) {
				System.out.println("GÜLE GÜLE");
				break;
			}
			
			System.out.print("Lütfen İlk sayiyi giriniz ");
			int a = scan.nextInt();
			System.out.print("Lütfen ikinci sayiyi giriniz ");
			
			int b = scan.nextInt();
			switch (select) {
				case 1:
					sum(a, b);
					break;
				case 2:
					minus(a, b);
					break;
				
			}
		}
	}
}