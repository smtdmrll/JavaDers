package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen bir tam say� gir");
		int a =scan.nextInt();
		
		System.out.println(a%2==0 ? "�ift say�": "tek say�");
		
		//girilen say�n�n mutlak de�erini bulun 
		
		System.out.println(	a>0 ? a:-a);

		
		
		
		scan.close();
	}

}
