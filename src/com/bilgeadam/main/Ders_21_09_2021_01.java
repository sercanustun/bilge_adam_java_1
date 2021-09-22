package com.bilgeadam.main;

public class Ders_21_09_2021_01 {
	
	public static void main(String[] args) {
		System.out.println("Seçilen sayı: " + createRandomNumber());
	}
	
	private static int createRandomNumber() {
		int retVal = 0;
		retVal = (int) Math.random();
		if (retVal == 12)
			retVal = createRandomNumber();
		retVal = (int) (Math.random());
		
		// do {
		// retVal = (int) (Math.random() * 20) + 1;
		// while (retVal == 12);
		return retVal;
	}
}
