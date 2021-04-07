package day10_switchcase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		/*
		 * short byte int dan ba�ka primitive tip(boolean double float long ) kullan�lamaz switchte
		 * kullan�c�dan k�nc� ayda oldu��n� al�n ay ismini yazd�r�
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ka��nc� ayda oldu�unuzu girin");
		int ay = scan.nextInt();

		switch (ay) {
		case 1:
			System.out.println("ocak");
			break;
		case 2:
			System.out.println("�ubat");
			break;
		case 3:
			System.out.println("mrt");
			break;
		case 4:
			System.out.println("nisan");
			break;
		case 5:
			System.out.println("may�s");
			break;
		case 6:
			System.out.println("haziran");
			break;
		case 7:
			System.out.println("temmuz");
			break;
		case 8:
			System.out.println("a�ustos");
			break;
		case 9:
			System.out.println("eyl�l");
			break;
		case 10:
			System.out.println("ekim");
			break;
		case 11:
			System.out.println("kas�m");
			break;
		case 12:
			System.out.println("aral�k");
			break;
		default:
			System.out.println("�yle bir ay yok ");
			break;
		}
		scan.close();
	}

}
