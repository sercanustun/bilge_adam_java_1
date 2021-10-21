package com.bilgeadam.boost.java.course01.lesson33.hamithoca;

import java.io.DataOutputStream;
// GİRİLEN İSMİ BÜYÜK KÜÇÜK VE UZUNLUGUNU HESAPLAMA
import java.io.IOException;
import java.net.Socket;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.swing.JOptionPane;

// client demek istemde bulunan demektir.
// request: istek
public class _ClientOdev2DecoderEncoder {
	// şifreleme
	public static String encoderSocket() {
		String value = JOptionPane.showInputDialog("Lütfen bir şeyler yazınız");
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		return toPassword;
	}
	
	// bilgeadam
	// YmlsZ2VhZGFt
	
	// String sifrelenecekVeri = encoderSocket();
	// System.out.println("Şifrelenmiş data: " + sifrelenecekVeri);
	// String sifreCozuldu = decoderSocket(sifrelenecekVeri);
	
	// ClientServerTuto
	// id ==> int
	// port ==> int
	// ipAdress ==> String
	// logsDate ==> newDate()
	
	// main
	public static void main(String[] args) {
		String nameSurname, ipAddress = "localhost";
		int port = 7777;
		
		// veri gönderceğim.
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, port).getOutputStream())) {
			
			// şifrelenmiş data gönder
			nameSurname = encoderSocket();
			dataOutputStream.writeUTF(nameSurname);
		} catch (IOException io) {
			System.out.println("Hata meydana geldi");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
