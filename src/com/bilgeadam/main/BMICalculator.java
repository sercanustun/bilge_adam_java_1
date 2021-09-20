package com.bilgeadam.main;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		System.out.println("\t\t=============================");
		System.out.println("\t\tWelcome to the BMI Calculator");
		System.out.println("\t\t=============================");
		double weight, height;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\tLütfen boyunuzu metre cinsinden giriniz.");
		height = scan.nextDouble();
		
		System.out.println("\t\tLütfen kilonuzu kilogram cinsinden giriniz.");
		weight = scan.nextDouble();
		System.out.println();
		double bmi = weight / (height * height);
		// kare alırken Math.poowe(height, 2) kullanabiliriz
		System.out.printf("==>Hesaplanan vücut kütle endeksiniz %.2f ' dir.", bmi);
		if (bmi < 18.5) {
			System.out.println("18.5 kg/m^2'nin altında olanlar:Zayıf.");
		} else if (bmi >= 18.5 && bmi < 24.9)
		
		{
			System.out.println("18.5-24.9 kg/m^2 arasında olanlar:Normal Kilolu.");
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("25-25.9 kg/m^2 arasında olanlar:Fzla Kilolu.");
		} else if (bmi >= 30 && bmi < 39.9) {
			
			System.out.println("30-39.9 kg/m^2 arasında olanlar:Obez");
		} else {
			System.out.println("40 kg/m^2 üzerinde olanlar:İleri derecede obez(morbid obez) olarak görülür.");
		}
		scan.close();
	}
}
