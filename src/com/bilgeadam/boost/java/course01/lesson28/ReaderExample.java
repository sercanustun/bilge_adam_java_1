package com.bilgeadam.boost.java.course01.lesson28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Sercan\\Desktop\\BilgeAdamEgitim\\DERSICI\\mektup.txt");
		if (file.exists()) {
			System.out.println("Mektup Belgesi Zaten Var");
		} else {
			System.out.println("Mektup Belgesi Henüz Yok");
		}
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bR = new BufferedReader(reader);
			while (true) {
				String line = bR.readLine();
				if (line == null) {
					break;
				}
				System.out.println("--> " + line);
			}
			bR.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
}
