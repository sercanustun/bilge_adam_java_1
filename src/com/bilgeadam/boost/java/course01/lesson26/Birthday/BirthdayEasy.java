package com.bilgeadam.boost.java.course01.lesson26.Birthday;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayEasy {
	
	public static void main(String[] args) {
		int day;
		int month;
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Gününüzü Giriniz (GÜN)");
		day = sc.nextInt();
		System.out.println("Lütfen Gününüzü Giriniz (AY)");
		month = sc.nextInt();
		System.out.println("Lütfen Gününüzü Giriniz (YIL)");
		year = sc.nextInt();
		
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(year, month, day);
		
		long daysFromBirth = bday.until(today, ChronoUnit.DAYS);
		LocalDate yilbasi = LocalDate.of((year + 1), 1, 1);
		System.out.println("Doğumunuzdan itibaren " + daysFromBirth + " gün geçti .");
		System.out.println(bday.getDayOfWeek() + " Günü Doğdunuz.");
		System.out.println("Doğduğunuzda yıl başına " + bday.until(yilbasi, ChronoUnit.DAYS) + " gün vardı.");
		
		if (bday.getMonthValue() > today.getMonthValue()) {
			
			System.out.println("DoğuM Gününe Kalan Süre" + (bday.getMonthValue() - today.getMonthValue()) + "Ay"
					+ (bday.getDayOfMonth() - today.getDayOfMonth()) + "gün vardır");
			
		} else {
			System.out.println("Doğum gününü Düşünmek için çok erken");
			
		}
		sc.close();
	}
	
}
