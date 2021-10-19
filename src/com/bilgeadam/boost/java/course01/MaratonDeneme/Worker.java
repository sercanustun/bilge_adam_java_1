package com.bilgeadam.boost.java.course01.MaratonDeneme;

import java.util.Date;

public class Worker {
	String sicilNo;
	String name;
	String gender;
	boolean isMarried;
	Date birthDate;
	Date startDate;
	Date fnishDate;
	double startingPayment;
	String homeNumber;
	String mobileNumber;
	
	public Worker() {
		
	}
	
	public Worker(String sicilNo, String name, String gender, boolean isMarried, Date birthDate, Date startDate,
			Date fnishDate, double startingPayment, String homeNumber, String mobileNumber) {
		super();
		this.sicilNo = sicilNo;
		this.name = name;
		this.gender = gender;
		this.isMarried = isMarried;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.fnishDate = fnishDate;
		this.startingPayment = startingPayment;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "Worker [sicilNo=" + sicilNo + ", name=" + name + ", gender=" + gender + ", isMarried=" + isMarried
				+ ", birthDate=" + birthDate + ", startDate=" + startDate + ", fnishDate=" + fnishDate
				+ ", startingPayment=" + startingPayment + ", homeNumber=" + homeNumber + ", mobileNumber="
				+ mobileNumber + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public String getSicilNo() {
		return sicilNo;
	}
	
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
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
	
	public boolean isMarried() {
		return isMarried;
	}
	
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getFnishDate() {
		return fnishDate;
	}
	
	public void setFnishDate(Date fnishDate) {
		this.fnishDate = fnishDate;
	}
	
	public double getStartingPayment() {
		return startingPayment;
	}
	
	public void setStartingPayment(double startingPayment) {
		this.startingPayment = startingPayment;
	}
	
	public String getHomeNumber() {
		return homeNumber;
	}
	
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
