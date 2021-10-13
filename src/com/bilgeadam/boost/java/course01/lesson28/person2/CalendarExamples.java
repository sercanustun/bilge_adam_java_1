package com.bilgeadam.boost.java.course01.lesson28.person2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExamples {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		// date'i çevirecek getTime()
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTime().getTime());
		
		// calendar.set(Calendar.YEAR, 2010);
		// System.out.println(calendar.getTime());
		// calendar.set(Calendar.MONTH, 1);
		System.out.println(calendar.getTime());
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", locale);
		String str = simpleDateFormat.format(calendar.getTime());
		System.out.println(str);
	}
}
