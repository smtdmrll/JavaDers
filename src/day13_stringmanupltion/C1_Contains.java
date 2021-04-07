package day13_stringmanupltion;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir c�mle ve aramak istedi�i bir string isteyin c�mle stringi
		 * i�eriyorsa ba�ar�l� de�ilse ba�ar�s�z yazd�r�n
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir c�mle giriniz");
		String cumle = scan.nextLine().toLowerCase();// c�mle oldu�u i�in nextline deriz

		System.out.println("l�tfen aramam� istedi�iniz stringi girin ");
		String aranan = scan.nextLine().toLowerCase();

		System.out.println(cumle.contains(aranan) ? "i�inde var" : "i�inde yok ");

		/*
		 * kullan�c�dan mail adresini isteyin mail adresi @gmail.com i�erirse mailiniz
		 * kaydedildi yoksa l�tfen gmail adresinizi giriniz
		 */

		System.out.println("l�tfen mail adresinizi giriniz ");
		String mail = scan.next().toLowerCase();

		int sondami = mail.indexOf("@gmail.com", mail.length() - 10);

		System.out.println(
				mail.contains("@gmail.com") && sondami != -1 ? "mailiniz kaydedildi" : "l�tfen gmaili d�zgn gir ");

		// e�er @gmail.com u en sonda oldu�unu kontrol etmek istersek

		// mail.indexOf("@gmail.com", mail.length()-10);//index olarak yani nerden sonra
		// kontrol etmek istedi�imizi length()-10 yazarsak sonunda @gmail.com var m�
		// diye bakm�� olu�uruz
		// e�er mail gmail com ile bitmiyorsa -1 verecek

		scan.close();

	}

}
