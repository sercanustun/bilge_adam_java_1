package Maraton1;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class AllMethods {
	
	public static int UserChoice() {
		BAUtils.header("Okul Yönetim Sistemi");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen İşlem Seçiniz \n(1)...Yeni Çalışan" + "\n(2)...Çalışan Listesi"
				+ "\n(3)...Eski Çalışanlar" + "\n(4)...Yeni Sınıf" + "\n(5)...Öğrenci Atama" + "\n(6)...Sınıf Listesi"
				+ "\n(7)...Öğrencilerin Sınıfları" + "\n(8)...Hediye Listesi" + "\n(9)...Maaş Listesi"
				+ "\n(10)...Uygulamadan Çıkış");
		return scanner.nextInt();
		
	}
	
	public static void ExitRequest() {
		System.out.println("Programı Kullandığınız İçin Teşekkür Ederiz...");
		System.exit(0);
	}
	
	public static void buttons() throws IOException {
		
		int choice = UserChoice();
		while (true) {
			switch (choice) {
				
				case 1:
					newWorker();
					break;
				case 2:
					workerList();
					break;
				case 3:
					oldWorker();
					break;
				case 4:
					newClass();
					break;
				case 5:
					newStudent();
					break;
				case 6:
					classList();
					
					break;
				case 7:
					studentClass();
					break;
				case 8:
					giftList();
					break;
				case 9:
					payList();
					break;
				case 10:
					ExitRequest();
					break;
				default:
					System.out.println("Hatalı Giriş Yaptınız...");
					
			}
			
		}
	}
	
	public static void newWorker() {
		System.out.println("Yeni çalışan eklendi");
	}
	
	public static void workerList() {
		
		Employee emp1 = new Employee("W", "1", "Sercan", "ÜSTÜN", "", "Erkek", false, "2020 - 01 - 01", "Devam", 2500,
				"05459558780", "02368549875");
		Employee emp2 = new Employee("T", "1", "Melih", "ÜSTÜN", "", "Erkek", false, "2017 - 01 - 01", "Devam", 2300,
				"05459558780", "02368549875");
		Employee emp3 = new Employee("O", "1", "Metin", "Tekin", "", "Erkek", true, "2015 - 01 - 01", "Devam", 2400,
				"05459558780", "02368549875");
		
		Employee emp5 = new Employee("T", "2", "Feyyaz", "Uçar", "", "Erkek", false, "2013 - 01 - 01", "devam", 2400,
				"05459558780", "02368549875");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(emp5);
		
	}
	
	public static void oldWorker() {
		Employee emp4 = new Employee("W", "2", "Ali", "Gültiken", "", "Erkek", true, "2008 - 01 - 01", "2021-01-01",
				1800, "05459558780", "02368549875");
		System.out.println(emp4);
	}
	
	public static void newClass() {
		Classes c1 = new Classes("Melih Üstün", "Feyyaz Uçar", "Fen Sınıfı", "4. Sınıf", "Ali,Veli,Ayşe", "2",
				"Monday-Tuesday");
		
	}
	
	public static void newStudent() {
		Student s1 = new Student("1", "Ali", "Erkek", "2021-01-09", "Not Yet", "4", "05459875447", "894214554554",
				"545788798", false);
		Student s2 = new Student("1", "Veli", "Erkek", "2021-01-09", "Not Yet", "4", "05459875447", "894214554554",
				"545788798", false);
		Student s3 = new Student("1", "Ayşe", "Kadın", "2021-01-09", "Not Yet", "4", "05459875447", "894214554554",
				"545788798", false);
		
	}
	
	public static void classList(Classes c1) {
		System.out.println(c1);
		
	}
	
	public static void studentClass(Student s1, Student s2, Student s3) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
	public static void giftList() {
		
	}
	
	public static void payList(Employee emp1, Employee emp2, Employee emp3, Employee emp4, Employee emp5) {
		try {
			
			if (emp1.getPosition() == "T") {
				int zam = emp1.getPayment() * 10 / 100;
				
			} else if (emp1.getPosition() == "W") {
				int zam = emp1.getPayment() * 85 / 1000;
			} else if (emp1.getPosition() == "O") {
				int zam = emp1.getPayment() * 9 / 10;
			}
			if (emp2.getPosition() == "T") {
				int zam = emp2.getPayment() * 10 / 100;
				
			} else if (emp2.getPosition() == "W") {
				int zam = emp2.getPayment() * 85 / 1000;
			} else if (emp2.getPosition() == "O") {
				int zam = emp2.getPayment() * 9 / 10;
			}
			if (emp3.getPosition() == "T") {
				int zam = emp3.getPayment() * 10 / 100;
				
			} else if (emp3.getPosition() == "W") {
				int zam = emp3.getPayment() * 85 / 1000;
			} else if (emp3.getPosition() == "O") {
				int zam = emp3.getPayment() * 9 / 10;
			}
			if (emp4.getPosition() == "T") {
				int zam = emp4.getPayment() * 10 / 100;
				
			} else if (emp4.getPosition() == "W") {
				int zam = emp4.getPayment() * 85 / 1000;
			} else if (emp4.getPosition() == "O") {
				int zam = emp4.getPayment() * 9 / 10;
			}
			if (emp5.getPosition() == "T") {
				int zam = emp5.getPayment() * 10 / 100;
				
			} else if (emp5.getPosition() == "W") {
				int zam = emp5.getPayment() * 85 / 1000;
			} else if (emp5.getPosition() == "O") {
				int zam = emp5.getPayment() * 9 / 10;
			}
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(emp1.getStartingDate());
			System.out.println(formatter);
		} catch (Exception e) {
			
		}
	}
	
}
