package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*
		 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
		 * degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin
		 * toplamini yazdirin. Kullanici toplamak istedigi sayi adedini 4�den buyuk
		 * girerse �Cok sayi girdiniz, ben toplayamam� yazdirin. 2 den k���k girerse en
		 * az iki sayi gir de
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ka� adet sayi toplamam� istedi�inizi yaz�n ");
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
			System.out.println("�ok say� girdin emmooolu ");
		}

	}

	public static void dortSayiTopla() { // scanner mainde oldu�u i�in burda tekrar oluitur

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 4 say� giriniz ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();

		System.out.println("d�rt say�n�n toplam� " + (sayi1 + sayi2 + sayi3 + sayi4));
		scan.close();
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 4 say� giriniz ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();

		System.out.println("�� say�n�n toplam� " + (sayi1 + sayi2 + sayi3));
		scan.close();

	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 4 say� giriniz ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		System.out.println("iki say�n�n toplam� " + (sayi1 + sayi2));
		scan.close();

	}

}
