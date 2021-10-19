package Maraton1;

public class Employee extends AllMethods {
	String position;
	String sicilNum;
	String name;
	String surname;
	String midName;
	String Gender;
	boolean isMaried;
	String startingDate;
	String fnishingDate;
	int payment;
	String mpno;
	String hpno;
	
	public Employee() {
		
	}
	
	public Employee(String position, String sicilNum, String name, String surname, String midName, String gender,
			boolean isMaried, String startingDate, String fnishingDate, int payment, String mpno, String hpno) {
		super();
		this.position = position;
		this.sicilNum = sicilNum;
		this.name = name;
		this.surname = surname;
		this.midName = midName;
		this.Gender = gender;
		this.isMaried = isMaried;
		this.startingDate = startingDate;
		this.fnishingDate = fnishingDate;
		this.payment = payment;
		this.mpno = mpno;
		this.hpno = hpno;
		
	}
	
	@Override
	public String toString() {
		return "Employee [position=" + position + ", sicilNum=" + sicilNum + ", name=" + name + ", surname=" + surname
				+ ", midName=" + midName + ", Gender=" + Gender + ", isMaried=" + isMaried + ", startingDate="
				+ startingDate + ", fnishingDate=" + fnishingDate + ", payment=" + payment + ", mpno=" + mpno
				+ ", hpno=" + hpno + "]";
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getSicilNum() {
		return sicilNum;
	}
	
	public void setSicilNum(String sicilNum) {
		this.sicilNum = sicilNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getMidName() {
		return midName;
	}
	
	public void setMidName(String midName) {
		this.midName = midName;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public boolean isMaried() {
		return isMaried;
	}
	
	public void setMaried(boolean isMaried) {
		this.isMaried = isMaried;
	}
	
	public String getStartingDate() {
		return startingDate;
	}
	
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	
	public String getFnishingDate() {
		return fnishingDate;
	}
	
	public void setFnishingDate(String fnishingDate) {
		this.fnishingDate = fnishingDate;
	}
	
	public int getPayment() {
		return payment;
	}
	
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	public String getMpno() {
		return mpno;
	}
	
	public void setMpno(String mpno) {
		this.mpno = mpno;
	}
	
	public String getHpno() {
		return hpno;
	}
	
	public void setHpno(String hpno) {
		this.hpno = hpno;
	}
	
}
