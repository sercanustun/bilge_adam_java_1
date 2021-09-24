package com.bilgeadam.boost.java.course01.util;

import java.util.Scanner;

public class BAUtills {
	private static Scanner scan = new Scanner(System.in);
	
	public static void footen() {
		System.out.println("\tProgram� Kullan d���n�z ��in Te�ekk�rler");
		System.out.println("\t\tTekrar G�r��mek �zere");
		
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
	
	private static String showQuery(String please, String query, int numElements) {
		
		String start = null;
		showQuery(start + " " + numElements + " " + query, start, numElements);
		String retVal = null;
		showQuery(query, retVal, numElements);
		
		Scanner scanner = new Scanner(System.in);
		retVal = scan.nextLine();
		
		return retVal;
	}
	
	public static String readString(String query) {
		String retVal = null;
		showQuery(query, retVal, 0);
		
		Scanner scanner = new Scanner(System.in);
		retVal = scan.nextLine();
		
		return retVal;
	}
	
	public static int readInt(String query) {
		int retVal = -1;
		showQuery(query, query, retVal);
		
		Scanner scan = new Scanner(System.in);
		retVal = scan.nextInt();
		
		return retVal;
	}
	
	public static double readDouble(String query) {
		double retVal = -1;
		showQuery(query, query, 0);
		Scanner scanner = new Scanner(System.in);
		retVal = scan.nextDouble();
		return retVal;
	}
	
	public static void closeResource() {
		scan.close();
	}
	
	public static boolean proceeeding(String question, String positiveAnswer) {
		boolean retVal = true;
		String answer = readString(question);
		retVal = answer.equalsIgnoreCase(positiveAnswer);
		
		return retVal;
		
	}
	
}