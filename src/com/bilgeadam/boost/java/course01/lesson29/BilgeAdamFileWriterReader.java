package com.bilgeadam.boost.java.course01.lesson29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BilgeAdamFileWriterReader {
	// metot yazdığınız çalışmazsa
	// linux: /
	// windows: \
	public static void fileWriterNotTryWithResources() {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		String path = "C:\\bilgeadam\\HamitMizrak2.txt";
		try {
			// çok önemli bir özelliği sonra göstereceğim.
			// öncekini siliyor ekliyor
			// Önceki kalsın yenileri eklesin
			// defaultta: false biz true yapmalıyız.
			fileWriter = new FileWriter(path, false);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("yeni satir");
			bufferedWriter.flush();
			
			System.out.println("Dosyalar yazıldı");
			// çok önemli compiler ederken bunu zaten göreceğiz.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// try with resources : Close yazmaya çalışıyor
	public static void fileWriterTryWithResources() {
		String path = "C:\\bilgeadam\\HamitMizrak.txt";
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
			bufferedWriter.write("yeni satir");
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//
	public static void fileReaderTryWithResources() {
		String path = "C:\\bilgeadam\\HamitMizrak.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			String toplamSatirlar = "";
			String satir = ""; // satırdaki verileri
			while ((satir = bufferedReader.readLine()) != null) {
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			System.out.println(toplamSatirlar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		fileWriterNotTryWithResources();
		// fileReaderTryWithResources();
	}
	
}
