package day06_ifstatements;

import java.util.Scanner;

public class C5_ifstatement5 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir dikt�rtgenin iki kenar uzunlu�unu al�n 
		 * kenar uzunluklar� e�itse kare 
		 * e�it de�ilse dikt�rtgen yazd�r�n 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dikt�rtgenin kenarlar�  girin ");
		
		double ken1=scan.nextDouble();
		double ken2=scan.nextDouble();
		
		if (ken1>0 && ken2>0 && ken1 == ken2 ) {
			System.out.println("kare");
			
		}
		
		if (ken1>0 && ken2>0 && ken1!=ken2) {
			
			System.out.println("dikt�rtgen ");
			
		}
		if (ken1<=0 ||ken2<=0 ) {
			System.out.println("adam ak�ll� say� gir lan ");
			
		}
		if (ken1>0 && ken2>0 ) {
			System.out.println("alan� "+ (ken1*ken2 ) );
			System.out.println("�evresi "+ (2*ken1 + 2*ken2 ) );
			
		}
		scan.close();
	}

}
