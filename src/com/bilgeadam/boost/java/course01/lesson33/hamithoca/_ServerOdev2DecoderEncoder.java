package com.bilgeadam.boost.java.course01.lesson33.hamithoca;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Base64;
import java.util.Base64.Decoder;

// server: hizmet veren clienttan gelen istekleri yerine getiren

// dağıtık sistemde: ağ üzerinden çalışmayı sağlıyor.

// client:veri gonderecegim
// DataOutputStream dataOutputStream = new DataOutputStream(new
// Socket(ipAddress, port).getOutputStream())

// server
// DataInputStream dataInputStream = new DataInputStream(new
// ServerSocket(port).accept().getInputStream())

// önemli not: once serveri çalıştırın sonrasında client
public class _ServerOdev2DecoderEncoder {
	
	// şifre çözücü
	public static String decoderSocket(String value) {
		Decoder decoder = Base64.getDecoder();
		String explainPassword = new String(decoder.decode(value));
		return explainPassword;
	}
	
	public static void main(String[] args) {
		int port = 7777;
		String clientValue; // Cliennten gelen String yapı
		System.out.println("Server hazır ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			
			// şifrelenmiş data geldi
			clientValue = dataInputStream.readUTF();
			String explain = decoderSocket(clientValue);
			System.out.println("şifreli: " + clientValue + " Şifrelenmiş data çözümü: " + explain);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
