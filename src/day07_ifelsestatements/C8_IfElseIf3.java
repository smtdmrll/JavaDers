package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		/*
		 * kullan�c�ya maa� i�in y�ll�k teklif isteyin 
		 * 80 binin �st�nde olursa kabul 
		 * 60-80 aras� olursa konu�abiliriz 
		 * 60 alt� olursa kabul etmem 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("y�ll�k maa��n   ");
		int maas= scan.nextInt();
		
		if (maas>=80000) {
			System.out.println("kabul ediyorum ");
			
		}else if (maas>60000 ) {
			System.out.println("d���nebilirim");
		}else {
			System.out.println("ben sana vereyim de sen bana �al��");
		}
				
		scan.close();
	}

}
