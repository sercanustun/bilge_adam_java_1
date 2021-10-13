package com.bilgeadam.boost.java.course01.lesson28.person2;

import java.io.Serializable;
import java.time.LocalDate;

public class Lady extends Person implements Serializable, IPersonCommon {
	
	private static final long serialVersionUID = -4125982230588834587L;
	
	// Özellikler
	private String persuade; // ikna kabiliyeti
	private String beauty;
	
	// parametresiz
	public Lady() {
		
	}
	
	// parametreli
	public Lady(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate, String persuade, String beauty) {
		super(personId, personName, personSurname, personGender, retiredDate, nowDate);
		this.persuade = persuade;
		this.beauty = beauty;
		// to string
		
	}
	
	@Override
	public String toString() {
		return "Lady [persuade=" + persuade + ", beauty=" + beauty + ", getPersonId()=" + getPersonId()
				+ ", getPersonName()=" + getPersonName() + ", getPersonSurname()=" + getPersonSurname()
				+ ", getPersonGender()=" + getPersonGender() + ", getRetiredDate()=" + getRetiredDate()
				+ ", getNowDate()=" + getNowDate() + ", getLogsDate()=" + getLogsDate() + "]";
	}
	
	// getter and setter
	public String getPersuade() {
		return persuade;
	}
	
	public void setPersuade(String persuade) {
		this.persuade = persuade;
	}
	
	public String getBeauty() {
		return beauty;
	}
	
	public void setBeauty(String beauty) {
		this.beauty = beauty;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public void personLive() {
		System.out.println("Kadınlar Yaşar " + Lady.class);
	}
	
	@Override
	public void personEat() {
		System.out.println("Kadınlar yer " + Lady.class);
		
	}
	
}
