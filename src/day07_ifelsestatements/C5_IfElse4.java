package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan ��genin kenar uzunkluklar�n� al�n �� kenar e�itse e� kenar
		 * yoksa  e� kenar de�il
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� gir ");
		int ken1 =scan.nextInt();
		int ken2=scan.nextInt();
		int ken3=scan.nextInt();
		
		if (ken1==ken2 && ken2==ken3 ) {
			System.out.println("e�kenar ��gen");
			
		}else {
			System.out.println("e�kenar de�il");
		}
		scan.close();
	}

}
