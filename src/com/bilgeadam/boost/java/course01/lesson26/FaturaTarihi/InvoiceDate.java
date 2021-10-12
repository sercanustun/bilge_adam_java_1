package com.bilgeadam.boost.java.course01.lesson26.FaturaTarihi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InvoiceDate {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		// LocalDate today = LocalDate.of(2021, 10, 17);
		LocalDate invDate = LocalDate.of(today.getYear(), today.getMonth(), 15);
		if (today.getDayOfMonth() > 15) {
			invDate = invDate.plusMonths(1);
			
		}
		System.out.println("Fatura tarihi " + invDate);
		long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
		System.out.println("Faturalamaya " + daysToInvoice + " gün kaldı.");
	}
	
}
