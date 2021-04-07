package day06_ifstatements;

import java.util.Scanner;

public class C4_ifstatement4 {

	public static void main(String[] args) {
		/* kullanýcýdan gün ismini isteyin
		 * girilen günü haftaiçi veya haftasonu olduðunu yazdýrýn 
		 * 
		 */
		 Scanner scan = new Scanner (System.in);
		 System.out.println("gün ismi yaz");
		 
		 String gun= scan.next().toLowerCase();//gelen kelime nolursa olsun gelen kelimeyi küçük harfe çevirir
		
		 /* eðer stringlerde eþitlik sorguluyorsak  
		  * iki tane eþitlik kullanmamalýyýz
		  * stringlerde þit olma durumunu sorgulamak için EQUAL() metodu kullanýlýr ÇOK ÖNEMLÝ
		  */
		 
		 if (gun.equals("cumartesi") || gun.equals("pazar")) {
			 System.out.println("yatýþ günleri ");
			
			 /*eðer toUpperCase kullanmýþ olsaydýk if ler içinde hepsini büyük harf yazacaktýk
			  * 
			  */
			 
		} 
		 if (gun.equals("pazartesi") ||  gun.equals("salý") || gun.equals("çarþamba")||gun.equals("peþembe")||gun.equals("cuma")) {
			System.out.println("çalýþma günleri ");
		}
	//bu kodda gun ismi yanlýs yazýlmýssa oluþacak durum yoktur 
		 scan.close();
	}
	

}
