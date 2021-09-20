package com.bilgeadam.main;

public class Ders_20_09_00 {
	
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point q = p;
		Point r = new Point(10, 10);
		System.out.println("p == q" + (p == q));
		// p ve q ayný nesneye baþvurduðundan true
		System.out.println("p == r" + (p == r));
		// p ve q þans eseri ayný kordinatlara sahip olan iki ayrý nesneye atýfta
		// bulunuyorlar
	}
	
}
