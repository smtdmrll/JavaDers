package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		/*
		 * kul dan hangi günde olduðunu yazý olarak iste 
		 * haftaiçi mi haftsonu mu yazýr 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("hangi günde olduðunuzu girin");
		String gun = scan.next().toLowerCase();//pAzaR girse bile pazar a çevirir
		
		switch (gun) { // break komutu durdurma olduðu için breakleri ve syso larý silersek sadece bir kere haiçi yazmamýz yeterli 
		
		case "pazartesi":		
		case"sali":			
		case "carsamba":
		case"persembe":	
		case"cuma":
			System.out.println("haftaiçi ");
			break;
		case"cumartesi":			
		case"pazar":
			System.out.println("hasonu");
			break;
		default:
			System.out.println("öyle bir gün yok");
			break;
		}
		scan.close();
		
	}

}
