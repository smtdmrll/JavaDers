package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		/*
		 * kul dan iki  tam sayý alýn 
		 * ilk sayýdan, ikinci sayýya kadar tüm tam sayýlarý yan yana aralarýnda boþluk olarak yazdýr 
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("iki adet tam sayý girini ");
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
