package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir say� al�n  ve say� 3 basamakl� poz ise �� basamakl� say� 
		 * de�ilse �� basamakl� de�il 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("l�tfen bir tam say� giriniz ");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>99 ?  (sayi<1000? "sayi �� basamakl� ": "say� �� basamakl� de�il ") : "say� �� basamakl� de�il ");

		//nested olmadan da �u �ekilde
		
		System.out.println(sayi>99 && sayi<1000 || sayi<-100 &&sayi>-1000 ?  "sayi �� basamakl� ": "say� �� basamakl� de�il ");
		
		
		
		
		
		
		
		scan.close();
	}

}
