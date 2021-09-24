package com.bilgeadam.boost.java.course01.lesson15;

import java.util.Arrays;

import com.bilgeadam.boost.java.course01.util.BAUtills;

public class ZigZag {
	
	public static void main(String[] args) {
		String str = "BAboost.java";
		int rowNumber = 5;
		ZigZag zag = new ZigZag();
		BAUtills.header("ZIGZAG Example");
		String result = zag.convert(str, rowNumber);
		System.out.println(result);
		BAUtills.footer();
		
	}
	
	private String convert(String str, int rowNumber) {
		String retVal = "";
		String[] rows = new String[rowNumber];
		Arrays.fill(rows, "");
		char[] chars = str.toCharArray();
		int row = 0;
		boolean goingDown = true;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			rows[row] += chars[i];
		}
		return retVal;
	}
}
