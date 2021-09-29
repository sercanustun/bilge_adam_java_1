package com.bilgeadam.boost.java.course01.lesson17;

import java.util.Random;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class AssignElements2Array {
	
	public static void main(String[] args) {
		int len = BAUtils.readInt("Array Uzunluğu");
		int[] arr1 = new int[len];
		System.out.println(arr1.length);
		
		Random rndm = new Random();
		int[] arr2 = new int[len];
		for (int i = 0; i < len; i++) {
			arr1[i] = rndm.nextInt(100);
			System.out.print(arr1[i] + " ");
		}
		int[] arr3 = new int[len];
		int targetCount = 0;
		for (int sourceCount = 0; sourceCount < len; sourceCount++) {
			if (arr1[sourceCount] % 2 == 0) {
				arr2[targetCount] = arr1[sourceCount];
				arr3[sourceCount] = arr1[sourceCount];
				targetCount++;
				
			}
		}
		System.out.print("\n\n Seçilmiş Düzgün Yerleştirilmiş Öğeler: ");
		for (int i = 0; i < len; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.print("\n\n Seçilmiş Düzgün Yerleştirilmemiş Öğeler Öğeler: ");
		for (int i = 0; i < len; i++) {
			System.out.print(arr3[i] + " ");
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
			}
			if (arr1[i] > max) {
				max = arr1[i];
			}
			System.out.println("Min " + min + "\nMax " + max);
		}
		for (int i : arr3) {
			System.out.println(i);
		}
		for (int arrayElement : arr2) {
			arrayElement++;
		}
		for (int i = 0; i < len; i++) {
			int arrayElement = arr2[i];
			arrayElement++;
		}
	}
}