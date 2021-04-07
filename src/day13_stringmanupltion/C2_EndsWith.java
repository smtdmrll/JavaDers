package day13_stringmanupltion;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		/*
		 * sonunda var mý methodu
		 */
		String str = "Javayla hayat ne guzel";
		System.out.println(str.endsWith("zel")); // true
		System.out.println(str.endsWith("zel ")); // false
		System.out.println(str.endsWith("ne guzel")); // true

		// kuldan mail iste eðer @ içermiyorsa email deðil bu desin
		// eðer @ içeriyor @gmail içermiyorsa lütfen gmailden baþka bir þey yazma
		// eðer ilk iki þartý saðlýyor ama @gmail.com ile bitmiyorsa geçersþiz gmail
		// adresi yazsýn

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir mail giriniz  ");

		String mail = scan.next();

		if (!mail.contains("@")) { // eðer baþýna ! olunca --> mail @içermiyorsa olur
			System.out.println("mail adresi girmedin");

		} else if (!mail.contains("@gmail.com")) {
			System.out.println("gmailden baþka bir þey yazma ");

		} else if (mail.endsWith("@gmail.com")) {
			System.out.println("giriþ baþarýlý ");
		} else {
			System.out.println("geçersiz gmail ");
		}
scan.close();
	}

}
