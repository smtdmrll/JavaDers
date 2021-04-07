package day13_stringmanupltion;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		/*
		 * sonunda var m� methodu
		 */
		String str = "Javayla hayat ne guzel";
		System.out.println(str.endsWith("zel")); // true
		System.out.println(str.endsWith("zel ")); // false
		System.out.println(str.endsWith("ne guzel")); // true

		// kuldan mail iste e�er @ i�ermiyorsa email de�il bu desin
		// e�er @ i�eriyor @gmail i�ermiyorsa l�tfen gmailden ba�ka bir �ey yazma
		// e�er ilk iki �art� sa�l�yor ama @gmail.com ile bitmiyorsa ge�ers�iz gmail
		// adresi yazs�n

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir mail giriniz  ");

		String mail = scan.next();

		if (!mail.contains("@")) { // e�er ba��na ! olunca --> mail @i�ermiyorsa olur
			System.out.println("mail adresi girmedin");

		} else if (!mail.contains("@gmail.com")) {
			System.out.println("gmailden ba�ka bir �ey yazma ");

		} else if (mail.endsWith("@gmail.com")) {
			System.out.println("giri� ba�ar�l� ");
		} else {
			System.out.println("ge�ersiz gmail ");
		}
scan.close();
	}

}
