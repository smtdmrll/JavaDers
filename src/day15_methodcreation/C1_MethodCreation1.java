package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 Soru 1 ) Kullanicidan bir tam sayi alin.
		 Bu sayinin negatif veya pozitif oldugunu,
		 tek mi cift mi oldugunu ve
		 100 ve  buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 100 den  kucukse sadece 1�ler basamagini yazdirin.
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("l�tfen bir tam say� giriniz ");
		int sayi=scan.nextInt();
		
		pozitifNegatif(sayi); // girilen sayi arg�mentinin pozitif ya da negatif oldu�unu yazd�rs�n // bu method kol method mainin d���nda
		tekMiCiftMi(sayi); // bu method koluna sayi arg�mentini g�ndermeliyiz
	
		if (sayi>=100) { // if else i methodun i�inde de kullanabilirden tek methodda ama biz e�eklik edip iki method yapmak i�in b�yle yapt�k
			
			yuzdenBuyuk(sayi);
			
		} else {
			
			yuzdenKucuk(sayi);
		}
	
	}
	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi%10);
		
	}
	public static void yuzdenBuyuk(int sayi) {
		int rakamlarToplami;
		
		rakamlarToplami= sayi%10;
		sayi/=10;
		rakamlarToplami+=sayi%10;	
		sayi/=10;
		rakamlarToplami+=sayi%10;// kullan�c� d�rt be� alt� basamakl� da girebilir diye modulus 10 
		
		System.out.println(rakamlarToplami);
	}
	public static void tekMiCiftMi(int sayi) { // hangi methofun yukar�da a�a��da oldu�u �nemli de�il 
		//yukar�dan a�a�� gelece�i i�in �nce maine bakacak 
		
		//	System.out.println(sayi%2==0 ? "�ift": "tek");
			
			if (sayi%2==0 ) { // hem ternary hhem ifle ��z�m� 
				System.out.println("�ift");
			} else {
				System.out.println("tek");
			}
			
		}
	

	public static void pozitifNegatif(int sayi ) { // parametre yazarken datatipini deyazmal�y�z 
		
		System.out.println(sayi>0 ? "pozitif " : (sayi<0? "negatif": "n�tr "));
		
	}
	
	
	
	
}
