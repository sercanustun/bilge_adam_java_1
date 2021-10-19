package com.bilgeadam.boost.java.course01.MaratonDeneme;

import com.bilgeadam.boost.java.course01.util.BAUtils;

// PROGRAMI HER BAŞLATTIĞIMIZDA VERİLERİMİZ NASIL SABİT KALIR ?

// Verileri her seferinde elle girmemek için programda öğrenci , çalışan ve
// sınıflar için xml tipinde dosya oluştururuz ve her eklediğimiz öğrenci ,
// çalışan ve sınıfı bufferedWriter ile bu xml dosyalarının
// içine kaydederiz.Bu veriler lazım olduğu zamanda ise bufferedReader kullanıp
// bu dosyaları okuruz.

public class OYSMainTest {
	
	public static void main(String[] args) {
		
		BAUtils.header("OYS SİSTEMİNE HOŞ GELDİNİZ");
		OYS oys = new OYS();
		oys.allMethod();
		
	}
	
}
