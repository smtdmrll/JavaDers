package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElseStatements1 {

	public static void main(String[] args) {
		/*
		 * tek baþýna else yazýlamaz 
		 * if ve else varsa aksi durum söz konusu deðildir 
		 * 
		 * kullanýcýdan diktörtgenin kenar uzunluklarýný alýn 
		 * uzunluklar eþit ise kare deðilse kare deðil  
		 * 
		 */
		Scanner scan =new Scanner (System.in);
		
		System.out.println("kenar uzunluklarý giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1 ==kenar2) {
			System.out.println("karedir");
			
		} else {
			System.out.println("kare deðil ");
		}
		
		scan.close();
	}

}
