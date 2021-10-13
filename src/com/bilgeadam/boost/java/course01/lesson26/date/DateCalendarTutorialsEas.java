package com.bilgeadam.boost.java.course01.lesson26.date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

// metot yapacağız
// try catch kullanacagız
// şimdiki zamanın ay'ını alsın
// switch case ile kontrol edelim
// 1 = ocak 2 = şubat 3 = mart .... 12 = hazirandır.

public class DateCalendarTutorialsEas {
	
	public static void tarih() {
		
		LocalDate today = LocalDate.now();
		
		try {
			
			switch (today.getMonthValue()) {
				case 1:
					System.out.println("Ocak");
					break;
				case 2:
					System.out.println("Şubat");
					break;
				case 3:
					System.out.println("Mart");
					break;
				
				case 4:
					System.out.println("Nisan");
					break;
				case 5:
					System.out.println("Mayıs");
					break;
				case 6:
					System.out.println("haziran");
					break;
				case 7:
					System.out.println("Temmuz");
					break;
				case 8:
					System.out.println("Ağustos");
					break;
				case 9:
					System.out.println("Eylül");
					break;
				case 10:
					System.out.println("Ekim");
					break;
				case 11:
					System.out.println("Kasım");
					break;
				case 12:
					System.out.println("aralık");
					break;
			}
		} finally {
		}
	}
	
	// SimpleDateFormat kullanarak 2021/11/11 OLARAK KULLANMA
	
	public static void simple() {
		LocalDate today = LocalDate.now();
		int yil = today.getYear();
		Month ay = today.getMonth();
		int gun = today.getDayOfMonth();
		System.out.println(yil + "/" + ay + "/" + gun);
		
	}
	
	// Saati Bilmiyoruz 15 hakkımız var saat kaç
	// eğer yüksek söylersek sayınızı küçültün
	// eğer az söylersek sayınızı yükseltin
	// validation : hata kontrollerinin öncedentahmin etmek ve ona göre önlem almak.
	// 1-23
	// pozitif
	// karakter girmemesi gerekiyor
	public static void getClockGame() {
		
		try {
			Date date = new Date();
			int hours = date.getHours();
			System.out.println(hours);
			Scanner klavye = new Scanner(System.in);
			int count = 10, prediction = 0;
			while (count > 0) {
				System.out.println("Hakkınız " + count);
				System.out.println("Tahmin sayınız : " + prediction);
				System.out.println("Lütfen sayı giriniz\n");
				
				int hoursScanner = Math.abs(klavye.nextInt());
				int diff = hours - hoursScanner;
				if (diff == 0) {
					System.out.println("Tebrikler Sayıyı Bildiniz. " + prediction + ".Tahminde Buldunuz.");
					// tekrar oynamak istermisiniz ? (Evet / Hayır )
					break;
				} else if (diff == -2) {
					System.out.println("Büyük sayı girniz aradaki fark çok az");
					count--;
					prediction++;
				} else if (diff == 2) {
					System.out.println("Küçük sayı girniz aradaki fark çok az");
					count--;
					prediction++;
				} else if (diff > 2) {
					System.out.println("küçük sayı girniz aradaki fark çok fazla");
					count--;
					prediction++;
				} else if (diff > -2) {
					System.out.println("Büyük sayı girniz aradaki fark çok fazla");
					count--;
					prediction++;
				} else {
					System.out.println("Yanlış Girildi.");
					count--;
					prediction++;
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// tarih();
		
		// simple();
		
		getClockGame();
		
	}
	
}
