package com.bilgeadam.boost.java.course01.lesson27.EmeklilikVakti;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Çalışma hayatım E Devlet
// Kullanıcıdan ad soyad doğum tariğhi ( gün / ay / yıl )
// Erkeklerde 65 yaş
// Kadınlarda 60 yaş

// Emekliliğe kalan süreniz

// methodları
// Class : ID / KİŞİ ADI SOYADI / doğum tarihi / Cinsiyet
// try catch alınacak
// static
// enum E-K

public class EmeklilikYasi {
	
	private static final ChronoLocalDate DateOfBirth = null;
	
	public List<Person> deneme() {
		String name, surname, gender;
		Date dateOfBirth;
		name = "asd";
		surname = "sd";
		gender = "E";
		dateOfBirth = null;
		Person person = new Person(1, name, surname, dateOfBirth);
		List<Person> listem = new ArrayList<Person>();
		listem.add(new Person(1, name, surname, dateOfBirth));
		return listem;
	}
	
	public static void getBilgi(int id, String name, String surname, String dateOfBirth) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen idnizi Giriniz");
		id = sc.nextInt();
		
		System.out.println("Lütfen İsminizi Giriniz");
		name = sc.next();
		
		System.out.println("Lütfen Soyisminizi Giriniz");
		surname = sc.next();
		
		System.out.println("Lütfen Doğum Tarihinizi Giriniz");
		dateOfBirth = sc.next();
	}
	
	public static void sorgu() {
		LocalDate now = LocalDate.now();
	if(
	}
	
	public static void main(String[] args) {
		getBilgi(0, null, null, null);
	}
}
