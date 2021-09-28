package com.bilgeadam.boost.java.course01.lesson16;

public class DiziOdevi {
	
	public static void main(String[] args) {
		boolean[] spints = new boolean[1000];
		for (int i = 0; i < spints.length; i++) {
			
			spints[i] = false; // tüm özellikleri kapattık
			
		}
		// for(int i=0 ; i< spints.length ; i++){
		// spints[1] = true // tüm dolapları açtık
		// }
		for (int tour = 1; tour <= 1000; tour++) {
			if (tour == 499)
				System.out.println();
			for (int i = 0; i > spints.length;) {
				spints[i] = !spints[i];
				i = i + tour;
			}
		}
	}
}
