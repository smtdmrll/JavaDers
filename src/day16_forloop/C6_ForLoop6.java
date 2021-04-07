package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		/*
		 * interview quest kul dan istenilen stringi ters yazd�r
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String str = scan.next();

		// 1. yol
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		// 2.yol cariable olu�turup en son yazd�rma
		String tersten = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			tersten += str.charAt(i);

		}
		System.out.println(tersten);

		// 3. yol method olu�turup bunu yazd�rabilirz

		tersineCevir(str);

		scan.close();
	}

	public static void tersineCevir(String str) {

		// ister bir ister ikinci y�ntemle yapabilirsin

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
