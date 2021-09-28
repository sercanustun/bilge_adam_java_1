package com.bilgeadam.boost.java.course01.lesson16;

public class SingleArray {
	// aynı türdekiveri bir yerde tutmak için kullanıyoruz.
	// eleman sayısı bellidir.
	
	public static void main(String[] args) {
		// tek boyutlu ve 5 elemanlı dizi oluşturdum.
		// diziler sıfırıncı(0) indisten başlar
		// dizilerde for döngüsünde lenght kullanalım
		// 5-1 = 4 maks
		int[] dizi = new int[7];
		dizi[0] = 44;
		dizi[4] = 11;
		dizi[3] = 45;
		dizi[5] = 55;
		dizi[6] = 66;
		
		// iterative döngü
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		// for each döngüsü
	}
	
}
