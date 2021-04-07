package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {
	
	public static void main(String[] args) {
		int count=1;
		
		Scanner scan = new Scanner(System.in);
		
		while(count<100) {
		System.out.println("b�l�necek tam say�y� yaz�n");
		int sayi1 =scan.nextInt();
		System.out.println("b�leccek say�y� gir");
		int sayi2= scan.nextInt();
		/*
		java exceptions � handle etmek i�in bir ��z�m �retmezsek java exception ile kar��lat���nda 
	     	�al��may� durdurur buna (stop execution) deriz 
			throws exception (exception f�rlat�r)(problemiin kayna��n� bize g�sterir)
			
			t�m application durmu� olur...
			m��terinin kulland��� bir uygulama i�in bu KABUL ED�LEMEZ 
			bunun i�in kod yazan ki�i muhtemel sorunlar� �n g�rmeli ve javaya bu sorunla handle edebilmesi i�in 
				yol g�stermelidir
			
		  */
		 
		System.out.println("i�lem no: "+ count);
		try {
			System.out.println("b�lme i�lem sonucu : "+sayi1/sayi2);
		
		}catch (ArithmeticException e) {
			System.out.println("say�y� s�f�ra b�lemezsin ");
		}
		
		
		
		
		count++;
		}
	}
}
