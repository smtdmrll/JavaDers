package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan üçgenin kenar uzunkluklarýný alýn üç kenar eþitse eþ kenar
		 * yoksa  eþ kenar deðil
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("üçgenin kenar uzunluklarýný gir ");
		int ken1 =scan.nextInt();
		int ken2=scan.nextInt();
		int ken3=scan.nextInt();
		
		if (ken1==ken2 && ken2==ken3 ) {
			System.out.println("eþkenar üçgen");
			
		}else {
			System.out.println("eþkenar deðil");
		}
		scan.close();
	}

}
