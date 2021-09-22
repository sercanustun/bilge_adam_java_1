package com.bilgeadam.examples;

public class Kelime_Oyunlari {
	
	public static void main(String[] args) {
		String kelime = "java Servlet jsp Jsf Spring";
		// System.out.println(kelime);
		// System.out.println("simge sayýsý: " + kelime.length());
		// System.out.println(kelime.toUpperCase());
		// System.out.println(kelime.toLowerCase());
		// String kelime2 = kelime.replace('ý', 'i');
		// // System.out.println(kelime);
		// System.out.println(kelime2);
		// System.out.println(kelime);
		// System.out.println(kelime.concat(" -sonradan ekledim").concat(" 44"));
		// System.out.println(kelime.substring(3));
		// System.out.println(kelime.substring(0, 2).concat("***"));
		// System.out.println("Simge sayýsý "+kelime.length());
		// System.out.println("baþýndaki ve sonundaki boþluklarý
		// al"+kelime.trim().length());
		// System.out.println("ile mi baþlýyor "+kelime.startsWith("H"));
		// System.out.println("ile mi bitiyor "+kelime.endsWith(" "));
		// System.out.println(kelime.isEmpty()); // dolu=false
		// if (!kelime.isEmpty()) {
		// System.out.println("dolu");
		// } else {
		// System.out.println("boþ");
		// }
		// String cumle = "Jsp".toLowerCase();
		// System.out.println(kelime.indexOf(cumle));
		// System.out.println(kelime.charAt(0));
		// java Servlet jsp Jsf Spring
		System.out.println(kelime.contains("java Servlet jsp Jsf Spring"));
		System.out.println(kelime.contains("Java Servlet jsp Jsf Spring"));
		System.out.println(kelime.contains("Servlet"));
		// kullanýcýnýn girmiþ olduðu bir kelimenin;
		// eleman sayýsýný ?
		// bütün karakterleri küçük yapsýn
		// bütün karakterleri büyük yapsýn
		// baþý a ile baiþlýyorsa evet a ile baþlýyor
		// sonu a ile bitiyorsa evet a ile bitiyor
		// 0 -10 arasýndaki bize göstersin sonuna ...
		// kelimenin sonuna "Bilge Adam" eklensin
		
	}
	
}
