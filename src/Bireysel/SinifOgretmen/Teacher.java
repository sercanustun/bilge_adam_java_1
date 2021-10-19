package Bireysel.SinifOgretmen;

public class Teacher {
	String name;
	String mpno;
	String branch;
	
	public Teacher(String name, String branch, String mpno) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	
	void print() {
		System.out.println("Adi = " + this.name);
		System.out.println("Telefon Numarası = " + this.mpno);
		System.out.println("Branch = " + this.branch);
	}
}
