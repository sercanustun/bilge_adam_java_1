package com.bilgeadam.examples;

import java.util.Scanner;

//kullan�c� taraf�ndan girilen say�n�n ortalamas� als�n
//ortalama 10'dan b�y�kse B�y�k desin de�ilse k���k desin.

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
double toplam = 0, ortalamas� = 0.0;
for (int i = 0; i < 4; i++) {
System.out.println("L�tfen " + (i + 1) + " say�lar� giriniz");
sayi1 = klavye.nextInt();
toplam += sayi1;
ortalamas� = toplam / (i + 1);
}
System.out.println(ortalamas�);
}
public static double returnAverage3() {
Scanner klavye = new Scanner(System.in);
int sayi1;
double toplam = 0, ortalamas� = 0.0;
for (int i = 0; i < 4; i++) {
System.out.println("L�tfen " + (i + 1) + " say�lar� giriniz");
sayi1 = klavye.nextInt();
toplam += sayi1;
ortalamas� = toplam / (i + 1);
}
return ortalamas�;
}
public static void main(String[] args) {
//returnAverage();
//returnAverage(1, 2, 3, 4);
//returnAverage2();
double result = returnAverage3();
if (Math.round(result) >= 10) {
System.out.println("say�n�z 10 veya 10 b�y�kt�r");
} else {
System.out.println("say�n�z 10 k���kt�r");
}
}
}