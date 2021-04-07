package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
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
		System.out.println("l�tfen bir tam say� giriniz");
		int sayi = scan.nextInt();
		System.out.println("l�tfen sinir deger i�in bir tam say� giriniz");
		int sinir  = scan.nextInt();

		if (sayi <= 0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		} else {
//			rakamlarTopHesapla(sayi);// girilen say�n�n rakamlar top int return type da int olacak void de�il 
			/*
			 * 1) direkt yazd�rabilirim syso rakamlarToplamihesapla
			 * 2) k�yas yapabilirim
			 * 3) de�i�kene assign edebilirim  
			 */
			
			if (rakamlarTopHesapla(sayi)>sinir) {
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
			} else {
				System.out.println( "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
			}
		}
	}

	public static int rakamlarTopHesapla(int sayi) { //yazd�rmak i�in void rakamlar top say� olarak kullanmak i�in int
		
		int rakamlarTop=0;
		String sayi2=sayi+""; // string method kullanabilmek i�in sayiyi string le toplad�k int.length yok diye 
		
		for (int i = 1; i < sayi2.length() ; i++) {
			rakamlarTop+= sayi%10;
					sayi/=10;
			
		}
		
		return rakamlarTop;  //yazd�rmak i�inde d�nd�rmek istedi�imiz i�in bunu yazmak zorunday�z 
		
	}

	

}
