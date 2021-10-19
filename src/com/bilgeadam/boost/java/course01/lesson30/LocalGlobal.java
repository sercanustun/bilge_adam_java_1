package com.bilgeadam.boost.java.course01.lesson30;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalGlobal {
	public static void main(String[] args) {
		Locale locale = new Locale("tr");
		ResourceBundle languageBundle = ResourceBundle.getBundle("com.bilgeadam.boost.java.course01.lesson30.text",
				locale);
		System.out.println(languageBundle.getString("LocalGlobal.HELLO"));
	}
	
}
