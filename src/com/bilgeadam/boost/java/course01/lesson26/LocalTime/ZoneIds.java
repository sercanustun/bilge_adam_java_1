package com.bilgeadam.boost.java.course01.lesson26.LocalTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIds {
	
	public static void main(String[] args) {
		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			System.out.println(zoneId);
		}
		
		ZoneId zoneId = ZoneId.of("Turkey");
		ZonedDateTime dT = ZonedDateTime.of(LocalDateTime.of(2021, 10, 11, 9, 43), zone);
		
	}
	
}
