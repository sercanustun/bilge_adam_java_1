package com.bilgeadam.boost.java.course01.lesson27.EmeklilikVakti;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// enum EGender2 {
// Erkek, Bayan;
// }

// bean class
// serileştirme:veri kaybını olmasını istemiyorsak
// ram belleğin boyutu bitti , Harddisk kullanıyor
public class Person implements Serializable {
	
	// Bu classa özgü unique(eşsiz benzersiz bir ID)
	private static final long serialVersionUID = 74825710741368843L;
	
	// özellikler
	private long personId;
	private String personname;
	private String personsurName;
	private String personGender;
	private Date dateOfBirth;
	private Date logsDate;
	
	// parametresiz constructor
	public Person() {
		this.personId = 0;
		this.personname = "ad girilmedi";
		this.personsurName = "ad girilmedi";
	}
	
	// parametreli constructor
	public Person(long personId, String personname, String personsurName, String personGender, Date dateOfBirth) {
		this.personId = personId;
		this.personname = personname;
		this.personsurName = personsurName;
		this.personGender = personGender;
		this.dateOfBirth = dateOfBirth;
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personname=" + personname + ", personsurName=" + personsurName
				+ ", personGender=" + personGender + ", dateOfBirth=" + dateOfBirth + ", logsDate=" + logsDate + "]";
	}
	
	// method
	public static List<Person> personInformation() {
		Scanner klavye = new Scanner(System.in);
		String name, surname, gender, stringToDate;
		Date dateOfBirth;
		
		// eğer global yapıyı localde göstereceksekm bana ilk başlangıç değerini ister
		List<Person> list = null;
		
		try {
			System.out.println("Lütfen adınızı giriniz.");
			name = klavye.nextLine();
			System.out.println("Lütfen soyadınızı giriniz.");
			surname = klavye.nextLine();
			System.out.println("Lütfen cinsiyetinizi giriniz.");
			gender = klavye.nextLine();
			System.out.println("Lütfen doğum yılını giriniz.");
			stringToDate = klavye.nextLine();
			
			// String olan bir yapıyı Date cast ettim
			dateOfBirth = new SimpleDateFormat("yyyy").parse(stringToDate);
			
			Person person = new Person(1, name, surname, gender, dateOfBirth);
			list = new ArrayList<Person>();
			list.add(person);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// calculate
	public static void personRetirementAgeCalculate(List<Person> list) {
		List<Person> newList = list;
		
		System.out.println(newList.get(0).getDateOfBirth());
		dateOfBirth = newList.get(0).getDateOfBirth();
		// Strem().forEach();
		// list.stream().forEach(System.out::println);
		
		// listeden Person nesnesinin özelliklerine erişeceğim.
		
	}
	
	public static void main(String[] args) {
		personRetirementAgeCalculate(personInformation());
	}
	
	// getter and setter
	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public String getPersonname() {
		return personname;
	}
	
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	
	public String getPersonsurName() {
		return personsurName;
	}
	
	public void setPersonsurName(String personsurName) {
		this.personsurName = personsurName;
	}
	
	public String getPersonGender() {
		return personGender;
	}
	
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	// Tarih gelmiyor
	public Date getLogsDate() {
		this.logsDate = new Date(System.currentTimeMillis());
		return this.logsDate;
	}
	
}