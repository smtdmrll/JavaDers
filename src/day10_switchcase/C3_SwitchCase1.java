package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir rakam isteyin 
		 * girilen rakam�yaz� ile yazd�r�n 
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("bir rakam giriniz ");
		int sayi=scan.nextInt();
		
		if (sayi>=0 && sayi<=9 ) {
			if (sayi==1) {
				System.out.println("bir");
			}else if (sayi==2) {
				System.out.println("iki");
			}else if (sayi==3) {
				System.out.println("��");
			}else if (sayi==4) {
				System.out.println("d�rt");
			}else if (sayi==5) {
				System.out.println("be�");
			}else if (sayi==6) {
				System.out.println("alt�");
			}else if (sayi==7) {
				System.out.println("yedi");
			}else if (sayi==8) {
				System.out.println("sekiz");
			}else  {
				System.out.println("dokuz");
			}
		}else {
			System.out.println("rakam gir");
		}
		
		//soruyu switch le yapal�m 
		
		switch(sayi) {
		case 0 :
			System.out.println("s�f�r");
			break;
		case 1 :
			System.out.println("bir");
			break;
		case 2 :
			System.out.println("ikki");
			break;
		case 3 :
			System.out.println("�� ");
			break;
		case 4 :
			System.out.println("dr");
			break;
		case 5 :
			System.out.println("be");
			break;
		case 6 :
			System.out.println("alt");
			break;
		case 7 :
			System.out.println("yed");
			//break;
		case 8 :
			System.out.println("sek");
			//break;
		case 9 :
			System.out.println("dokuz");
			//break;
		default : //else gibi geriye kalan her �ey i�in ge�erli 
			System.out.println("rakam gir");
		}
		
		
	
		
		
		
		
		
		
		
scan.close();
		
	}

}
