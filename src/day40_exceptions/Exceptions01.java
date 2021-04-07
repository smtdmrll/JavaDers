package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {
	public static void main(String[] args) {

		/*
		 * Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
		 * sayi girerse Exception verecek sekilde yazin.



		 * Scanner scan = new Scanner(System.in); 
		 * System.out.println("yaþ gir"); 
		 * int yas = scan.nextInt();
		 * 
		 * 
		 * if (yas > 0) { System.out.println("yaþýn" + yas); } 
		 * 
		 * else {
		 *  throw new IllegalArgumentException(); }
		 
		 
		 javaya bir exception throw ettirmek için "throw" ve "new" keywordleri kullanýlýr 
		 
		 
		// bu þekilde yazdýðýmýzda java exceptions throw eder ama
		// kodumuz bloke olmuþ olur
		// bloke olmasýný engellemek istersek try catch ile surround yapabiliriz
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("yaþ gir");
		int yas = scan.nextInt();

		try {
			if (yas > 0) {
				System.out.println("yaþýn" + yas);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("kod bloke olmamýþ");
		
		
		
		
	}
}































































