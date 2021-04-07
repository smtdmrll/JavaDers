package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		/*
		 * kullancdan y�l al�p art�k y�l olup olamd���na bak 
		 * 4 ile b�l�nemeyen y�llar art�k de�il 
		 * 4 �n kat� olmas�na ra�men 100 ile b�l  y�llardan SADECE 400 �n kat� olan y�llar art�k y�ld�r 
		 */
		
		Scanner scan = new Scanner (System.in );
 		 
		System.out.println("y�l gir ");
		
		int yil = scan.nextInt();
		
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("artik yil");
			}else {
				System.out.println("art�k yil de�il ");
			}
			
		}else {
			if (yil%4==0) {
				System.out.println("art�k y�l ");
			}else {
				System.out.println("art�k y�l de�il");
			}
		}
		scan.close();
	}

}
