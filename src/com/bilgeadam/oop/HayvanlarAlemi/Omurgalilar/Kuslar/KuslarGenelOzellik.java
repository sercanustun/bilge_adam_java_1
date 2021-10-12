package com.bilgeadam.oop.HayvanlarAlemi.Omurgalilar.Kuslar;

import com.bilgeadam.oop.HayvanlarAlemi.GenelOzellikler;
import com.bilgeadam.oop.HayvanlarAlemi.Omurgalilar.IOmurgali;

public class KuslarGenelOzellik extends GenelOzellikler implements IOmurgali {
	// Sadece Kuslara Ozgu Ozellikler
	private String yumurta;
	
	// parametresiz constructor
	public KuslarGenelOzellik() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public KuslarGenelOzellik(String ureme, String tuketim, String hareket, String yumurta) {
		super(ureme, tuketim, hareket, adi);
		this.yumurta = yumurta;
	}
	
	@Override
	public void omurgali() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sicakkan() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void kapalidolasim() {
		// TODO Auto-generated method stub
		
	}
	
	// toString
	@Override
	public String toString() {
		return "KuslarGenelOzellik [yumurta=" + yumurta + ", ureme=" + ureme + ", tuketim=" + tuketim + ", hareket="
				+ hareket + "]";
	}
	
	73
	// getterandsetter
	public String getYumurta() {
		return yumurta;
	}
	
	public void setYumurta(String yumurta) {
		this.yumurta = yumurta;
	}
	
}
