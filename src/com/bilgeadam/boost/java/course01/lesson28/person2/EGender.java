package com.bilgeadam.boost.java.course01.lesson28.person2;

public enum EGender {
	
	Bayan(1, "bayan"), Erkek(2, "erkek");
	
	// final: setter gelmesin diye
	private final int id;
	private final String gender;
	
	// parametreli constructor
	// access modifier: private amaç instance oluşturulması izin vermemek
	private EGender(int id, String gender) {
		this.id = id;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public String getGender() {
		return gender;
	}
	
}
