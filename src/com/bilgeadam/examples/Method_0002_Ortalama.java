package com.bilgeadam.examples;

import java.util.Scanner;

//kullanýcý tarafýndan girilen sayýnýn ortalamasý alsýn
//ortalama 10'dan büyükse Büyük desin deðilse küçük desin.

public class Method_0002_Ortalama {
public static void returnAverage() {
int sayi1 = 1, sayi2 = 2, sayi3 = 3, sayi4 = 4;
System.out.println((sayi1 + sayi2 + sayi3 + sayi4) / 4);
}
public static void returnAverage(int sayi1, int sayi2, int sayi3, int sayi4) {
System.out.println((sayi1 + sayi2 + sayi3 + sayi4) / 4);
}
public static void returnAverage2() {
Scanner klavye = new Scanner(System.in);
int sayi1;
double toplam = 0, ortalamasý = 0.0;
for (int i = 0; i < 4; i++) {
System.out.println("Lütfen " + (i + 1) + " sayýlarý giriniz");
sayi1 = klavye.nextInt();
toplam += sayi1;
ortalamasý = toplam / (i + 1);
}
System.out.println(ortalamasý);
}
public static double returnAverage3() {
Scanner klavye = new Scanner(System.in);
int sayi1;
double toplam = 0, ortalamasý = 0.0;
for (int i = 0; i < 4; i++) {
System.out.println("Lütfen " + (i + 1) + " sayýlarý giriniz");
sayi1 = klavye.nextInt();
toplam += sayi1;
ortalamasý = toplam / (i + 1);
}
return ortalamasý;
}
public static void main(String[] args) {
//returnAverage();
//returnAverage(1, 2, 3, 4);
//returnAverage2();
double result = returnAverage3();
if (Math.round(result) >= 10) {
System.out.println("sayýnýz 10 veya 10 büyüktür");
} else {
System.out.println("sayýnýz 10 küçüktür");
}
}
}