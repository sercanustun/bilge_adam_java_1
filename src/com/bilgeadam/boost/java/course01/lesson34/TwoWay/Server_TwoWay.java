package com.bilgeadam.boost.java.course01.lesson34.TwoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// server : gelen isteği yerine getirir.
public class Server_TwoWay {
	
	public static void main(String[] args) throws IOException {
		String recieveMessage; // mesaj almak için
		String sendMessage; // Mesaj göndermek
		ServerSocket serverSocket = new ServerSocket(StaticPort.PORT);
		System.out.println("Server Hazır ...");
		Socket socket = serverSocket.accept();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader recieveRead = new BufferedReader(new InputStreamReader(inputStream));
		
		while (true) {
			if ((recieveMessage = recieveRead.readLine()) != null) {
				System.out.println("CLİENT : " + recieveMessage);
			}
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush();
		}
		
	}
	
}
