package com.bilgeadam.boost.java.course01.lesson42.AbstractFactory;

/* generic interface */

public interface AbstractFactory<T> {
	T create(String type);
}
