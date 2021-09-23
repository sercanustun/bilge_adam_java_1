package com.bilgeadam.boost.java.course01.util;

public class BilgeAdamUtilitiesTest {
	public static void main(String[] args)
	
	{
		BAUtills.header("Oldu Mu?");
		String str = BAUtills.readString("Lütfen Bir Deðer Giriniz");
		
		System.out.println("Okunan Deðer" + str);
		int j = BAUtills.readInt("Lütfen Bir Tamsayý Giriniz");
		System.out.println("Okunan Deðer" + j);
		double d = BAUtills.readDouble("Lütfen Bir Virgüllü Giriniz");
		System.out.println("Okunan Deðer" + d);
		int[] ints = BAUtills.readInt("Lütfen", " bir tam sayý giriniz", 10);
		
		BAUtills.footen();
		
	}
}