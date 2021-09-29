package Odev;

import java.util.Random;
import java.util.Scanner;

public class SingleArrayOdev {
	
	public static int numberOfElement() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen dizinin eleman sayısı");
		int number = klavye.nextInt();
		return number;
	}
	
	public static int topNumber() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen rastgele sayı için üst indisi giriniz.");
		int number = klavye.nextInt();
		return number;
	}
	
	public static int[] randomArray() {
		
		int[] dizi = new int[numberOfElement()];
		
		Random randomNumber = new Random();
		int topIndis = topNumber();
		int number;
		
		for (int i = 0; i < dizi.length; i++) {
			number = randomNumber.nextInt(topIndis) + 1;
			dizi[i] = number;
		}
		return dizi;
		
	}
	
	public static void allElementArray() {
		
		int toplam = 0, tekSayilar = 0, ciftSayilar = 0;
		double ortalama = 0.0;
		
		int[] dizi = randomArray();
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
			toplam = toplam + dizi[i];
			if (dizi[i] % 2 == 0) {
				ciftSayilar++;
			} else {
				tekSayilar++;
			}
			
		}
		System.out.println("\ntoplamları: " + toplam);
		System.out.println("ortalaması: " + (ortalama = toplam / (dizi.length)));
		System.out.println("Tek sayılar: " + tekSayilar);
		System.out.println("Çift sayılar: " + ciftSayilar);
		System.out.println("dizinin ilk elemanı: " + dizi[0]);
		System.out.println("dizinin son elemanı: " + dizi[dizi.length - 1]);
		int tekDizi = tekSayilar;
		System.out.println(tekDizi);
		
	}
	
	public static void main(String[] args) {
		allElementArray();
		
	}
	
}