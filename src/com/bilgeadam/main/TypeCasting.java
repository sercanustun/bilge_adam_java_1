package com.bilgeadam.main;

public class TypeCasting {
	public static void main(String[] args) {
		
		int lowerType = 234;
		long higherType = lowerType;
		higherType = 12345567854L;
		System.out.println(lowerType + " " + higherType);
		lowerType = (int) higherType;
		System.out.println(lowerType + " " + higherType);
		
	}
}
