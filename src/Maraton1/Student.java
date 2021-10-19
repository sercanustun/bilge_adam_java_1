package Maraton1;

public class Student {
	String registerNum;
	String studentName;
	String studentGender;
	String studenStartingDate;
	String studentFnishingDate;
	String className;
	String studentMpno;
	String studentVpno;
	String studentHpno;
	boolean isMaried;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String registerNum, String studentName, String studentGender, String studenStartingDate,
			String studentFnishingDate, String className, String studentMpno, String studentVpno, String studentHpno,
			boolean isMaried) {
		super();
		this.registerNum = registerNum;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studenStartingDate = studenStartingDate;
		this.studentFnishingDate = studentFnishingDate;
		this.className = className;
		this.studentMpno = studentMpno;
		this.studentVpno = studentVpno;
		this.studentHpno = studentHpno;
		this.isMaried = isMaried;
	}
	
	@Override
	public String toString() {
		return "Student [registerNum=" + registerNum + ", studentName=" + studentName + ", studentGender="
				+ studentGender + ", studenStartingDate=" + studenStartingDate + ", studentFnishingDate="
				+ studentFnishingDate + ", className=" + className + ", studentMpno=" + studentMpno + ", studentVpno="
				+ studentVpno + ", studentHpno=" + studentHpno + ", isMaried=" + isMaried + "]";
	}
	
	public String getRegisterNum() {
		return registerNum;
	}
	
	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentGender() {
		return studentGender;
	}
	
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	
	public String getStudenStartingDate() {
		return studenStartingDate;
	}
	
	public void setStudenStartingDate(String studenStartingDate) {
		this.studenStartingDate = studenStartingDate;
	}
	
	public String getStudentFnishingDate() {
		return studentFnishingDate;
	}
	
	public void setStudentFnishingDate(String studentFnishingDate) {
		this.studentFnishingDate = studentFnishingDate;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getStudentMpno() {
		return studentMpno;
	}
	
	public void setStudentMpno(String studentMpno) {
		this.studentMpno = studentMpno;
	}
	
	public String getStudentVpno() {
		return studentVpno;
	}
	
	public void setStudentVpno(String studentVpno) {
		this.studentVpno = studentVpno;
	}
	
	public String getStudentHpno() {
		return studentHpno;
	}
	
	public void setStudentHpno(String studentHpno) {
		this.studentHpno = studentHpno;
	}
	
	public boolean isMaried() {
		return isMaried;
	}
	
	public void setMaried(boolean isMaried) {
		this.isMaried = isMaried;
	}
	
}
