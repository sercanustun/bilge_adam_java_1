package Maraton1;

public class Classes {
	String asilOgretmen;
	String yedekOgretmen;
	String className;
	String classDate;
	String studentsInClass;
	String hours;
	String days;
	
	public Classes() {
		// TODO Auto-generated constructor stub
	}
	
	public Classes(String asilOgretmen, String yedekOgretmen, String className, String classDate,
			String studentsInClass, String hours, String days) {
		super();
		this.asilOgretmen = asilOgretmen;
		this.yedekOgretmen = yedekOgretmen;
		this.className = className;
		this.classDate = classDate;
		this.studentsInClass = studentsInClass;
		this.hours = hours;
		this.days = days;
	}
	
	@Override
	public String toString() {
		return "Classes [asilOgretmen=" + asilOgretmen + ", yedekOgretmen=" + yedekOgretmen + ", className=" + className
				+ ", classDate=" + classDate + ", studentsInClass=" + studentsInClass + ", hours=" + hours + ", days="
				+ days + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public String getAsilOgretmen() {
		return asilOgretmen;
	}
	
	public void setAsilOgretmen(String asilOgretmen) {
		this.asilOgretmen = asilOgretmen;
	}
	
	public String getYedekOgretmen() {
		return yedekOgretmen;
	}
	
	public void setYedekOgretmen(String yedekOgretmen) {
		this.yedekOgretmen = yedekOgretmen;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getClassDate() {
		return classDate;
	}
	
	public void setClassDate(String classDate) {
		this.classDate = classDate;
	}
	
	public String getStudentsInClass() {
		return studentsInClass;
	}
	
	public void setStudentsInClass(String studentsInClass) {
		this.studentsInClass = studentsInClass;
	}
	
	public String getHours() {
		return hours;
	}
	
	public void setHours(String hours) {
		this.hours = hours;
	}
	
	public String getDays() {
		return days;
	}
	
	public void setDays(String days) {
		this.days = days;
	}
	
}
