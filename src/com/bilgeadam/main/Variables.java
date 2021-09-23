package com.bilgeadam.main;

public class Variables {
	static String text;
	String anotherText;
	String ss = "lkgsdfs";
	
	public static void main(String[] args) {
		text = "Nasýlsýnýz?";
		
		System.out.println(text);
		Variables vars = new Variables();
		System.out.println(vars.anotherText);
	}
	
	void anotherMethod() {
		// System.out.println(sss);
		System.out.println(text);
		System.out.println(anotherText);
		
	}
	
	static void aMethod() {
		System.out.println(text);
		// System.out.println(anotherText);
		
	}
	
}