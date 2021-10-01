package Odev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class WeatherReportOdev {
	// il ilçe ulke kodunu alsın
	public static Map<String, Object> getCountyReading() {
		Scanner klavye = new Scanner(System.in);
		String ilce, il, ulke;
		Map<String, Object> mapList = new HashMap<String, Object>();
		
		System.out.println("Lütfen ilceyi giriniz ");
		ilce = klavye.nextLine().toLowerCase();
		
		System.out.println("Lütfen ili giriniz ");
		il = klavye.nextLine().toLowerCase();
		
		System.out.println("Lütfen ülke kodunu giriniz ");
		ulke = klavye.nextLine().toLowerCase();
		
		mapList.put("ilce", ilce);
		mapList.put("il", il);
		mapList.put("ulke", ulke);
		
		// return (Map<String, Object>) mapList;
		return mapList;
	}
	
	//
	public static void getLatitudeLongitude(Map<String, Object> list) {
		// enlem,boylam
		String latit, longi;
		
		// for (String temp : list.keySet()) {
		// System.out.print(temp + " ");
	}
	
	// System.out.println(
	// BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"),
	// (String) list.get("ulke")));
	
	String value = BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"), (String) list.get("ulke"));
	
	System.out.println(value);
	String enlem = value.substring(24, 31);
	}
	
	// BAUtils.getDirectData("Merkez", "Balikesir", "TR")
	
	public static void main(String[] args) {
		getLatitudeLongitude(getCountyReading());
	}
	
}