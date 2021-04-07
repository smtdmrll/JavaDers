package day03_scannerIncrementDecrement;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		//kullanýcýdan ismini isteyip ilk harfini Büyük Harf olarak yazdýrýn 
		// baþ harfiniz "" olarak yazdýrýn  
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("adýný gir : ");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);	//alýnan harfi büyük göstermek istiyorsan uppercase küçük almak istiyorsak lowercase
	
				//Stringde harfler indeks olarak 0 dan baþlar 
		// biz ilk harf istediðimiz için charArt ÝÇÝNE SIfýr yazdýk ikinci harf isteseydik 1 üç isteseydik 2
		
		System.out.println("baþ harfin: "+ ilkHarf);
		
		//eðer charArt(0) yazdýktansonra . koyarsak methodlar gelmez
		//çünkü charart metodu kullanýnca variable ý char yapmýþ olduk 
		// primitive data tipleri methodlara sahip deðildir.
		
		
		scan.close();
		
		
		
		
	}

}
