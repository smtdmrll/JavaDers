package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		/*
		 * kullanıcıdan bir tam sayı isteyin 
		 * sayıpozitif ise "sayı pozitiftir"
		 * sayı 100 den küçük sayı yazdırı 
		 * 1000 den büyük sayı büyük sayı yazdır
		 */
			
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		
		int sayi=scan.nextInt();
		 
		if (sayi >0 && sayi >1000) {
			
			System.out.println("pozitif büyük sayı ");
			
		}
		if (sayi>0 && sayi<100 ) {
			System.out.println("pozitif küçük sayı ");
			
		}
		if (sayi<0) {
			System.out.println("sayı negatif ");
		}
		scan.close();
	}

}
