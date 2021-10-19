package com.bilgeadam.boost.java.course01.lesson30;

import java.io.File;
import java.util.HashMap;

public class ReturnValueTest {
	
	public static void main(String[] args) {
		HashMap<String, Object> xxx = createFile();
		String str = (String) xxx.get("1");
		File file = (File) xxx.get("2");
	}
	
	static HashMap<String, Object> createFile() {
		File f = new File("C:\\bilgeadam\\deneme123.txt");
		HashMap<String, Object> retVal = new HashMap<>();
		retVal.put("1", "asdsad");
		retVal.put("2", f);
		return retVal;
		
	}
}
