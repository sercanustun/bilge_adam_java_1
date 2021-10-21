package com.bilgeadam.boost.java.course01.lesson33.hamithoca;

import java.io.DataOutputStream;
// GİRİLEN İSMİ BÜYÜK KÜÇÜK VE UZUNLUGUNU HESAPLAMA
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

// client demek istemde bulunan demektir.
// request: istek
public class _ClientOdev {
	
	// main
	public static void main(String[] args) {
		// Scanner klavye = null;
		String isimSoyisim;
		
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
			isimSoyisim = JOptionPane.showInputDialog("Lütfen Adınızı Giriniz");
			dataOutputStream.writeUTF(isimSoyisim);
			
		} catch (IOException io) {
			System.out.println("Hata meydana geldi");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}