package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		/*
		 * kul dan bir karakter girmesini isteyin 
		 * harf olup olmadýðýný yazdýrýn
		 * tükçe karakterleri harf olarak kabul etmez tek tek eklemen gerekir 
		 * ascýý deðerlerine bak anlarsýn baboþ 
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("karakter gir ");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if (ch >='a'  && ch<='z') {
			System.out.println("girdiðiniz karakter harf");
			
		} else {
			System.out.println("harf deðil");
		}
		scan.close();
		
	}

}
