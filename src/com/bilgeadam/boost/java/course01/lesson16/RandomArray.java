package com.bilgeadam.boost.java.course01.lesson16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int len = rnd.nextInt(20);
		int[] array = new int[len];
		for (int i = 0; i < (len / 2); i++) {
			array[i] = rnd.nextInt(100);
			
		}
		for (int i = len / 2; i < len; i++) {
			System.out.print("Bir sayı : ");
			array[i] = scan.nextInt();
			
		}
		System.out.println("Dizi Öğeleri : " + Arrays.toString(array));
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int numOfEvens = 0;
		int sumEvens = 0;
		
		for (int i = 0; i < len; i++) {
			if ((array[i] % 2) == 0) {
				sumEvens += array[i];
				numOfEvens++;
			} else {
				if (min > array[i]) {
					min = array[i];
				}
				if (max < array[i]) {
					max = array[i];
				}
			}
			
		}
		System.out.println("En Küçük Tek Sayı " + min);
		System.out.println("En Büyük Tek Sayı " + max);
		System.out.println("Çift Adeti " + numOfEvens);
		System.out.println("Çift Sayı Ortalama " + sumEvens);
		
		scan.close();
	}
}
