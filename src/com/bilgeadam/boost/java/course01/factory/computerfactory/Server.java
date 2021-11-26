package com.bilgeadam.boost.java.course01.factory.computerfactory;

public class Server implements Computeable {
	
	@Override
	public int getRAMSize() {
		// TODO Auto-generated method stub
		return 128;
	}
	
	@Override
	public int getCPUSpeed() {
		// TODO Auto-generated method stub
		return 4000;
	}
	
	@Override
	public int getDiskSize() {
		// TODO Auto-generated method stub
		return 1000000;
	}
	
}
