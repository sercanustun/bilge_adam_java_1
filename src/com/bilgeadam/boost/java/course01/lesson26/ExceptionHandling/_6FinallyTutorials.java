package com.bilgeadam.boost.java.course01.lesson26.ExceptionHandling;

public class _6FinallyTutorials {
	
	public static void main(String[] args) {
		try {
			
			int a = 3 / 0;
			System.out.println("Kapatılacak : db.close(); ");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// kesin kapatılacak olan bileşenleri buraya alırız
			System.out.println("Kapatılacak : db.close(); ");
			// socket.close()
		}
		
	}
}
