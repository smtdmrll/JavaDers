package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 Soru 1 ) Kullanicidan bir tam sayi alin.
		 Bu sayinin negatif veya pozitif oldugunu,
		 tek mi cift mi oldugunu ve
		 100 ve  buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 100 den  kucukse sadece 1’ler basamagini yazdirin.
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("lütfen bir tam sayý giriniz ");
		int sayi=scan.nextInt();
		
		pozitifNegatif(sayi); // girilen sayi argümentinin pozitif ya da negatif olduðunu yazdýrsýn // bu method kol method mainin dýþýnda
		tekMiCiftMi(sayi); // bu method koluna sayi argümentini göndermeliyiz
	
		if (sayi>=100) { // if else i methodun içinde de kullanabilirden tek methodda ama biz eþeklik edip iki method yapmak için böyle yaptýk
			
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
		rakamlarToplami+=sayi%10;// kullanýcý dört beþ altý basamaklý da girebilir diye modulus 10 
		
		System.out.println(rakamlarToplami);
	}
	public static void tekMiCiftMi(int sayi) { // hangi methofun yukarýda aþaðýda olduðu önemli deðil 
		//yukarýdan aþaðý geleceði için önce maine bakacak 
		
		//	System.out.println(sayi%2==0 ? "çift": "tek");
			
			if (sayi%2==0 ) { // hem ternary hhem ifle çözümü 
				System.out.println("çift");
			} else {
				System.out.println("tek");
			}
			
		}
	

	public static void pozitifNegatif(int sayi ) { // parametre yazarken datatipini deyazmalýyýz 
		
		System.out.println(sayi>0 ? "pozitif " : (sayi<0? "negatif": "nötr "));
		
	}
	
	
	
	
}
