package com.bilgeadam.boost.java.course01.factory;

import java.util.Scanner;

public class BilgeAdamComputer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen gerek duyduğunuz RAM boyutunu giriniz.");
		int ramSize = sc.nextInt();
		sc.nextLine();
		
		Computeable computer = ComputerFactory.createComputer(ramSize);
		System.out.println("Bilgisayarınızın RAM Boyutu = " + computer.getRAMSize());
		System.out.println("Bilgisayarınızın CPU speedi = " + computer.getCPUSpeed());
		System.out.println("Bilgisayarınızın Disk Boyutu = " + computer.getDiskSize());
		
		sc.close();
		
	}
}
