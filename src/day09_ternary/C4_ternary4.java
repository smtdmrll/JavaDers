package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen bir tam sayý gir");
		int a =scan.nextInt();
		
		System.out.println(a%2==0 ? "çift sayý": "tek sayý");
		
		//girilen sayýnýn mutlak deðerini bulun 
		
		System.out.println(	a>0 ? a:-a);

		
		
		
		scan.close();
	}

}
