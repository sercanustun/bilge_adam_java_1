
package com.bilgeadam.examples;

import java.util.Scanner;

/*
 * 1=pazartesi
 * 2=
 * 3=
 * 4=
 * 5=
 * 6=
 * 7=pazar
 */
public class Examples_007_HaftaninGunleri {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen 1-7 aras�nda  say� olarak giriniz");
		int gun = klavye.nextInt();
		
		if (gun > 0) {
			switch (gun) {
				case 7:
					System.out.println("Pazar");
					break;
				case 1:
					System.out.println("Pazartesi");
					break;
				case 2:
					System.out.println("sal�");
					break;
				case 3:
					System.out.println("�ar�amba");
					break;
				case 4:
					System.out.println("per�embe");
					break;
				case 5:
					System.out.println("cuma");
					break;
				case 6:
					System.out.println("cumartesi");
					break;
				
				default:
					System.out.println("L�tfen belirtilen aral�kta say� giriniz");
					break;
			}
		} else {
			System.out.println("L�tfen s�f�rdan b�y�k say� giriniz");
		}
		klavye.close();
		
	}
	
}