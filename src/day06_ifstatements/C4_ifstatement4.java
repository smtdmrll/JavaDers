package day06_ifstatements;

import java.util.Scanner;

public class C4_ifstatement4 {

	public static void main(String[] args) {
		/* kullan�c�dan g�n ismini isteyin
		 * girilen g�n� haftai�i veya haftasonu oldu�unu yazd�r�n 
		 * 
		 */
		 Scanner scan = new Scanner (System.in);
		 System.out.println("g�n ismi yaz");
		 
		 String gun= scan.next().toLowerCase();//gelen kelime nolursa olsun gelen kelimeyi k���k harfe �evirir
		
		 /* e�er stringlerde e�itlik sorguluyorsak  
		  * iki tane e�itlik kullanmamal�y�z
		  * stringlerde �it olma durumunu sorgulamak i�in EQUAL() metodu kullan�l�r �OK �NEML�
		  */
		 
		 if (gun.equals("cumartesi") || gun.equals("pazar")) {
			 System.out.println("yat�� g�nleri ");
			
			 /*e�er toUpperCase kullanm�� olsayd�k if ler i�inde hepsini b�y�k harf yazacakt�k
			  * 
			  */
			 
		} 
		 if (gun.equals("pazartesi") ||  gun.equals("sal�") || gun.equals("�ar�amba")||gun.equals("pe�embe")||gun.equals("cuma")) {
			System.out.println("�al��ma g�nleri ");
		}
	//bu kodda gun ismi yanl�s yaz�lm�ssa olu�acak durum yoktur 
		 scan.close();
	}
	

}
