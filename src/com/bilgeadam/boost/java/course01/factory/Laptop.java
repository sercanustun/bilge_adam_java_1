package com.bilgeadam.boost.java.course01.factory;

public class Laptop implements Computeable {
	
	@Override
	public int getRAMSize() {
		// TODO Auto-generated method stub
		return 8;
	}
	
	@Override
	public int getCPUSpeed() {
		// TODO Auto-generated method stub
		return 1800;
	}
	
	@Override
	public int getDiskSize() {
		// TODO Auto-generated method stub
		return 500;
	}
	
}
