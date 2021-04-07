package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi girmesini isteyin sayi negatif veya sifirsa
		 * "Lutfen pozitif bir tamsayi giriniz" yazdirin Girilen Sayinin rakamlar
		 * toplamini ayri bir method'da hesaplayin
		 * 
		 * Main method icinde Kullanicidan bir sinir deger isteyin rakamlar toplami
		 * sinir degerden buyukse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 * degilse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int sayi = scan.nextInt();

		if (sayi <= 0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		} else {
			rakamlarTopYazdir(sayi);
		}

	}

	public static void rakamlarTopYazdir(int sayi) {
		int rakamlarTop=0;
		String sayi2=sayi+""; // string method kullanabilmek için sayiyi string le topladýk int.length yok diye 
		
		for (int i = 1; i < sayi2.length() ; i++) {
			rakamlarTop+= sayi%10;
					sayi/=10;
			
		}
		System.out.println("rakamlar toplamý: "+ rakamlarTop);
	}

}
