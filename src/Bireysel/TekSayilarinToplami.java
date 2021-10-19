package Bireysel;

import java.util.Scanner;

public class TekSayilarinToplami {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int num;
		int i;
		int toplam = 0;
		System.out.println("Lütfen Sınır Sayısı Veriniz");
		num = klavye.nextInt();
		
		for (i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				// System.out.println(i);
				toplam += i;
				System.out.println("TOPLAM = " + toplam);
			}
			
		}
		
	}
	
}
