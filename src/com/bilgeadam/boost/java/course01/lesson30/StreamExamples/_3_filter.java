package com.bilgeadam.boost.java.course01.lesson30.StreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// forEach() :ekrana listeli göstermek
// Stream() :akışın başladığı yerdir
// sorted() :sıralama
// collect() :mühürleme
// filter() verilerden istediklerimizi almak için kuıllanırız
// filterde lambda expession kullanıyoruz
// () = parametre
// -> = ok yönü
// {} =

// java 10 da var diye bir değişken var onu araştırın.

public class _3_filter {
	public static void main(String[] args) {
		
		List<String> orginalList = new ArrayList<String>();
		orginalList.add("Malatya");
		orginalList.add("Malatya");
		orginalList.add("Malatya");
		orginalList.add("nevşehir");
		orginalList.add("Malatya");
		orginalList.add("bitlis");
		for (int i = 0; i < orginalList.size(); i++) {
			System.out.println(orginalList.get(i));
			
		}
		
		String search = "Malatya";
		// listenin içindeki geçen malatyaları göstersin
		List<String> listem = Arrays.asList("Malatya", "Malatya", "Malatya", "nevşehir", "elazığ", "Malatya", "bitlis")
				.stream().filter((temp) -> "Malatya".equals(temp)).collect(Collectors.toList());
		listem.forEach(System.out::println);
		System.out.println(listem.size() + " tane eleman var");
		
		// Listenin içindeki malatyaları göstermesin diğerlerini göstersin
		List<String> listem2 = orginalList.stream().filter((Ali) -> !"Malatya".equals(Ali))
				.collect(Collectors.toList());
		listem2.forEach(System.out::println);
		System.out.println(+listem2.size() + " tane eleman var");
		
	}
	
}
