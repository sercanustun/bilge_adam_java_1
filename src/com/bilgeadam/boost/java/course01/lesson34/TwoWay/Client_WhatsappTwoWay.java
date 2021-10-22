package com.bilgeadam.boost.java.course01.lesson34.TwoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Client_WhatsappTwoWay {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String sendMessage;
		String recieveMessage;
		Date logsDate = new Date();
		
		Socket socket = new Socket("localhost", StaticPort.PORT);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
		System.out.println(
				Person.id2 + " " + Person.name2 + " " + Person.surname2 + " " + new Date() + " Merhaba nasılsın ?");
		while (true) {
			
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush();
			
			if ((recieveMessage = bufferedReader2.readLine()) != null) {
				System.out.println(Person.id + " " + Person.name + " " + Person.surname + " " + new Date() + " : "
						+ recieveMessage);
				
			}
		}
	}
}
