package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIIf {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan 100 �zerinden not iste notu harf sistemine �eivr 
		 * 50 den k���kse d 50-60 c gibi
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("notunu gir �ocuk");
		
		double not = scan.nextDouble();
		
		 if (not<0 || not >100) {
			 System.out.println("adam ak�ll� not gir lan");
			
		}else if (not<50){// notumuz 0<=not<=100 0 la 100 aras�nda olmasayd� buraya gelmezdi orda biterdi
			System.out.println("notun: D y�k�l kar��mdan ");
			
		}else if ( not<60 ) {// bu sat�ra geldiyse 50 den b�y�k bir daha kontrol etmene gerek yok 
			System.out.println("notun : C az daha �al�� it");
			
		}else if (not<80) {//bu sat�ra geldiyse zaten 60 �n �st�
			System.out.println("notun : B aferin ");
			
		}else {// buraya tekrar if girmeyiz ��nkk� en son basama��m�z  80-100 aras�nda ba�ka ihtimal yok 
			System.out.println("notun A lan aferin");
			
		}
		 scan.close();
	
	}
	

}
