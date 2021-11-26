package com.bilgeadam.boost.java.course01.formatter;

import java.util.Formatter;

public class FormatSpecifiers {
	public static void main(String[] args) {
		// % [flags] [width] [.precision] [argsize] typechar
		
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar: %4d |\n", 1);
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar: %4d |\n", 11);
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar: %4d |\n", 111);
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar: % 4d |\n", -11);
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar: % 4d |\n\n", -11);
		
		System.out.printf("Sol tarafa yapışık 3 haneli sayılar: %-4d |\n", 1);
		System.out.printf("Sol tarafa yapışık 3 haneli sayılar: %-4d |\n", 11);
		System.out.printf("Sol tarafa yapışık 3 haneli sayılar: %-4d |\n", 111);
		System.out.printf("Sol tarafa yapışık 3 haneli sayılar: %-4d |\n", -11);
		System.out.printf("Sol tarafa yapışık 3 haneli sayılar: %-4d |\n\n", -11);
		
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar sıfır ile ön dolgulu: %03d |\n", 1);
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar sıfır ile ön dolgulu: %03d |\n", 11);
		System.out.printf("Sağ tarafa yapışık 3 haneli sayılar sıfır ile ön dolgulu: %03d |\n\n", 111);
		
		System.out.printf("Sağ tarafa yapışık 3 haneli virgüllü sayılar: %03f |\n", (float) 10 / 3);
		System.out.printf("Sağ tarafa yapışık 3 haneli virgüllü sayılar: %03f |\n", (float) 100 / 3);
		System.out.printf("Sağ tarafa yapışık 3 haneli virgüllü sayılar: %03f |\n\n", (float) 1000 / 3);
		
		System.out.printf("Sağ tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 2 hane: %10.2f |\n",
				(float) 10 / 3);
		System.out.printf("Sağ tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 3 hane: %10.3f |\n",
				(float) 100 / 3);
		System.out.printf("Sağ tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 4 hane: %10.4f |\n\n",
				(float) 1000 / 3);
		
		System.out.printf("Sol tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 2 hane: %-10.2f |\n",
				(float) 10 / 3);
		System.out.printf("Sol tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 3 hane: %-10.3f |\n",
				(float) 100 / 3);
		System.out.printf("Sol tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 4 hane: %-10.4f |\n\n",
				(float) 1000 / 3);
		
		System.out.printf("Çoklu örnek % 10.2f %s %3d |\n", (float) 1000 / 3, "virgüllü sayısının integer hali",
				1000 / 3);
		System.out.printf("Çoklu örnek % 10.2f %s %3d |\n", (float) 100 / 3, "virgüllü sayısının integer hali",
				100 / 3);
		System.out.printf("Çoklu örnek % 10.2f %s %3d |\n\n", (float) 10 / 3, "virgüllü sayısının integer hali",
				10 / 3);
		
		System.out.println(String.format(
				"Sağ tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 2 hane: %10.2f |\n", (float) 1234 / 67));
		
		Formatter formatter = new Formatter();
		String s = formatter.format("Sağ tarafa yapışık 3 haneli virgüllü sayılar virgülden sonra 2 hane: %10.2f |\n",
				(float) 1234 / 67).toString();
		System.out.println(s);
		formatter.close();
	}
	
}