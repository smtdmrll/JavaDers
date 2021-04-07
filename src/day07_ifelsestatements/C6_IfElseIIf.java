package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIIf {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan 100 üzerinden not iste notu harf sistemine çeivr 
		 * 50 den küçükse d 50-60 c gibi
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("notunu gir çocuk");
		
		double not = scan.nextDouble();
		
		 if (not<0 || not >100) {
			 System.out.println("adam akýllý not gir lan");
			
		}else if (not<50){// notumuz 0<=not<=100 0 la 100 arasýnda olmasaydý buraya gelmezdi orda biterdi
			System.out.println("notun: D yýkýl karþýmdan ");
			
		}else if ( not<60 ) {// bu satýra geldiyse 50 den büyük bir daha kontrol etmene gerek yok 
			System.out.println("notun : C az daha çalýþ it");
			
		}else if (not<80) {//bu satýra geldiyse zaten 60 ýn üstü
			System.out.println("notun : B aferin ");
			
		}else {// buraya tekrar if girmeyiz çünkkü en son basamaðýmýz  80-100 arasýnda baþka ihtimal yok 
			System.out.println("notun A lan aferin");
			
		}
		 scan.close();
	
	}
	

}
