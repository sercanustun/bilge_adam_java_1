package com.bilgeadam.boost.java.course01.lesson16;

import java.util.Scanner;

public class TeamPlayer2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Takımın kaç oyuncusu var");
		
		int size = sc.nextInt();
		System.out.print("Yaşınız ");
		int age = sc.nextInt();
		sc.nextLine();
		String[] teamPlayers = new String[size];
		
		for (int i = 0; i < teamPlayers.length; i++) {
			System.out.print("Oyuncu Adı ");
			teamPlayers[i] = sc.nextLine();
		}
		int i = 1;
		while (i <= size) {
			System.out.println(i + "Oyuncu " + teamPlayers[i - 1]);
			i++;
		}
		sc.close();
		
	}
	
}
