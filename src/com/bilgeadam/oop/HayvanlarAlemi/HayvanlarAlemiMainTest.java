package com.bilgeadam.oop.HayvanlarAlemi;

import com.bilgeadam.oop.HayvanlarAlemi.Omurgalilar.Kuslar.EKusIsimler;
import com.bilgeadam.oop.HayvanlarAlemi.Omurgalilar.Kuslar.Kus;
import com.bilgeadam.oop.HayvanlarAlemi.Omurgasizlar.Kabuklular.Kabuklular;

public class HayvanlarAlemiMainTest {
	
	public static void main(String[] args) {
		
		// kuş: papagan,serce,muhabbetkuşu,kartal,atmaca
		
		// parametresiz
		Kus kus = new Kus();
		
		kus.setAdi(EKusIsimler.PAPAGAN.name());
		kus.setHareket("Omurgalı Kuş Hareketli xym");
		kus.setTuketim("Omurgalı Kuş tüketim");
		kus.setUreme(" Omurgalı Kuş üreme");
		kus.setYumurta("Omurgalı Mavi yuvarta");
		System.out.println(kus.getAdi() + " " + kus.getHareket() + " " + kus.getTuketim() + " " + kus.getUreme() + " "
				+ kus.getYumurta());
		
		System.out.println("-------------------------------");
		// parametreli
		
		Kabuklular kabuklular = new Kabuklular("ıstakoz", "Omurgasız kabuklu üreme", "omurgasız kabuklu tüketim",
				"omurgasız hareket", "omurgasız dış iskelet");
		System.out.println(kabuklular);
		
	}
	
}