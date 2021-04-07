package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kuldan iki tam say� al ve bolumlerini yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("b�l�necek tam say�y� yaz�n");
		int sayi1 =scan.nextInt();
		System.out.println("b�leccek say�y� gir");
		int sayi2= scan.nextInt();
		
		//java exceptions � handle etmek i�in try-catch blo�u olu�turmu� 
		
		try {
		System.out.println("b�lme i�lem sonucu : "+sayi1/sayi2);
		
		}catch (ArithmeticException e) {
			System.out.println("say�y� s�f�ra b�lemezsin");
		}
		
	}	
}
