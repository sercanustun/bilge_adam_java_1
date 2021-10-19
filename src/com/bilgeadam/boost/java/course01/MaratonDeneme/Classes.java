package com.bilgeadam.boost.java.course01.MaratonDeneme;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	String teacher;
	String coTeacher;
	String className;
	String classYear;
	List<String> list = new ArrayList<String>();
	
	public Classes() {
		
	}
	
	public Classes(String teacher, String coTeacher, String className, String classYear, List<String> list) {
		super();
		this.teacher = teacher;
		this.coTeacher = coTeacher;
		this.className = className;
		this.classYear = classYear;
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "Classes [teacher=" + teacher + ", coTeacher=" + coTeacher + ", className=" + className + ", classYear="
				+ classYear + ", list=" + list + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String getCoTeacher() {
		return coTeacher;
	}
	
	public void setCoTeacher(String coTeacher) {
		this.coTeacher = coTeacher;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getClassYear() {
		return classYear;
	}
	
	public void setClassYear(String classYear) {
		this.classYear = classYear;
	}
	
	public List<String> getList() {
		return list;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
}
