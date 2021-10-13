package com.bilgeadam.boost.java.course01.lesson27.emlakci;

import java.io.Serializable;
import java.util.HashMap;

public class RealEstatAgentc implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Adress adress;
	private HashMap<String, Realty> realties; // key = name --- value = Realty
	
	public RealEstatAgentc(String name, Adress adress) {
		this.name = name;
		this.adress = adress;
		this.realties = new HashMap<>();
		
	}
	
	public void addRealty(Realty realty) {
		this.realties.put(realty.getName(), realty);
	}
	
	public Realty getRealty(String name) {
		return this.realties.get(name);
	}
	
}