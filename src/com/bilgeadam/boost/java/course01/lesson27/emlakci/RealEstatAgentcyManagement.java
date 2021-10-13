package com.bilgeadam.boost.java.course01.lesson27.emlakci;

import java.time.LocalDate;

public class RealEstatAgentcyManagement {
	
	private static RealEstatAgentc agency;
	
	public static void main(String[] args) {
		Adress agencyAddr = new Adress("Balık Sokak", "Istanbul", "Turkey", 15);
		RealEstatAgentc agency = new RealEstatAgentc("Konu Realty", agencyAddr);
		Adress landAddr = new Adress("İnönü Caddesi", "Istanbul", "Turkey", 15);
		Dimension landDim = new Dimension(100.10, 200.0);
		Land land1 = new Land("PazarYeri", landAddr, landDim, LocalDate.now(), 200000.0);
		agency.addRealty(land1);
		House house1 = new House("Bilge Apt", new Adress("Mustafa Caddesi", "Istanbul", "Turkey", 45),
				new Dimension(10.0, 10.5), LocalDate.parse("2021-10-15"));
		house1.setLevelNumber(3);
		house1.setNumOfRooms(3);
		house1.setPrice(2000);
		agency.addRealty(house1);
		serializeAgency(agency);
		
		System.out.println(agency);
		
	}
	
	private static void serializeAgency(RealEstatAgentc agency) {
		RealEstatAgentcyManagement.agency = agency;
		// TODO Auto-generated method stub
		
	}
	
}
