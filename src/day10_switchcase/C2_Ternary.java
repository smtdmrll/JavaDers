package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		/*
		 * kul say aal �iftse �if al 
		 * de�ilse karesini yazd�r
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("l�tfen bir tam say� giriniz ");
		int sayi=scan.nextInt();
		
		//ternary de iki durum i�in farkl� data tipi donusu oluyorsa 
		// ya varirable atama yapmadan direkt yazd�r�r�z 
		// ya da m�mk�nse sonu�lar� ayn� data tipini�evirme �al���r�z
		String sonuc= sayi%2==0 ? "�ift sayi " : ""+ sayi*sayi;
		System.out.println(sonuc);
		System.out.println(sayi%2==0 ? "�ift sayi " : sayi*sayi);
		
scan.close();
	}

}
