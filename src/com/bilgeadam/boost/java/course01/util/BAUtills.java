package com.bilgeadam.boost.java.course01.util;

import java.util.Scanner;

public class BAUtills {
	private static Scanner scan = new Scanner(System.in);
	
	public static void footen() {
		System.out.println("\tProgramý Kullan dýðýnýz Ýçin Teþekkürler");
		System.out.println("\t\tTekrar Görüþmek Üzere");
		
	}
	
	public static void header(String tittle) {
		// ============
		// ** HEADER **
		// ============
		int len = tittle.length();
		StringBuilder row = new StringBuilder("");
		
		for (int i = 0; i < (len + 6); i++) {
			row.append("=");
			
		}
		System.out.println("\n\n\t\t" + row.toString());
		System.err.println("\t\t**  " + tittle.toUpperCase() + "  **");
		System.out.println("\t\t" + row.toString() + "\n");
		
	}
	
	private static void showQuery(String please, String query, int numElements) {
		showQuery(start + " " + numElements + " " + query);
		String retVal = null;
		showQuery(query);
		
		Scanner scanner = new Scanner(System.in);
		retVal = scan.nextLine();
		
		return retVal;
	}
	
	}
	
	public static String readString(String query) {
		String retVal = null;
		showQuery(query);
		
		Scanner scanner = new Scanner(System.in);
		retVal = scan.nextLine();
		
		return retVal;
	}
	
	public static int readInt(String query) {
		int retVal = -1;
		showQuery(query);
		
		Scanner scan = new Scanner(System.in);
		retVal = scan.nextInt();
		
		return retVal;
	}
	
	public static double readDouble(String query) {
		double retVal = -1;
		showQuery(query);
		Scanner scanner = new Scanner(System.in);
		retVal = scan.nextDouble();
		return retVal;
	}
	
	public static void closeResource() {
		scan.close();
	}public static
}