package com.bilgeadam.boost.java.course01.lesson33.hamithoca.ClientServerOrjinal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

// client demek istemde bulunan demektir.
// request: istek
public class _Client {
	
	// main
	public static void main(String[] args) {
		// Scanner klavye = null;
		String number;
		
		// DNS IP
		// localhost ==> 127.0.0.1
		String ipAddress = "localhost";
		
		// 65536
		int port = 7777;
		
		// veri gönderceğim.
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, port).getOutputStream())) {
			
			// System.out.println("Lütfen bir sayı giriniz");
			// klavye = new Scanner(System.in);
			// number = klavye.nextLine();
			number = JOptionPane.showInputDialog("Lütfen bir sayı giriniz");
			dataOutputStream.writeUTF(number);
			
		} catch (IOException io) {
			System.out.println("Hata meydana geldi");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}