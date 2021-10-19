package Bireysel;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen Matematik Dersinin Sınav Puanını Giriniz.");
		int matematik = klavye.nextInt();
		System.out.println("Lütfen Fizik Dersinin Sınav Puanını Giriniz.");
		int fizik = klavye.nextInt();
		System.out.println("Lütfen Kimya Dersinin Sınav Puanını Giriniz.");
		int kimya = klavye.nextInt();
		System.out.println("Lütfen Türkçe Dersinin Sınav Puanını Giriniz.");
		int turkce = klavye.nextInt();
		System.out.println("Lütfen Tarih Dersinin Sınav Puanını Giriniz.");
		int tarih = klavye.nextInt();
		System.out.println("Lütfen Müzik Dersinin Sınav Puanını Giriniz.");
		int muzik = klavye.nextInt();
		
		double ortalama = (muzik + tarih + turkce + kimya + fizik + matematik) / 6.0;
		
		if (ortalama > 50) {
			System.out.println("Not Ortalamanız " + ortalama);
			System.out.println("Geçtiniz =)");
			
		} else {
			
			System.out.println("Not Ortalamanız " + ortalama);
			System.out.println("Kaldınız =(");
		}
	}
	
}
