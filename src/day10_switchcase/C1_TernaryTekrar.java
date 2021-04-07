package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan bir sayý alýn  ve sayý 3 basamaklý poz ise üç basamaklý sayý 
		 * deðilse üç basamaklý deðil 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("lütfen bir tam sayý giriniz ");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>99 ?  (sayi<1000? "sayi üç basamaklý ": "sayý üç basamaklý deðil ") : "sayý üç basamaklý deðil ");

		//nested olmadan da þu þekilde
		
		System.out.println(sayi>99 && sayi<1000 || sayi<-100 &&sayi>-1000 ?  "sayi üç basamaklý ": "sayý üç basamaklý deðil ");
		
		
		
		
		
		
		
		scan.close();
	}

}
