package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtilYil {

	public static void main(String[] args) {
		/*
		 * kullancdan y�l al�p art�k y�l olup olamd���na bak 
		 * 4 ile b�l�nemeyen y�llar art�k de�il 
		 * 4 �n kat� olmas�na ra�men 100 ile b�l  y�llardan SADECE 400 �n kat� olan y�llar art�k y�ld�r 
		 */
		
		Scanner scan = new Scanner (System.in );
 		 
		System.out.println("y�l gir ");
		
		int yil = scan.nextInt();
		
		if (yil%4==0 && yil %100 != 0) {
			System.out.println("art�k y�l ");
			
		} else if (yil %4==0 && yil %100 ==0 && yil %400==0) {//yil %4==0 && yazmam�za gerek yok asl�nda 100 ile b�l�nebilen zaten 4 ile de b�l�n�r 
			
			System.out.println("artik yil ");
		}else {
			System.out.println("art�k y�l de�il");
		}
		
		scan.close();
		
	}

}
