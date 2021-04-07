package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		/*
		 * kul say aal çiftse çif al 
		 * deðilse karesini yazdýr
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("lütfen bir tam sayý giriniz ");
		int sayi=scan.nextInt();
		
		//ternary de iki durum için farklý data tipi donusu oluyorsa 
		// ya varirable atama yapmadan direkt yazdýrýrýz 
		// ya da mümkünse sonuçlarý ayný data tipiniçevirme çalýþýrýz
		String sonuc= sayi%2==0 ? "çift sayi " : ""+ sayi*sayi;
		System.out.println(sonuc);
		System.out.println(sayi%2==0 ? "çift sayi " : sayi*sayi);
		
scan.close();
	}

}
