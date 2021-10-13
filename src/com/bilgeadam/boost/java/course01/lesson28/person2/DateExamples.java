package com.bilgeadam.boost.java.course01.lesson28.person2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExamples {
	public static void main(String[] args) {
		// epoch time çağ zamanı :1970 1 ocak
		// long epochTime = System.currentTimeMillis();
		// System.out.println(epochTime);
		
		// System.out.println();
		// date aylarda sıfırda başlar ,
		// Date date = new Date(epochTime);
		// System.out.println(date);
		
		// 1900 tabanlıdır. +1900 -1900
		// Depraceted ( Amerikalılar kullanır . )
		// Java geriye uyumlulukta bir sıkıntı yoktur . backwards .compability.
		
		// 1900 ekleyeceğiz yada çıkaracağız.
		// Date date2 = new Date(2021 - 1900, 9, 13);
		// System.out.println(date2);
		
		// gregorian calender (miladi takvim)
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", locale);
		Date date = new Date();
		String str = simpleDateFormat.format(date);
		System.out.println(str);
	}
}
