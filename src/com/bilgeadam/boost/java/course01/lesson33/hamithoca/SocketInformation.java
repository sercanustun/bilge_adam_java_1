package com.bilgeadam.boost.java.course01.lesson33.hamithoca;

import java.util.Date;

public class SocketInformation {
	private int id;
	private String ipAdress;
	private int port;
	private Date logsDate;
	
	public SocketInformation() {
		this.ipAdress = "localhost";
		this.port = 6666;
		
		logsDate = new Date(System.currentTimeMillis());
		
	}
	
	public SocketInformation(int id, String ipAdress, int port, Date logsDate) {
		super();
		this.id = id;
		this.ipAdress = ipAdress;
		this.port = port;
		this.logsDate = logsDate;
	}
	
	@Override
	public String toString() {
		return "SocketInformation [id=" + id + ", ipAdress=" + ipAdress + ", port=" + port + ", logsDate=" + logsDate
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIpAdress() {
		return ipAdress;
	}
	
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public Date getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(Date logsDate) {
		this.logsDate = logsDate;
	}
	
}
