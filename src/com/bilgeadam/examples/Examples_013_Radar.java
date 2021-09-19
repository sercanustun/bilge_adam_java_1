
package com.bilgeadam.examples;

import java.util.Scanner;

/*
 * Kullan�c� :
 * 80<=hiz<=85 ==> hizli gidiyorsunuz l�tfen yava�lay�n�z cezan�n: 200TL e�er
 * erken �derseniz %15 indirim alacaks�n�z.
 * 85<hiz<=100 ==> �ok hizli gidiyorsunuz l�tfen yava�lay�n�z: 300 TL e�er
 * erken �derseniz %15 indirim alacaks�n�z.
 * 100<hiz �ok hizli gidiyorsunuz !!!! 1000 TL ve ehliyetinize
 * el konulacak.
 */
public class Examples_013_Radar {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("L�tfen h�z giriniz");
			int hiz = klavye.nextInt();
			double para = 0;
			
			if ((80 <= hiz) && (hiz <= 85)) {
				System.out.println("hizli gidiyorsunuz " + hiz + " l�tfen yava�lay�n�z");
				para = 200.0;
				para = para - (para * (15.0 / 100.0));
				System.out.println(para);
				System.out.println(
						"cezan�z: 200TL e�er  erken �derseniz %15 indirim alacaks�n�z indirimli fiyat " + para);
			} else if ((85 < hiz) && (hiz <= 100)) {
				System.out.println("�ok hizli gidiyorsunuz " + hiz + " l�tfen yava�lay�n�z");
				para = 300.0;
				para = para - (para * (15.0 / 100.0));
				System.out.println(
						"cezan�z: 300TL e�er  erken �derseniz %15 indirim alacaks�n�z indirimli fiyat " + para);
			} else if (hiz > 100) {
				System.out.println("hiz�n�z: " + hiz + "ehliyetinize  el konulacak");
				para = 1000.0;
				System.out.println("cezan�z: " + para);
				
			} else {
				System.out.println("Her �ey normal");
				// isTrue=false;
			}
		}
		
	}
	
}