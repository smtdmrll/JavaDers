package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0�a
		 * basmasini soyleyin. Kullanici yanlislikla negative sayi girerse o sayiyi
		 * dikkate almayin ve �Negatif sayi giremezsiniz� yazdirip basa donun Kullanici
		 * 0�a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative
		 * sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		 */
		Scanner scan =new Scanner(System.in);
		int countPoz=0;
		int countNeg=0;
		int topPoz=0;
		int sayi=1;
		
		System.out.println("oyuna ho�geldin amk ve bitirmek i�in s�f�r a bas\n");	
		
		do {

			System.out.println("pozitif say�lar girin ");
			sayi=scan.nextInt();	
			if (sayi>0) {
				countPoz++;
				topPoz+=sayi;
			} 
			if (sayi<0) {
				countNeg++;
				System.out.println("Negatif sayi giremezsiniz");
			}
		} while (sayi!=0);
		
		System.out.println("toplam "+ countPoz+ " adet pozitif say� girdiniz");
		System.out.println("toplam "+ countNeg+ " adet negatif say� girdiniz");
		System.out.println("girdi�iniz poz say�lar�n toplam� "+ topPoz);

		
	}

}
