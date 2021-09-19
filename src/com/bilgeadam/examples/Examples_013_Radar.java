
package com.bilgeadam.examples;

import java.util.Scanner;

/*
 * Kullanýcý :
 * 80<=hiz<=85 ==> hizli gidiyorsunuz lütfen yavaþlayýnýz cezanýn: 200TL eðer
 * erken öderseniz %15 indirim alacaksýnýz.
 * 85<hiz<=100 ==> çok hizli gidiyorsunuz lütfen yavaþlayýnýz: 300 TL eðer
 * erken öderseniz %15 indirim alacaksýnýz.
 * 100<hiz çok hizli gidiyorsunuz !!!! 1000 TL ve ehliyetinize
 * el konulacak.
 */
public class Examples_013_Radar {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("Lütfen hýz giriniz");
			int hiz = klavye.nextInt();
			double para = 0;
			
			if ((80 <= hiz) && (hiz <= 85)) {
				System.out.println("hizli gidiyorsunuz " + hiz + " lütfen yavaþlayýnýz");
				para = 200.0;
				para = para - (para * (15.0 / 100.0));
				System.out.println(para);
				System.out.println(
						"cezanýz: 200TL eðer  erken öderseniz %15 indirim alacaksýnýz indirimli fiyat " + para);
			} else if ((85 < hiz) && (hiz <= 100)) {
				System.out.println("çok hizli gidiyorsunuz " + hiz + " lütfen yavaþlayýnýz");
				para = 300.0;
				para = para - (para * (15.0 / 100.0));
				System.out.println(
						"cezanýz: 300TL eðer  erken öderseniz %15 indirim alacaksýnýz indirimli fiyat " + para);
			} else if (hiz > 100) {
				System.out.println("hizýnýz: " + hiz + "ehliyetinize  el konulacak");
				para = 1000.0;
				System.out.println("cezanýz: " + para);
				
			} else {
				System.out.println("Her þey normal");
				// isTrue=false;
			}
		}
		
	}
	
}