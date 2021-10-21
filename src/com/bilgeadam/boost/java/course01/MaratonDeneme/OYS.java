package com.bilgeadam.boost.java.course01.MaratonDeneme;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OYS {
	
	List<String> fen5a = new ArrayList<String>();
	
	Students s1 = new Students("2015-001", "SERCAN ÜSTÜN", "ERKEK", Date.valueOf("1997-1-1"), Date.valueOf("2015-1-1"),
			Date.valueOf("2020-1-1"), "5", "05459558780", "05964548998", "0698745478");
	
	Students s2 = new Students("2016-002", "MELİH ÜSTÜN", "ERKEK", Date.valueOf("1994-1-1"), Date.valueOf("2012-1-1"),
			Date.valueOf("2017-1-1"), "8", "05459558780", "05964548998", "0698745478");
	
	Worker w1 = new Worker("T001", "Ahmet Kaya", "ERKEK", false, Date.valueOf("1960-1-1"), Date.valueOf("2010-1-9"),
			Date.valueOf("2019-9-11"), 2000, "05457879879", "455498579845");
	Worker w3 = new Worker("T002", "Ebru Gündeş", "Kadın", false, Date.valueOf("1978-10-11"),
			Date.valueOf("2010-12-12"), Date.valueOf("2038-9-11"), 2300, "05457879879", "455498579845");
	Worker w4 = new Worker("T001", "Ahmet Kaya", "ERKEK", false, Date.valueOf("1960-1-1"), Date.valueOf("2010-1-9"),
			Date.valueOf("2048-9-11"), 2000, "05457879879", "455498579845");
	
	Worker w2 = new Worker("H001", "Sibel Can", "Kadın", false, Date.valueOf("1970-8-15"), Date.valueOf("2015-7-9"),
			Date.valueOf("2022-9-11"), 2500, "05457879879", "455498579845");
	Classes c1 = new Classes(w2.getName(), w4.getName(), "Fen Sınıfı", "5.sınıf", fen5a);
	
	public String scannerValue() {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen İşlem Seçiniz \n(1)...Yeni Çalışan" + "\n(2)...Çalışan Listesi"
				+ "\n(3)...Eski Çalışanlar" + "\n(4)...Yeni Sınıf" + "\n(5)...Öğrenci Atama" + "\n(6)...Sınıf Listesi"
				+ "\n(7)...Öğrencilerin Sınıfları" + "\n(8)...Hediye Listesi" + "\n(9)...Maaş Listesi"
				+ "\n(10)...Uygulamadan Çıkış");
		// Locale locale = new Locale("en");
		// ResourceBundle languageBundle =
		// ResourceBundle.getBundle("com.bilgeadam.boost.java.course01.MaratonDeneme.text",
		// locale);
		// System.out.println(languageBundle.getString("Please select an Action
		// \n(1)...New Worker" + "\n(2)...Worker List"
		// + "\n(3)...Old Workers" + "\n(4)...New Class" + "\n(5)...Student assignment"
		// + "\n(6)...Class List"
		// + "\n(7)...Students class" + "\n(8) ...Gift List" + "\n(9)...Payment List" +
		// "\n(10)...Exit From App"));
		
		String chooice = klavye.nextLine();
		
		return chooice;
		
	}
	
	public void allMethod() {
		try {
			
			Scanner klavye = new Scanner(System.in);
			
			while (true) {
				String key = scannerValue();
				switch (key) {
					
					case "1":
						newWorker();
						break;
					case "2":
						workerList();
						break;
					case "3":
						oldWorker();
						break;
					case "4":
						newClass();
						break;
					case "5":
						newStudent();
						break;
					case "6":
						classList();
						
						break;
					case "7":
						studentClass();
						break;
					case "8":
						giftList();
						break;
					case "9":
						payList();
						break;
					case "10":
						System.exit(0);
						break;
					default:
						System.out.println("Hatalı Giriş Yaptınız...");
						
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	private void payList() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hangi yıldaki maaşını görmek istiyorsunuz");
		int hangiYilda = sc.nextInt();
		int calisilanYil = hangiYilda - (w1.getStartDate().getYear() + 1900);
		
		if (w1.sicilNo.startsWith("T")) {
			double zam = (w1.startingPayment) * 10 / 100;
			
		} else if (w1.sicilNo.startsWith("H")) {
			double zam = (w1.startingPayment) * 85 / 1000;
		} else {
			double zam = (w1.startingPayment) * 9 / 100;
			
			int zamRate = (int) (zam * calisilanYil * 2);
			int guncelMaas = (int) ((w1.startingPayment) + zam);
			System.out.println(guncelMaas);
			
		}
		if (w2.sicilNo.startsWith("T")) {
			double zam = (w2.startingPayment) * 10 / 100;
			
		} else if (w2.sicilNo.startsWith("H")) {
			double zam = (w2.startingPayment) * 85 / 1000;
		} else {
			double zam = (w2.startingPayment) * 9 / 100;
			
			int zamRate = (int) (zam * calisilanYil * 2);
			int guncelMaas = (int) ((w2.startingPayment) + zam);
			System.out.println(guncelMaas);
			
		}
		if (w3.sicilNo.startsWith("T")) {
			double zam = (w3.startingPayment) * 10 / 100;
			
		} else if (w3.sicilNo.startsWith("H")) {
			double zam = (w3.startingPayment) * 85 / 1000;
		} else {
			double zam = (w3.startingPayment) * 9 / 100;
			
			int zamRate = (int) (zam * calisilanYil * 2);
			int guncelMaas = (int) ((w3.startingPayment) + zam);
			System.out.println(guncelMaas);
			
		}
		if (w4.sicilNo.startsWith("T")) {
			double zam = (w4.startingPayment) * 10 / 100;
			
		} else if (w4.sicilNo.startsWith("H")) {
			double zam = (w4.startingPayment) * 85 / 1000;
		} else {
			double zam = (w4.startingPayment) * 9 / 100;
			
			int zamRate = (int) (zam * calisilanYil * 2);
			int guncelMaas = (int) ((w4.startingPayment) + zam);
			System.out.println(guncelMaas);
			
		}
		
	}
	
	private void giftList() {
		System.out.println(s1.getName() + "kişisine" + s1.getStudentBirthDate().getDay() + " "
				+ s1.getStudentBirthDate().getMonth() + "Tarihinde Çikolata Yollanacak ");
		System.out.println(s2.getName() + "kişisine" + s2.getStudentBirthDate().getDay() + " "
				+ s2.getStudentBirthDate().getMonth() + "Tarihinde Çikolata Yollanacak ");
		
		System.out.println(w1.getName() + "Kişisine" + w1.getBirthDate().getDay() + " " + w1.getBirthDate().getMonth()
				+ " Tarihinde Çiçek Yollanacak");
		System.out.println(w2.getName() + "Kişisine" + w2.getBirthDate().getDay() + " " + w2.getBirthDate().getMonth()
				+ " Tarihinde Çiçek Yollanacak");
		System.out.println(w3.getName() + "Kişisine" + w3.getBirthDate().getDay() + " " + w3.getBirthDate().getMonth()
				+ " Tarihinde Çiçek Yollanacak");
		System.out.println(w4.getName() + "Kişisine" + w4.getBirthDate().getDay() + " " + w4.getBirthDate().getMonth()
				+ " Tarihinde Çiçek Yollanacak");
		
	}
	
	private void studentClass() {
		System.out.println("Öğrenci Adı : " + s1.getName() + "  " + "Sınıfı = " + s1.getClassNumber());
		System.out.println("Öğrenci Adı : " + s2.getName() + "  " + "Sınıfı = " + s2.getClassNumber());
	}
	
	private void classList() {
		System.out.println(c1);
		
	}
	
	private void newStudent() {
		System.out.println("Öğrenci Girişi Yapıldı");
	}
	
	private void newClass() {
		
		System.out.println("Yeni Sınıf Oluşturuldu");
		
	}
	
	private void oldWorker() {
		System.out.println(w1);
		
	}
	
	private void workerList() {
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		
	}
	
	private void newWorker() {
		System.out.println("Yeni Çalışan Eklendi");
		
	}
}
