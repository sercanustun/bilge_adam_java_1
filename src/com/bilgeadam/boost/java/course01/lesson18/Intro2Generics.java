package com.bilgeadam.boost.java.course01.lesson18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Intro2Generics {
	
	public static void main(String[] args) {
		LinkedList<String> strArray = new LinkedList<String>();
		strArray.add("1");
		strArray.add("" + 1);
		for (String string : strArray) {
			System.out.println(string);
		}
		ArrayList<MyObject> arrayList = new ArrayList<MyObject>();
		MyObject obj1 = new MyObject();
		obj1.name = "Fiat";
		obj1.type = "Araba";
		obj1.power = 143;
		arrayList.add(obj1);
		
		arrayList.add(1, obj1);
		
		System.out.println(arrayList.get(0));
	}
	
}
