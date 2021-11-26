package com.bilgeadam.boost.java.course01.factory.animalfactory;

import java.util.Scanner;

public class PetShop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen istediğiniz hayvanı giriniz: ");
		String animalType = sc.nextLine();
		
		Animal animal = AnimalFactory.create(animalType);
		animal.giveVoice();
		
		System.out.println(animal.getClass().getSimpleName());
		if (!animal.isPet())
			System.out.println("Aslan ev hayvanı değildir, satışı yasak");
		
		sc.close();
		
	}
	
}