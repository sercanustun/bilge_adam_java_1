package com.bilgeadam.boost.java.course01.lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Akşam yemeğine Ben Bugün Ne Yapsam ?
// Metot ve diziler List,Set,Map,
// Ana yemekler ===> Kuru fasülye ,Adana kebabı , Pilav vs.
// sıcak yemekle==> Mercimek çoprbası, domates çorbası
// içecekler==> su , soda , kola
// yemekten sonra içilecekler ==> çay kahve vs.
// tatlılar == revani , kıbrıs tatlısı v.s
// adanakebabı , mercimek çorbası , soda , çay , revani
public class YemekTarifi {
	
	// LAV
	
	public static String gunler() {
		String[] gun = new String[7];
		gun[0] = "Pazartesi";
		gun[1] = "Salı";
		gun[2] = "Çarşamba";
		gun[3] = "Perşembe";
		gun[4] = "Cuma";
		gun[5] = "Cumartesi";
		gun[6] = "Pazar";
		
		Random random = new Random();
		int sayi = random.nextInt(6); // 0 ile 6 arasında ki bileşenleri göstercek
		System.out.println(gun[sayi]);
		return gun[sayi];
		
	}
	
	// Ana Yemekler
	public static String anaYemekler() {
		List<String> anaYemekListesi = new ArrayList<String>();
		anaYemekListesi.add("Kebap");
		anaYemekListesi.add("Kuru");
		anaYemekListesi.add("Pilav");
		anaYemekListesi.add("Güveç");
		anaYemekListesi.add("İmam Bayıldı");
		anaYemekListesi.add("Türlü");
		anaYemekListesi.add("Dolma");
		
		Random random = new Random();
		int sayi = random.nextInt(anaYemekListesi.size());
		
		// System.out.println(anaYemekListesi.get(sayi));
		String ana = anaYemekListesi.get(sayi);
		// String ==> length()
		// arraylarda ==> length
		// collection ==> size()
		
	}
	
	public static void main(String[] args) {
		String gun = gunler();
		System.out.println(gun);
		String gun = anaYemekler();
		System.out.println(ana);
		
	}
	
}
