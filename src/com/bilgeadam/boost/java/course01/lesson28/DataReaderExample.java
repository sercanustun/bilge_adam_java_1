package com.bilgeadam.boost.java.course01.lesson28;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReaderExample {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Sercan\\Desktop\\BilgeAdamEgitim\\DERSICI\\values.ddd");
		try {
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			while (true) {
				System.out.println("--> " + dis.readDouble());
				System.out.println("--> " + dis.readInt());
				
				// dis.close();
			}
			
		} catch (IOException ex) {
			
		}
		
	}
}
