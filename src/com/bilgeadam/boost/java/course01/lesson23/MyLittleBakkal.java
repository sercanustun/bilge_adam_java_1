package com.bilgeadam.boost.java.course01.lesson23;

import java.util.HashMap;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class MyLittleBakkal {
	
	public static void main(String[] args) {
		
		BAUtils.header("B E N İ M   B A K K A L I M");
		
		HashMap<Integer, String> menu = initMenu();
		boolean cont = true;
		do {
			int selection = BAUtils.menu(menu);
			cont = processMenu(selection);
		} while (cont);
		BAUtils.footer();
	}
	
	private static boolean processMenu(int selection) {
		if (selection == 99)
			return false;
		System.out.println(selection + " seçildi");
		return true;
		
	}
	
	private static HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<>();
		
		menu.put(1, "Çalışan Grişi");
		menu.put(2, "Ürün Listele");
		menu.put(8, "Ürün Gir");
		menu.put(23, "Stok Sorgula");
		menu.put(6, "Fiyat Güncelleme");
		menu.put(7, "Müşteri tanımla");
		menu.put(3, "Müşteri Listesi");
		menu.put(4, "Ürün Listesi");
		menu.put(99, "Programı Bitir");
		return menu;
		
	}
	
}
