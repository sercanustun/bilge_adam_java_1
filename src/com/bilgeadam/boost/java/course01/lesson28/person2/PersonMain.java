package com.bilgeadam.boost.java.course01.lesson28.person2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class PersonMain {
	// global özellikler
	private static int count = 0;
	private static Scanner klavye = new Scanner(System.in);
	
	// Method
	public static void personGeneral() {
		Person person = new Person();
		int birthYear = 0, birthMonth = 0, birthDay = 0;
		try {
			System.out.println("Lütfen adınızı giriniz.");
			person.setPersonName(klavye.next());
			System.out.println("Lütfen soyadınızı giriniz");
			person.setPersonSurname(klavye.next());
			System.out.println("Lütfen doğum yılınızı giriniz");
			birthYear = klavye.nextInt();
			System.out.println("Lütfen doğum ayınızı giriniz");
			birthMonth = klavye.nextInt();
			System.out.println("Lütfen doğum gününüzü giriniz");
			birthDay = klavye.nextInt();
			// klavye okumasını doğru yapsın diye.
			klavye.nextLine();
			System.out.println("Lütfen cinsiyetinizi giriniz.");
			person.setPersonGender(klavye.nextLine());
			
			if (person.getPersonGender().equals(EGender.Erkek.toString())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(birthYear + 65, birthMonth, birthDay));
				person.setNowDate(
						
						LocalDate.of(
								
								calendar.get(Calendar.YEAR), (Calendar.MONTH), (Calendar.DAY_OF_MONTH)));
				Male male = new Male(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "çok çalışma", "güç");
				
				differenceBetweenDates(male);
				
			} else if (person.getPersonGender().equals(EGender.Bayan.toString())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(birthYear + 60, birthMonth, birthDay));
				person.setNowDate(
						
						LocalDate.of(
								
								calendar.get(Calendar.YEAR), (Calendar.MONTH), (Calendar.DAY_OF_MONTH)));
				Lady lady = new Lady(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "Çok ikna edici", "Çok güzeldir");
				differenceBetweenDates(lady);
			}
			
		} catch (Exception e) {
			
		}
	}
	
	// diğer metot bu metotta göndereceğim aprametre lady ise ladye göre male ise
	// maleye göre işlem yapmamız lazım.
	
	private static void differenceBetweenDates(Object object) {
		if (object instanceof Male) {
			Male male = (Male) object;
			Period different = Period.between(male.getNowDate(), male.getRetiredDate());
			System.out.println("Emekliliğinize kalan süre " + different.getYears() + " yıl" + different.getMonths()
					+ " ay " + different.getDays() + " gün vardır.");
		} else if (object instanceof Lady) {
			
		}
		
	}
	
}
