package day13_stringmanupltion;

import java.util.Scanner;

public class C9_Example {

	public static void main(String[] args) {
		/*
		 * dört harfli bir kelime giriniz girilen kelimeyi tersten yaz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("4 haneli bir kelime giriniz");
		String str = scan.nextLine();

		if (str.length() != 4) {
			System.out.println("4 haneli gir dedim lan sana ");
			
		} else {
			System.out.print(str.substring(3));
			System.out.print(str.charAt(2));
			System.out.print(str.charAt(1));
			System.out.print(str.charAt(0));
			
		}
scan.close();
	}

}
