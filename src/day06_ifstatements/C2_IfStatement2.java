package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//kullan�cadan bir say� isteyin ve say�n�n tek veya �ift say� oldu�unu yazd�r�n 
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen bir say� giriniz ");
		int sayi = scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("sayi �ift");
			
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("sayi tek ");
			
		}
		System.out.println(sayi%2);
		System.out.println("iyi ki kat�ld�n");
		
		scan.close();
	}
}
