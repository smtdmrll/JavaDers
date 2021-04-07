package day10_switchcase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		/*
		 * short byte int dan baþka primitive tip(boolean double float long ) kullanýlamaz switchte
		 * kullanýcýdan kýncý ayda olduðýný alýn ay ismini yazdýrý
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("kaçýncý ayda olduðunuzu girin");
		int ay = scan.nextInt();

		switch (ay) {
		case 1:
			System.out.println("ocak");
			break;
		case 2:
			System.out.println("þubat");
			break;
		case 3:
			System.out.println("mrt");
			break;
		case 4:
			System.out.println("nisan");
			break;
		case 5:
			System.out.println("mayýs");
			break;
		case 6:
			System.out.println("haziran");
			break;
		case 7:
			System.out.println("temmuz");
			break;
		case 8:
			System.out.println("aðustos");
			break;
		case 9:
			System.out.println("eylül");
			break;
		case 10:
			System.out.println("ekim");
			break;
		case 11:
			System.out.println("kasým");
			break;
		case 12:
			System.out.println("aralýk");
			break;
		default:
			System.out.println("öyle bir ay yok ");
			break;
		}
		scan.close();
	}

}
