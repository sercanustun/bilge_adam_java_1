package Bireysel;

import java.util.Scanner;

public class Borc3Ay {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		for (int i = 0; i < 3; i++) {
			int payment = ((amount * 10) / 100);
			int remaining = amount - payment;
			System.out.println("ödeme" + payment);
			System.out.println("kalan" + remaining);
			amount = remaining;
		}
		
	}
}
