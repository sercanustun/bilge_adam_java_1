package Bireysel;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("LÜTFEN KELİME GİRİNİZ");
		String kelime = klavye.nextLine();
		System.out.println("Girdiğiniz kelime = " + kelime);
		String cevrilmisKelime = kelime.replace("ı", "i");
		System.out.println("Çevrilmiş kelime  " + cevrilmisKelime);
		System.out.println(kelime.concat("-SONRADAN EKLEDİM"));
		
	}
}
