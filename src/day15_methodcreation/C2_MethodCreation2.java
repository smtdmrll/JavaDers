package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*
		 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
		 * degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin
		 * toplamini yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk
		 * girerse “Cok sayi girdiniz, ben toplayamam” yazdirin. 2 den küçük girerse en
		 * az iki sayi gir de
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("kaç adet sayi toplamamý istediðinizi yazýn ");
		int adet = scan.nextInt();

		if (adet < 2) {
			System.out.println("en az iki sayi gir");
		} else if (adet == 2) {

			ikiSayiTopla();
		} else if (adet == 3) {
			ucSayiTopla();
		} else if (adet == 4) {
			dortSayiTopla();
		} else {
			System.out.println("çok sayý girdin emmooolu ");
		}

	}

	public static void dortSayiTopla() { // scanner mainde olduðu için burda tekrar oluitur

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 4 sayý giriniz ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();

		System.out.println("dört sayýnýn toplamý " + (sayi1 + sayi2 + sayi3 + sayi4));
		scan.close();
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 4 sayý giriniz ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();

		System.out.println("üç sayýnýn toplamý " + (sayi1 + sayi2 + sayi3));
		scan.close();

	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 4 sayý giriniz ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		System.out.println("iki sayýnýn toplamý " + (sayi1 + sayi2));
		scan.close();

	}

}
