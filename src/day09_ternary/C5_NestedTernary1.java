package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan diktörtgenin uzunluðunu ve geniþliðini alýn girilen deðerlere kare kare mi deðil mi 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("diktörgenin kenarý ve uzunluðunu gir");
		double a =scan.nextDouble();
		double b =scan.nextDouble();	
		
		//System.out.println( a==b ? "kare " : "kare deðil "); ama eksi deðerlerde sýkýntý
		
		System.out.println(a>0 && b>0 ? (a==b ? "kare " : "kare deðil "): "geçersiz kenar uzunluðu ");	
		scan.close();
	}

}
