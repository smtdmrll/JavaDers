package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		/*
		 * kul dan bir karakter girmesini isteyin 
		 * harf olup olmad���n� yazd�r�n
		 * t�k�e karakterleri harf olarak kabul etmez tek tek eklemen gerekir 
		 * asc�� de�erlerine bak anlars�n babo� 
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("karakter gir ");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if (ch >='a'  && ch<='z') {
			System.out.println("girdi�iniz karakter harf");
			
		} else {
			System.out.println("harf de�il");
		}
		scan.close();
		
	}

}
