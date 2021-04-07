package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		/*
		 * interview quest kul dan istenilen stringi ters yazdýr
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String str = scan.next();

		// 1. yol
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		// 2.yol cariable oluþturup en son yazdýrma
		String tersten = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			tersten += str.charAt(i);

		}
		System.out.println(tersten);

		// 3. yol method oluþturup bunu yazdýrabilirz

		tersineCevir(str);

		scan.close();
	}

	public static void tersineCevir(String str) {

		// ister bir ister ikinci yöntemle yapabilirsin

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
