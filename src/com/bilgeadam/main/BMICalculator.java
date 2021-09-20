package com.bilgeadam.main;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		System.out.println("\t\t=============================");
		System.out.println("\t\tWelcome to the BMI Calculator");
		System.out.println("\t\t=============================");
		double weight, height;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\tL�tfen boyunuzu metre cinsinden giriniz.");
		height = scan.nextDouble();
		
		System.out.println("\t\tL�tfen kilonuzu kilogram cinsinden giriniz.");
		weight = scan.nextDouble();
		System.out.println();
		double bmi = weight / (height * height);
		// kare al�rken Math.poowe(height, 2) kullanabiliriz
		System.out.printf("==>Hesaplanan v�cut k�tle endeksiniz %.2f ' dir.", bmi);
		if (bmi < 18.5) {
			System.out.println("18.5 kg/m^2'nin alt�nda olanlar:Zay�f.");
		} else if (bmi >= 18.5 && bmi < 24.9)
		
		{
			System.out.println("18.5-24.9 kg/m^2 aras�nda olanlar:Normal Kilolu.");
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("25-25.9 kg/m^2 aras�nda olanlar:Fzla Kilolu.");
		} else if (bmi >= 30 && bmi < 39.9) {
			
			System.out.println("30-39.9 kg/m^2 aras�nda olanlar:Obez");
		} else {
			System.out.println("40 kg/m^2 �zerinde olanlar:�leri derecede obez(morbid obez) olarak g�r�l�r.");
		}
		scan.close();
	}
}
