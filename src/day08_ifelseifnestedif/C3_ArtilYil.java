package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtilYil {

	public static void main(String[] args) {
		/*
		 * kullancdan yýl alýp artýk yýl olup olamdýðýna bak 
		 * 4 ile bölünemeyen yýllar artýk deðil 
		 * 4 ün katý olmasýna raðmen 100 ile böl  yýllardan SADECE 400 ün katý olan yýllar artýk yýldýr 
		 */
		
		Scanner scan = new Scanner (System.in );
 		 
		System.out.println("yýl gir ");
		
		int yil = scan.nextInt();
		
		if (yil%4==0 && yil %100 != 0) {
			System.out.println("artýk yýl ");
			
		} else if (yil %4==0 && yil %100 ==0 && yil %400==0) {//yil %4==0 && yazmamýza gerek yok aslýnda 100 ile bölünebilen zaten 4 ile de bölünür 
			
			System.out.println("artik yil ");
		}else {
			System.out.println("artýk yýl deðil");
		}
		
		scan.close();
		
	}

}
