package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {
	public static void main(String[] args) {

		/*
		 * Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
		 * sayi girerse Exception verecek sekilde yazin.



		 * Scanner scan = new Scanner(System.in); 
		 * System.out.println("ya� gir"); 
		 * int yas = scan.nextInt();
		 * 
		 * 
		 * if (yas > 0) { System.out.println("ya��n" + yas); } 
		 * 
		 * else {
		 *  throw new IllegalArgumentException(); }
		 
		 
		 javaya bir exception throw ettirmek i�in "throw" ve "new" keywordleri kullan�l�r 
		 
		 
		// bu �ekilde yazd���m�zda java exceptions throw eder ama
		// kodumuz bloke olmu� olur
		// bloke olmas�n� engellemek istersek try catch ile surround yapabiliriz
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("ya� gir");
		int yas = scan.nextInt();

		try {
			if (yas > 0) {
				System.out.println("ya��n" + yas);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("kod bloke olmam��");
		
		
		
		
	}
}































































