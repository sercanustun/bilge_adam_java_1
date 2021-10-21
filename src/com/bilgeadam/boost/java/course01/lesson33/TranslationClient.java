package com.bilgeadam.boost.java.course01.lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class TranslationClient {
	
	public static void main(String[] args) {
		HashMap<String, String> texts = new HashMap<>();
		ResourceBundle rB = ResourceBundle.getBundle("com.bilgeadam.boost.java.course01.lesson33.TranslationTexts");
		Enumeration<String> enums = rB.getKeys();
		
		while (enums.hasMoreElements()) {
			String key = enums.nextElement();
			texts.put(rB.getString(key), key);
		}
		
		try (Socket socket = new Socket("localhost", 4711);) {
			
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			writer.println("Saat kaç?");
			System.out.println(br.readLine());
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}