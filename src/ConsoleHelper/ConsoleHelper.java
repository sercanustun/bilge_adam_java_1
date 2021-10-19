package ConsoleHelper;

import java.util.Map;
import java.util.Scanner;

public class ConsoleHelper {
	public static int showMenu(String title, Map<Integer, String> menu) {
		printTitle(title, 30);
		
		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			print(String.format("[ %02d - %-30s ]", key, val), 2, true);
			
		}
		printLine(30);
		
		return selectDigitSecim();
	}
	
	public static int selectDigitSecim() {
		Scanner scan = new Scanner(System.in);
		String secim;
		do {
			boolean isDigit = true;
			secim = scan.next().trim();
			for (int i = 0; i < secim.length(); i++) {
				if (!Character.isDigit(secim.charAt(i))) {
					isDigit = false;
				}
			}
			
			if (isDigit)
				return Integer.parseInt(secim + "");
			
		} while (true);
	}
	
	public static void print(String msg, int tabCount, boolean ln) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < tabCount; i++) {
			b.append("\t");
		}
		b.append(msg);
		b.append(ln ? "\n" : "");
		System.out.print(b);
		
	}
	
	public static void printTitle(String msg, int length) {
		int oddMsgLeng = msg.length() % 2;
		printLine(length);
		int center = (Math.round((length + 10) / 2) - 5);
		int end = (length + 10) - (center + msg.length());
		print(String.format("%-" + center + "s%s%" + end + "s", "=====", msg, "====="), 2, true);
		printLine(length);
	}
	
	public static void printLine(int msgLong) {
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		StringBuilder line = new StringBuilder();
		line.append("\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("=");
		}
		System.out.printf("%s\n", line);
	}
	
}
