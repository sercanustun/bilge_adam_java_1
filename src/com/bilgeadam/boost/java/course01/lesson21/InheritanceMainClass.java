package com.bilgeadam.boost.java.course01.lesson21;

public class InheritanceMainClass {
	public static void main(String[] args) {
		msiComputer msiComputer = new msiComputer();
		msiComputer.setComputerMainCart("msi main card");
		msiComputer.setComputerName("Msi");
		System.out.println(msiComputer);
		msiComputer.deneme();
		
		System.out.println("/////////////////////////");
		
		asusComputer asusComputer = new asusComputer();
		asusComputer.setComputerMainCart("asus main card");
		asusComputer.setComputerName("asus");
		System.out.println(asusComputer);
		asusComputer.deneme();
		System.out.println("/////////////////////////");
		
		monsterComputer monsterComputer = new monsterComputer();
		monsterComputer.setComputerMainCart("monster main card");
		monsterComputer.setComputerName("monster");
		System.out.println(monsterComputer);
		monsterComputer.deneme();
		System.out.println("/////////////////////////");
		
	}
}