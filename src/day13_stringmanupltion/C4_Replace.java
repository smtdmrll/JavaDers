package day13_stringmanupltion;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		/*
		 * replace verilen stringdeki istenilen karakterlerden yeni karakterle yer
		 * deðiþtirir word de ctrl+h gibidir
		 * 
		 * kul dan bir cümle iste cümledeki tüm boþluklarý silin ve tüm a larýn yerine e
		 * yazdýrýn
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cümle yaz");

		String str = scan.nextLine().toLowerCase();

		String str2 = str.replace(" ", "");
		System.out.println(str2.replace("a", "e"));

		System.out.println("bir cðmle daha ");
		String str3 = scan.nextLine().toLowerCase();

		System.out.println(str3.replace(" ", "").replace("a", "e"));
		scan.close();
	}

}
