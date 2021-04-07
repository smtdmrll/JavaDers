package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		/*
		 * kuldan 40 dan k���k pozitif bir say� al�n girilen say�n�n faktoriyelini
		 * hesaplay�p yazd�ran bir method oluiturun
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("40 dan h���k bir tam say� giriniz ");
		int sayi = scan.nextInt();

		if (sayi < 40 && sayi > 0) {
			faktoriyel(sayi);
		} else {
			System.out.println("yanl�� girdiniz");
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
