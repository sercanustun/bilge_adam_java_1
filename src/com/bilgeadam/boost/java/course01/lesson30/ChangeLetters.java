package com.bilgeadam.boost.java.course01.lesson30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChangeLetters {
	/**
	 * COUNT = değişilik sayısı
	 * VALUE = Yeni Metin sayısı
	 *
	 * @param msg
	 * @return
	 */
	public static Map<String, String> changeTRCharecter(String msg) {
		final List<Character> trKey = Arrays.asList('ö', 'ç', 'ş', 'ı', 'ğ', 'ü', 'Ö', 'Ç', 'Ş', 'İ', 'Ğ', 'Ü');
		final List<Character> enKey = Arrays.asList('o', 'c', 's', 'i', 'g', 'u', 'O', 'C', 'S', 'I', 'G', 'U');
		StringBuilder newStr = new StringBuilder();
		int count = 0;
		char[] charArray = msg.toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			if (trKey.contains(charArray[i])) {
				newStr.append(enKey.get(trKey.indexOf(charArray[i])));
				count++;
			} else {
				newStr.append(charArray[i]);
			}
		}
		Map<String, String> map = new HashMap<>();
		map.put("COUNT", String.valueOf(count));
		map.put("VALUE", newStr.toString());
		
		return map;
		
	}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		boolean correctInput = true ;
		do {
			
		}
	}
	
}
