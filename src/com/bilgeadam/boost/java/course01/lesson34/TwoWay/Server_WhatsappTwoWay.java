package com.bilgeadam.boost.java.course01.lesson34.TwoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server_WhatsappTwoWay {
	
	public static void main(String[] args) throws IOException {
		String recieveMessage;
		String sendMessage;
		Date logsDate = new Date();
		ServerSocket serverSocket = new ServerSocket(StaticPort.PORT);
		System.out.println(Person.id + " " + Person.name + " " + Person.surname + " " + logsDate + "==>ÇEVRİM İÇİ<==");
		Socket socket = serverSocket.accept();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader recieveRead = new BufferedReader(new InputStreamReader(inputStream));
		
		while (true) {
			if ((recieveMessage = recieveRead.readLine()) != null) {
				System.out.println(
						Person.id2 + " " + Person.name2 + " " + Person.surname2 + " " + logsDate + recieveMessage);
			}
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush();
		}
		
	}
	
}
