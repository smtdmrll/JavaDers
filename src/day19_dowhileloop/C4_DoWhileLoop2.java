package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a
		 * basmasini soyleyin. Kullanici yanlislikla negative sayi girerse o sayiyi
		 * dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun Kullanici
		 * 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative
		 * sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		 */
		Scanner scan =new Scanner(System.in);
		int countPoz=0;
		int countNeg=0;
		int topPoz=0;
		int sayi=1;
		
		System.out.println("oyuna hoþgeldin amk ve bitirmek için sýfýr a bas\n");	
		
		do {

			System.out.println("pozitif sayýlar girin ");
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
		
		System.out.println("toplam "+ countPoz+ " adet pozitif sayý girdiniz");
		System.out.println("toplam "+ countNeg+ " adet negatif sayý girdiniz");
		System.out.println("girdiðiniz poz sayýlarýn toplamý "+ topPoz);

		
	}

}
