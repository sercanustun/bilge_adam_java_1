package com.bilgeadam.boost.java.course01.lesson42;

public class ShapeFactory {
	
	public Shape getShape(String name) {
		if (name.equalsIgnoreCase("daire"))
			return new Circle();
		else if (name.equalsIgnoreCase("kare"))
			return new Square();
		else if (name.equalsIgnoreCase("diktörtgen"))
			return new Rectangle();
		else
			return null;
		
	}
}
