package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//kullanýcadan bir sayý isteyin ve sayýnýn tek veya çift sayý olduðunu yazdýrýn 
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen bir sayý giriniz ");
		int sayi = scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("sayi çift");
			
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("sayi tek ");
			
		}
		System.out.println(sayi%2);
		System.out.println("iyi ki katýldýn");
		
		scan.close();
	}
}
