package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * 
		 */

		int sayi=0;
		
		do {
			Scanner scan=new Scanner (System.in);
			System.out.println("poz say�  gir");
			sayi =scan.nextInt();
			
		} while (sayi<=0);
		
		System.out.println("afferin mk �ocu");
		
		
	}

}
