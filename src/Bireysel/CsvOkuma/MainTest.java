package Bireysel.CsvOkuma;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Sercan\\Desktop\\BilgeAdamEgitim\\CSV\\books.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] values = line.split(",");
				System.out.println(values[0]);
			}
			
		} catch (Exception e) {
			
		}
		
	}
}
