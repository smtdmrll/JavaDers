package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		/*
		 * kul dan hangi g�nde oldu�unu yaz� olarak iste 
		 * haftai�i mi haftsonu mu yaz�r 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("hangi g�nde oldu�unuzu girin");
		String gun = scan.next().toLowerCase();//pAzaR girse bile pazar a �evirir
		
		switch (gun) { // break komutu durdurma oldu�u i�in breakleri ve syso lar� silersek sadece bir kere hai�i yazmam�z yeterli 
		
		case "pazartesi":		
		case"sali":			
		case "carsamba":
		case"persembe":	
		case"cuma":
			System.out.println("haftai�i ");
			break;
		case"cumartesi":			
		case"pazar":
			System.out.println("hasonu");
			break;
		default:
			System.out.println("�yle bir g�n yok");
			break;
		}
		scan.close();
		
	}

}
