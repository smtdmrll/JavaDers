package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		//kullan�can dairenin yar�n �ap�n� isteyin ve dairenin alan�n� yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("r de�eri gir ");
		
		double r=scan.nextDouble();
		
		System.out.println("dairenin alani= "+ 3.14*r*r);
		System.out.println("dairenin �api = "+ (r+r));
		System.out.println("dairenin �evresi = "+2*3.14*r);
		
		scan.close();
	}

}
