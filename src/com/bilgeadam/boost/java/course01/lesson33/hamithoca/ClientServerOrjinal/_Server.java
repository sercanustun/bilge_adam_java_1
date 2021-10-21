package com.bilgeadam.boost.java.course01.lesson33.hamithoca.ClientServerOrjinal;

import java.io.DataInputStream;
import java.net.ServerSocket;

// server: hizmet veren clienttan gelen istekleri yerine getiren

// dağıtık sistemde: ağ üzerinden çalışmayı sağlıyor.

// client:veri gonderecegim
// DataOutputStream dataOutputStream = new DataOutputStream(new
// Socket(ipAddress, port).getOutputStream())

// server
// DataInputStream dataInputStream = new DataInputStream(new
// ServerSocket(port).accept().getInputStream())

// önemli not: once serveri çalıştırın sonrasında client
public class _Server {
	
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Cliennten gelen String yapı
		String clientValue;
		
		// String bir yapıyı tam sayıya çevirmek "25" Math.sqrt(25)
		int stringToInteger;
		
		System.out.println("Server hazır ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			
			// String'ten int'e çevirsin
			stringToInteger = Integer.valueOf(clientValue);
			System.out.println(stringToInteger + " sayısının Karekökü: " + Math.sqrt(stringToInteger));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
