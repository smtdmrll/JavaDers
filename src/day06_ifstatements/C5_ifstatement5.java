package day06_ifstatements;

import java.util.Scanner;

public class C5_ifstatement5 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan bir diktörtgenin iki kenar uzunluðunu alýn 
		 * kenar uzunluklarý eþitse kare 
		 * eþit deðilse diktörtgen yazdýrýn 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("diktörtgenin kenarlarý  girin ");
		
		double ken1=scan.nextDouble();
		double ken2=scan.nextDouble();
		
		if (ken1>0 && ken2>0 && ken1 == ken2 ) {
			System.out.println("kare");
			
		}
		
		if (ken1>0 && ken2>0 && ken1!=ken2) {
			
			System.out.println("diktörtgen ");
			
		}
		if (ken1<=0 ||ken2<=0 ) {
			System.out.println("adam akýllý sayý gir lan ");
			
		}
		if (ken1>0 && ken2>0 ) {
			System.out.println("alaný "+ (ken1*ken2 ) );
			System.out.println("çevresi "+ (2*ken1 + 2*ken2 ) );
			
		}
		scan.close();
	}

}
