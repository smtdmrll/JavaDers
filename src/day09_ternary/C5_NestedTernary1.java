package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan dikt�rtgenin uzunlu�unu ve geni�li�ini al�n girilen de�erlere kare kare mi de�il mi 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("dikt�rgenin kenar� ve uzunlu�unu gir");
		double a =scan.nextDouble();
		double b =scan.nextDouble();	
		
		//System.out.println( a==b ? "kare " : "kare de�il "); ama eksi de�erlerde s�k�nt�
		
		System.out.println(a>0 && b>0 ? (a==b ? "kare " : "kare de�il "): "ge�ersiz kenar uzunlu�u ");	
		scan.close();
	}

}
