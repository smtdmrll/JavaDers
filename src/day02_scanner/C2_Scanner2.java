package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		//kullanýcan dairenin yarýn çapýný isteyin ve dairenin alanýný yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("r deðeri gir ");
		
		double r=scan.nextDouble();
		
		System.out.println("dairenin alani= "+ 3.14*r*r);
		System.out.println("dairenin çapi = "+ (r+r));
		System.out.println("dairenin çevresi = "+2*3.14*r);
		
		scan.close();
	}

}
