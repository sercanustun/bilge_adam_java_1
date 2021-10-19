package com.bilgeadam.boost.java.course01.MaratonDeneme;

import java.util.Date;

public class Students {
	String registerNumber;
	String name;
	String gender;
	Date studentBirthDate;
	
	Date studentStartgDate;
	Date studentFnishgDate;
	String classNumber;
	String studentMobileNumber;
	String studentHomeNumber;
	String studentVeliNumber;
	
	public Students() {
		
	}
	
	public Students(String registerNumber, String name, String gender, Date studentBirthDate, Date studentStartgDate,
			Date studentFnishgDate, String classNumber, String studentMobileNumber, String studentHomeNumber,
			String studentVeliNumber) {
		super();
		this.registerNumber = registerNumber;
		this.name = name;
		this.gender = gender;
		this.studentBirthDate = studentBirthDate;
		this.studentStartgDate = studentStartgDate;
		this.studentFnishgDate = studentFnishgDate;
		this.classNumber = classNumber;
		this.studentMobileNumber = studentMobileNumber;
		this.studentHomeNumber = studentHomeNumber;
		this.studentVeliNumber = studentVeliNumber;
	}
	
	@Override
	public String toString() {
		return "Students [registerNumber=" + registerNumber + ", name=" + name + ", gender=" + gender
				+ ", studentBirthDate=" + studentBirthDate + ", studentStartgDate=" + studentStartgDate
				+ ", studentFnishgDate=" + studentFnishgDate + ", classNumber=" + classNumber + ", studentMobileNumber="
				+ studentMobileNumber + ", studentHomeNumber=" + studentHomeNumber + ", studentVeliNumber="
				+ studentVeliNumber + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public String getRegisterNumber() {
		return registerNumber;
	}
	
	public String setRegisterNumber() {
		return registerNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getStudentBirthDate() {
		return studentBirthDate;
	}
	
	public void setStudentBirthDate(Date studentBirthDate) {
		this.studentBirthDate = studentBirthDate;
	}
	
	public Date getStudentStartgDate() {
		return studentStartgDate;
	}
	
	public void setStudentStartgDate(Date studentStartgDate) {
		this.studentStartgDate = studentStartgDate;
	}
	
	public Date getStudentFnishgDate() {
		return studentFnishgDate;
	}
	
	public void setStudentFnishgDate(Date studentFnishgDate) {
		this.studentFnishgDate = studentFnishgDate;
	}
	
	public String getClassNumber() {
		return classNumber;
	}
	
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	
	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}
	
	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	
	public String getStudentHomeNumber() {
		return studentHomeNumber;
	}
	
	public void setStudentHomeNumber(String studentHomeNumber) {
		this.studentHomeNumber = studentHomeNumber;
	}
	
	public String getStudentVeliNumber() {
		return studentVeliNumber;
	}
	
	public void setStudentVeliNumber(String studentVeliNumber) {
		this.studentVeliNumber = studentVeliNumber;
	}
	
}
