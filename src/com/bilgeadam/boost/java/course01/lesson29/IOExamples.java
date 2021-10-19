package com.bilgeadam.boost.java.course01.lesson29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// 1.SORU
// public static final String PATH="";
// 1.adım static bir path yapalım değeri C:\\bilgeadam\\dosya.txt
// 2.adım Kullanıcı tarafından Birşeyler yazıp oluşturduğumuz dosya içisine
// yazalım
// 3.adım dosya içerisindeki yazıları okuyalım.
// 4.adım dosya içerisindeki bütün a harflerini e yapalım

// 2.SORU
// 2.adım c:sürücüsünü altında kullanıcı tarafından "dizin" adından File ile
// java tarafından dizin oluşturalım

// 3.adım c:\\dizin altına kullanıcı tarafından "bilgeadam.txt" dosya
// oluşturalım bilgeadam.txt dosyası oluşturalım

// Seçenekli bir şekilde
// 0-Çıkış
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya özellikleri
// 6.1 Dosya mı

//// Seçenekli bir şekilde
// 0-Çıkış
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya özellikleri
// 6.1 Dosya mı
// bu dizin mi ? dosya mı?
// yazılabilrinir mi ? okunabilinir mi çalışabilinir mi?

// URL URI araştırmak ödevi

public class IOExamples {
	// Dosyaya birşeyler yazmak
	public static void fileWriterTryWithResources() {
		String adi = FilePath.FILE_PATH;
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath.FILE_PATH, true))) {
			String value = "";
			Scanner klavye = new Scanner(System.in);
			System.out.println("Lütfen birşeyler yazınız");
			bufferedWriter.write(klavye.nextLine());
			bufferedWriter.flush();
			System.out.println("Yazıldı");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String fileReaderTryWithResources() {
		String satir = "", toplamOkunanSatir = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.FILE_PATH))) {
			while ((satir = bufferedReader.readLine()) != null) {
				toplamOkunanSatir += satir + " \n";
			}
			System.out.println(toplamOkunanSatir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toplamOkunanSatir;
	}
	
	public static void changeLetter(String value) {
		
	}
	
	public static void main(String[] args) {
		// fileWriterTryWithResources();
		// fileReaderTryWithResources();
		String str = fileReaderTryWithResources();
		// a e
		changeLetter(str);
	}
}