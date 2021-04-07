package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		/*
		 * kuldan 40 dan küçük pozitif bir sayý alýn girilen sayýnýn faktoriyelini
		 * hesaplayýp yazdýran bir method oluiturun
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("40 dan hüçük bir tam sayý giriniz ");
		int sayi = scan.nextInt();

		if (sayi < 40 && sayi > 0) {
			faktoriyel(sayi);
		} else {
			System.out.println("yanlýþ girdiniz");
		}

	}

	public static void faktoriyel(int sayi) {
		long carp =1 ;
		for (int i = 1; i <= sayi; i++) {
			carp*=i;
			
		}
		System.out.println(carp);
		
	}

}
