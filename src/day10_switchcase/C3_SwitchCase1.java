package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		/*
		 * kullanıcıdan bir rakam isteyin 
		 * girilen rakamıyazı ile yazdırın 
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
				System.out.println("üç");
			}else if (sayi==4) {
				System.out.println("dört");
			}else if (sayi==5) {
				System.out.println("beş");
			}else if (sayi==6) {
				System.out.println("altı");
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
		
		//soruyu switch le yapalım 
		
		switch(sayi) {
		case 0 :
			System.out.println("sıfır");
			break;
		case 1 :
			System.out.println("bir");
			break;
		case 2 :
			System.out.println("ikki");
			break;
		case 3 :
			System.out.println("üç ");
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
		default : //else gibi geriye kalan her şey için geçerli 
			System.out.println("rakam gir");
		}
		
		
	
		
		
		
		
		
		
		
scan.close();
		
	}

}
