package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		/*
		 * kullanýcýya maaþ için yýllýk teklif isteyin 
		 * 80 binin üstünde olursa kabul 
		 * 60-80 arasý olursa konuþabiliriz 
		 * 60 altý olursa kabul etmem 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("yýllýk maaþýn   ");
		int maas= scan.nextInt();
		
		if (maas>=80000) {
			System.out.println("kabul ediyorum ");
			
		}else if (maas>60000 ) {
			System.out.println("düþünebilirim");
		}else {
			System.out.println("ben sana vereyim de sen bana çalýþ");
		}
				
		scan.close();
	}

}
