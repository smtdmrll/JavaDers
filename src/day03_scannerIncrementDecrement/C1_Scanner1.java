package day03_scannerIncrementDecrement;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		String kufur="aha �imdi siktim belani ";
		
		
		// scanner kullan�c�dan bilgi almak i�in kullan�r�z(tekrar)
		//scanner �n �al��mas� i�in java.util k�t�phanesinden ilgili k�sm� cllas�m�za import etmeliyiz 
		//
		Scanner scan= new Scanner (System.in);
		
		//kullan�c�ya mesaj belirt
		
		System.out.println("ne bak�yon day� day� bir �eyler gir ");
		// variable olu�turup kullan�c�n girdii de�eri atayaca��z 
		
		String isim= scan.nextLine();
		
		System.out.println("soyad�n ne lan ");
		
		//String soyisim= scan.next() bu �ekilde yazarsak sadece ilk kelimeyi al�r ikinci almaz 
		
		 String soyisim=scan.nextLine();
		 
		 // e�er yazd�raca��m�z yaz� sabit ise �ift t�rnak aras�nda yazd�r�r�z 
		 // e�er bir variable atanm�� de�eri yazd�rmak istersek �ift t�rnak olmadan sadece variable ismini�
		 // yaz�yoruz 
		 
		 System.out.println("ad�n : "+ isim );
		 System.out.println("soyad�n: "+ soyisim);
		 System.out.println(kufur);
		 
		 
		 scan.close();
	}

}
