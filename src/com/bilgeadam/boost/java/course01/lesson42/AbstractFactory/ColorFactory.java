package com.bilgeadam.boost.java.course01.lesson42.AbstractFactory;

import com.bilgeadam.boost.java.course01.lesson21.Color;

public class ColorFactory implements AbstractFactory<Color> {
	
	@Override
	public Color create(String type) {
		if (type.equalsIgnoreCase("beyaz"))
			return new White();
		else if (type.equalsIgnoreCase("siyah"))
			return new Black();
		else if (type.equalsIgnoreCase("mavi"))
			return new Blue();
		else
			return null;
	}
	
}
