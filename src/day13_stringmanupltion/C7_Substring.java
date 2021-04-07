package day13_stringmanupltion;

public class C7_Substring {

	public static void main(String[] args) {
		/*
		 * ilk on harfi 
		 * onla yirmi son on gibi zamanlarda yardýmcý olur 
		 */
		String str= "her ders java gibi olsa";
		 
		
		
		System.out.println(str.substring(10)); //10. indeks dahil(inclusive) sonuna kadar tüm string 
		System.out.println(str.substring(str.length()-10));	//son 10 harfi yazdýrýn 
		
		System.out.println(str.substring(0, 10)); //substrin(0.10) yazýldýðýnda
												  //0 inclusice dahil , 10 exclusive dahil deðil yani
	
		//11. karakterden sonuna kadar olan strringi yazdýr 
		
		System.out.println(str.substring(10)); 
		
		
		System.out.println("**********"+str.substring(10));	// str in ilk 10 harfini * ile gizleyin geriye kalanlar normal yazýlsýn
			
		System.out.println(str.substring(10, 10));//"" yani output hiçbir þey olur -10. indeksi al ikinci kýsým ise 10. indeksi alma der jva da en son söyleneni yapar
		
		
	//	System.out.println(str.substring(8, 7)); // hata verir 8den baþladýktan sonra 7 ye gidemem diyor RTE verir 
		
		System.out.println(str.substring(22)); //-----> length -1 son karakter
		System.out.println(str.substring(23)); // length boþ verir
//		System.out.println(str.substring(24)); //lengthden büyük sayý yazarsak rte verir
	
		
		
		
	}

}
