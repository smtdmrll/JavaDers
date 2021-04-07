package day18_whileloop;

import java.util.Iterator;
import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
		 * baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		 * Kullanicinin hata yapmadigini farz edin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç harfini girin ");
		char basHarf = scan.next().toUpperCase().charAt(0);
		System.out.println("bit harf gir");
		char bitHarf = scan.next().toUpperCase().charAt(0);

		for (char i = basHarf; i <= bitHarf; i++) {
			System.out.print(i + " ");
		}

		// while loop ile yapýmý

		while (basHarf <= bitHarf) {
			System.out.print(basHarf + " ");
			basHarf++;
			
		}//bundan sonra basharf deðiþti 
		
		
	}

}
