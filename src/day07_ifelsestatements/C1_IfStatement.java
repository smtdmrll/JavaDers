package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir tam say� isteyin 
		 * say�pozitif ise "say� pozitiftir"
		 * say� 100 den k���k say� yazd�r� 
		 * 1000 den b�y�k say� b�y�k say� yazd�r
		 */
			
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		
		int sayi=scan.nextInt();
		 
		if (sayi >0 && sayi >1000) {
			
			System.out.println("pozitif b�y�k say� ");
			
		}
		if (sayi>0 && sayi<100 ) {
			System.out.println("pozitif k���k say� ");
			
		}
		if (sayi<0) {
			System.out.println("say� negatif ");
		}
		scan.close();
	}

}
