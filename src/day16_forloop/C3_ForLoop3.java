package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		/*
		 * kuldan pozitif bir sayi al�n 
		 * 1 den kullan�c�n�n girdi�i say�ya kadar olan t�m tam say�lar�n�n toplam�n� yazd�r�n 
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("pozitif tam say� giriniz ");
		int sayi= scan.nextInt();
		
		int sayiTop=0;
		
		if (sayi>0) {
			for (int i = 1; i <= sayi ; i++) {
				sayiTop+= i; //top+= sayi yaparsan girilen say�y� d�nd�r�r direkt o y�zden i �zerinden d�nd�r�r�z
				
				
			}
		} else {
			System.out.println("yanl�� giri� yapt�n�z");
		}
		System.out.println(sayiTop);

	}

}
