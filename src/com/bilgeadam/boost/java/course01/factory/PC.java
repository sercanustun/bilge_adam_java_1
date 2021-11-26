package com.bilgeadam.boost.java.course01.factory;

public class PC implements Computeable {
	
	@Override
	public int getRAMSize() {
		// TODO Auto-generated method stub
		return 32;
	}
	
	@Override
	public int getCPUSpeed() {
		// TODO Auto-generated method stub
		return 2500;
	}
	
	@Override
	public int getDiskSize() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
}
