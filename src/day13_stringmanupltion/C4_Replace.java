package day13_stringmanupltion;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		/*
		 * replace verilen stringdeki istenilen karakterlerden yeni karakterle yer
		 * de�i�tirir word de ctrl+h gibidir
		 * 
		 * kul dan bir c�mle iste c�mledeki t�m bo�luklar� silin ve t�m a lar�n yerine e
		 * yazd�r�n
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir c�mle yaz");

		String str = scan.nextLine().toLowerCase();

		String str2 = str.replace(" ", "");
		System.out.println(str2.replace("a", "e"));

		System.out.println("bir c�mle daha ");
		String str3 = scan.nextLine().toLowerCase();

		System.out.println(str3.replace(" ", "").replace("a", "e"));
		scan.close();
	}

}
