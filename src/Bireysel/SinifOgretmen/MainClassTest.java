package Bireysel.SinifOgretmen;

public class MainClassTest {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "Tarih", "905657879565");
		Teacher t2 = new Teacher("GrahamBell", "FZK", "0455457878");
		Course tarih = new Course("Tarih", "101", "TRH", t1);
		tarih.addTeacher(t1);
		
	}
	
}
