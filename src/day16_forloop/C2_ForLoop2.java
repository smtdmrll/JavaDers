package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		/*
		 * kul dan iki  tam say� al�n 
		 * ilk say�dan, ikinci say�ya kadar t�m tam say�lar� yan yana aralar�nda bo�luk olarak yazd�r 
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("iki adet tam say� girini ");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();

	
		if (sayi1>sayi2) {
			for(int i=sayi1 ; i>=sayi2 ; i-- ) {
			System.out.print(i+" ");	
			}
		}else {
			for (int i = sayi1 ; i <= sayi2; i++) {
				System.out.print(i+" ");
				
			}
			
		}
		scan.close();
	}

}
