package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElseStatements1 {

	public static void main(String[] args) {
		/*
		 * tek ba��na else yaz�lamaz 
		 * if ve else varsa aksi durum s�z konusu de�ildir 
		 * 
		 * kullan�c�dan dikt�rtgenin kenar uzunluklar�n� al�n 
		 * uzunluklar e�it ise kare de�ilse kare de�il  
		 * 
		 */
		Scanner scan =new Scanner (System.in);
		
		System.out.println("kenar uzunluklar� giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1 ==kenar2) {
			System.out.println("karedir");
			
		} else {
			System.out.println("kare de�il ");
		}
		
		scan.close();
	}

}
