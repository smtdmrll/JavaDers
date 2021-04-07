package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		/*
		 * kul dan yaþýný gir 
		 * 65 ten büyükse emekli olabilirsin
		 * yoksa emekli olamazsýn 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("yaþýný git");
		
		byte yas= scan.nextByte();
		
		if (yas>=65) {
			System.out.println("emekli ol ihtiyar");
			
		}else {
			System.out.println("hele dur daha ");
		}
		scan.close();
	}

}
