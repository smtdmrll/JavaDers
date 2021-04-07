package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kuldan iki tam sayý al ve bolumlerini yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("bölünecek tam sayýyý yazýn");
		int sayi1 =scan.nextInt();
		System.out.println("böleccek sayýyý gir");
		int sayi2= scan.nextInt();
		
		//java exceptions ý handle etmek için try-catch bloðu oluþturmuþ 
		
		try {
		System.out.println("bölme iþlem sonucu : "+sayi1/sayi2);
		
		}catch (ArithmeticException e) {
			System.out.println("sayýyý sýfýra bölemezsin");
		}
		
	}	
}
