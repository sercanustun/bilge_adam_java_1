package com.bilgeadam.classexamples;

public class MainTest {
	
	public static void main(String[] args) {
		// ClassExamples class1;
		// class1= new ClassExamples ();
		// class adını bize gösterir
		// System.out.println(class2.getClass());
		// static yapının önemi
		ClassExamples.telephoneTrade = "asd";
		// intance : örnekleme(new)
		ClassExamples class2 = new ClassExamples();
		class2.setTelephonePrice(14000.0);
		System.out.println(class2.telephonePrice());
	}
	
}
