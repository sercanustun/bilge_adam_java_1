
package com.bilgeadam.examples;

// 2 tane de�i�ken ve
// x=6; y=2;
// toplama: 8
// �arpma: 12
// ��karma:x-y: 4
// b�lme:3
// mod % :0
public class Examples_003_hesapMakinasi {
	
	public static void main(String[] args) {
		
		int sayi1, sayi2, toplama, cikarma, bolme, carpma, mod;
		sayi1 = 6;
		sayi2 = 2;
		toplama = sayi1 + sayi2;
		cikarma = sayi1 - sayi2;
		carpma = sayi1 * sayi2;
		bolme = sayi1 / sayi2;
		mod = sayi1 % sayi2;
		System.out.println("say�1:" + sayi1 + " say�2:" + sayi2 + " Toplama sonuc: " + toplama);
		System.out.println("say�1:" + sayi1 + " say�2:" + sayi2 + " cikarma sonuc: " + cikarma);
		System.out.println("say�1:" + sayi1 + " say�2:" + sayi2 + " carpma sonuc: " + carpma);
		System.out.println("say�1:" + sayi1 + " say�2:" + sayi2 + " bolme sonuc: " + bolme);
		System.out.println("say�1:" + sayi1 + " say�2:" + sayi2 + " mod sonuc: " + mod);
		
	}
	
}