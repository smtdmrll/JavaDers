package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		/*
		 * kullancdan yýl alýp artýk yýl olup olamdýðýna bak 
		 * 4 ile bölünemeyen yýllar artýk deðil 
		 * 4 ün katý olmasýna raðmen 100 ile böl  yýllardan SADECE 400 ün katý olan yýllar artýk yýldýr 
		 */
		
		Scanner scan = new Scanner (System.in );
 		 
		System.out.println("yýl gir ");
		
		int yil = scan.nextInt();
		
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("artik yil");
			}else {
				System.out.println("artýk yil deðil ");
			}
			
		}else {
			if (yil%4==0) {
				System.out.println("artýk yýl ");
			}else {
				System.out.println("artýk yýl deðil");
			}
		}
		scan.close();
	}

}
