package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/*
		 * Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		 * kac tane olduklarini ekranda yazdirin
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("say� gir");
		int sayi=scan.nextInt(); // diyelim ki 100 girdi 
		
		int bolen=1;
		int sayac=0;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				sayac++;
				System.out.println(bolen );
			}
		bolen++;	
		}
		System.out.println(sayi +" say�s�n�n b�lenleri : "+ sayac + " adettir ");
		
		// b�lenleri �u �ekilde yazd�r�n :
		/*
		 * 1-1
		 * 2-2
		 * 3-4
		 * 4-5
		 * 5-10
		 */
		 bolen=1; // zaten var olan bir variable oldu�undan sadece de�er atad�m 
		 sayac=0;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				sayac++;
				System.out.println( sayac + " -" + bolen );
			}
		bolen++;	
		}
		System.out.println(sayi +" say�s�n�n b�lenleri : "+ sayac + " adettir ");
	}

}
