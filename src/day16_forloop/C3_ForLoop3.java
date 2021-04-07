package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		/*
		 * kuldan pozitif bir sayi alýn 
		 * 1 den kullanýcýnýn girdiði sayýya kadar olan tüm tam sayýlarýnýn toplamýný yazdýrýn 
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("pozitif tam sayý giriniz ");
		int sayi= scan.nextInt();
		
		int sayiTop=0;
		
		if (sayi>0) {
			for (int i = 1; i <= sayi ; i++) {
				sayiTop+= i; //top+= sayi yaparsan girilen sayýyý döndürür direkt o yüzden i üzerinden döndürürüz
				
				
			}
		} else {
			System.out.println("yanlýþ giriþ yaptýnýz");
		}
		System.out.println(sayiTop);

	}

}
