package day03_scannerIncrementDecrement;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		String kufur="aha þimdi siktim belani ";
		
		
		// scanner kullanýcýdan bilgi almak için kullanýrýz(tekrar)
		//scanner ýn çalýþmasý için java.util kütüphanesinden ilgili kýsmý cllasýmýza import etmeliyiz 
		//
		Scanner scan= new Scanner (System.in);
		
		//kullanýcýya mesaj belirt
		
		System.out.println("ne bakýyon dayý dayý bir þeyler gir ");
		// variable oluþturup kullanýcýn girdii deðeri atayacaðýz 
		
		String isim= scan.nextLine();
		
		System.out.println("soyadýn ne lan ");
		
		//String soyisim= scan.next() bu þekilde yazarsak sadece ilk kelimeyi alýr ikinci almaz 
		
		 String soyisim=scan.nextLine();
		 
		 // eðer yazdýracaðýmýz yazý sabit ise çift týrnak arasýnda yazdýrýrýz 
		 // eðer bir variable atanmýþ deðeri yazdýrmak istersek çift týrnak olmadan sadece variable isminiü
		 // yazýyoruz 
		 
		 System.out.println("adýn : "+ isim );
		 System.out.println("soyadýn: "+ soyisim);
		 System.out.println(kufur);
		 
		 
		 scan.close();
	}

}
