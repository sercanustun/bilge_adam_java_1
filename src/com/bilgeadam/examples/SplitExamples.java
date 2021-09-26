package com.bilgeadam.examples;

import java.util.StringTokenizer;

public class SplitExamples {
	public static void main(String[] args) {
		// String metodu ile paraçalama yapabiliriz
		String kelime = "Servlet JSP Jsf& Jdbc Hibernate";
		String[] dizi = kelime.split(" ");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
			
		}
		System.out.println("");
		// ForEach Döngüsü
		for (String temp : dizi) {
			System.out.println(temp);
		}
		
		// StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(kelime, "");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}
}
