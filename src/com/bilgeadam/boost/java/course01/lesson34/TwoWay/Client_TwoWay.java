package com.bilgeadam.boost.java.course01.lesson34.TwoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// Client: veri alımı ve veri göndermek
public class Client_TwoWay {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String recieveMessage; // mesaj almak için
		String sendMessage; // Mesaj göndermek
		// port açılımı yapıyoruz.
		Socket socket = new Socket("localhost", StaticPort.PORT);
		
		// Client veri gönderecek
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		// Serverden gelen bilgiyi almak
		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
		
		System.out.println("Client : Lütfen mesaj yazınız ");
		
		while (true) {
			// clientten veri alımı
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush(); // tazelenmeyi sağlıyor.
			
			if ((recieveMessage = bufferedReader2.readLine()) != null) {
				System.out.println("SERVER : " + recieveMessage);
				
			}
		}
	}
}
