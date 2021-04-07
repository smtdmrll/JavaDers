package day13_stringmanupltion;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan bir cümle ve aramak istediði bir string isteyin cümle stringi
		 * içeriyorsa baþarýlý deðilse baþarýsýz yazdýrýn
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cumle = scan.nextLine().toLowerCase();// cümle olduðu için nextline deriz

		System.out.println("lütfen aramamý istediðiniz stringi girin ");
		String aranan = scan.nextLine().toLowerCase();

		System.out.println(cumle.contains(aranan) ? "içinde var" : "içinde yok ");

		/*
		 * kullanýcýdan mail adresini isteyin mail adresi @gmail.com içerirse mailiniz
		 * kaydedildi yoksa lütfen gmail adresinizi giriniz
		 */

		System.out.println("lütfen mail adresinizi giriniz ");
		String mail = scan.next().toLowerCase();

		int sondami = mail.indexOf("@gmail.com", mail.length() - 10);

		System.out.println(
				mail.contains("@gmail.com") && sondami != -1 ? "mailiniz kaydedildi" : "lütfen gmaili düzgn gir ");

		// eðer @gmail.com u en sonda olduðunu kontrol etmek istersek

		// mail.indexOf("@gmail.com", mail.length()-10);//index olarak yani nerden sonra
		// kontrol etmek istediðimizi length()-10 yazarsak sonunda @gmail.com var mý
		// diye bakmýþ oluþuruz
		// eðer mail gmail com ile bitmiyorsa -1 verecek

		scan.close();

	}

}
