package com.bilgeadam.examples;

public class StringBuilderExamples {
	public static void main(String[] args) {
		// StringBuilder builder = new StringBuilder();
		// builder.append("sercan ").append("üstün ").append("JavaSE ").append("23");
		// String birlestir = builder.toString();
		// System.out.println(birlestir);
		
		StringBuffer builder = new StringBuffer();
		builder.append("sercan ").append("üstün ").append("JavaSE ").append("23");
		String birlestir = builder.toString();
		System.out.println(birlestir);
		
		// ikisi arasındaki farklara bakalım .
		
		// StringBuffer- StringBuilder
		// Slower- Faster
		// Thred-safe -Non-Thred-safe
		
	}
}
