package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan iki say� al b�y�k olan� yazd�r 
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("iki adet say giriniz");
		
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		 
		System.out.println(a>=b ? a:b);
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
