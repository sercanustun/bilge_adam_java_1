package com.bilgeadam.boost.java.course01.lesson42;

public class FactoryTest {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		factory.getShape("kare").draw();
		factory.getShape("diktörtgen").draw();
		factory.getShape("daire").draw();
		
	}
}
