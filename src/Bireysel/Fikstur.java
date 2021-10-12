package Bireysel;

import java.util.ArrayList;
import java.util.List;

public class Fikstur {
	public static void main(String[] args) {
		List<String> takımlar = new ArrayList<String>();
		takımlar.add("beşiktaş".toUpperCase());
		takımlar.add("galatasaray".toUpperCase());
		takımlar.add("fenerbahçe".toUpperCase());
		takımlar.add("trabzon".toUpperCase());
		takımlar.add("bursa".toUpperCase());
		takımlar.add("antep".toUpperCase());
		int k = 2;
		List<String> takımlar2 = new ArrayList<String>();
		
		String sabit = takımlar.get(0);
		takımlar.remove(takımlar.get(0));
		for (int i = 0; i < takımlar.size(); i++) {
			
			System.out.println("\n--" + (i + 1) + ".hafta" + "--");
			System.out.println();
			System.out.println(sabit + "-vs-" + takımlar.get(0));
			
			for (int j = 1; j <= (takımlar.size() / 2); j++) {
				
				System.out.println(takımlar.get(j) + "-vs-" + takımlar.get((takımlar.size() - j)));
				
			}
			
			takımlar2.add(0, takımlar.get(0));
			takımlar.remove(0);
			takımlar.add(4, takımlar2.get(0));
		}
		
		for (int i = 0; i < takımlar.size(); i++) {
			
			System.out.println("\n--" + (i + 6) + ".hafta" + "--");
			System.out.println();
			System.out.println(takımlar.get(0) + "-vs-" + sabit);
			
			for (int j = 1; j < (takımlar.size() - 2); j++) {
				
				System.out.println(takımlar.get((takımlar.size() - j)) + "-vs-" + takımlar.get(j));
				
			}
			
			takımlar2.add(0, takımlar.get(0));
			takımlar.remove(0);
			takımlar.add(4, takımlar2.get(0));
		}
	}
	
}
