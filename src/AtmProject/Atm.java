package AtmProject;

import java.util.HashMap;

public class Atm {
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