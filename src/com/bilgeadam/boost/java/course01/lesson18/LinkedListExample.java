package com.bilgeadam.boost.java.course01.lesson18;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		MyObject myObject = new MyObject();
		myObject.name = "Babür";
		myObject.types = "İnsan";
		myObject.power = 12;
		arrayList.add(myObject);
		
		MyObject myObject2 = Myobject();
		myObject2.name = "Sarman";
		myObject2.types = "Kedi";
		myObject2.power = 32;
		arrayList.add(myObject2);
		for (Iterator<E> iterator = arrayList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object.toString());
			MyObject obj = (MyObject) object;
			System.out.println(obj.name);
			
		}
	}
	
}
