package day16_forloop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/*
		 * kul dan pozitif iki tam say� al�n 
		 * ald���n�z de�erlerden k���k olandan ba�lay�p b�y�k olana kadar 
		 * t�m say�lar� yan yana (virg�lle ayr�larak) yazd�r�n 
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("iki adet pozitif say� girin ");
		int sayi1= scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucukSayi=0;
		int buyukSayi=0;
		
		
		if (sayi1>sayi2) {
			buyukSayi=sayi1;
			kucukSayi=sayi2;
			
		}else {
			buyukSayi=sayi2;
			kucukSayi=sayi1;
		}
		for (int i = kucukSayi ; i<=buyukSayi ; i++) {
			System.out.print(i+",");
			
		}
	}

}
