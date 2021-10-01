package com.bilgeadam.boost.java.course01.lesson19;

// private ==> sadece o classtakiler erişebilirler.
// Generics Class
public class GenerisClass<T> {
	// sadece o classtakiler erişebilir.
	// Nesne değişkeni :
	private T adi;
	private T soyadi;
	
	// parametresiz constructor
	// ctrl + space
	public GenerisClass() {
		
	}
	// Shift+Alt+S // parametreli constructer
	// this ==> 2 tane yapı için kullanıyoruz.
	// global değişkenlere erişmek
	// başka constructorları çağırmak için kullanıyoruz.
	
	public GenerisClass(T adi, T soyadi) {
		// super();
		this.adi = adi;
		this.soyadi = soyadi;
	}
	// getter & setter
	// Shift+Alt+S// getter & setter
	
	public T getAdi() {
		return adi;
	}
	
	public void setAdi(T adi) {
		this.adi = adi;
	}
	
	public T getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(T soyadi) {
		this.soyadi = soyadi;
	}
	
	@Override
	public String toString() {
		return "GenerisClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
}
