package day13_stringmanupltion;

public class C7_Substring {

	public static void main(String[] args) {
		/*
		 * ilk on harfi 
		 * onla yirmi son on gibi zamanlarda yard�mc� olur 
		 */
		String str= "her ders java gibi olsa";
		 
		
		
		System.out.println(str.substring(10)); //10. indeks dahil(inclusive) sonuna kadar t�m string 
		System.out.println(str.substring(str.length()-10));	//son 10 harfi yazd�r�n 
		
		System.out.println(str.substring(0, 10)); //substrin(0.10) yaz�ld���nda
												  //0 inclusice dahil , 10 exclusive dahil de�il yani
	
		//11. karakterden sonuna kadar olan strringi yazd�r 
		
		System.out.println(str.substring(10)); 
		
		
		System.out.println("**********"+str.substring(10));	// str in ilk 10 harfini * ile gizleyin geriye kalanlar normal yaz�ls�n
			
		System.out.println(str.substring(10, 10));//"" yani output hi�bir �ey olur -10. indeksi al ikinci k�s�m ise 10. indeksi alma der jva da en son s�yleneni yapar
		
		
	//	System.out.println(str.substring(8, 7)); // hata verir 8den ba�lad�ktan sonra 7 ye gidemem diyor RTE verir 
		
		System.out.println(str.substring(22)); //-----> length -1 son karakter
		System.out.println(str.substring(23)); // length bo� verir
//		System.out.println(str.substring(24)); //lengthden b�y�k say� yazarsak rte verir
	
		
		
		
	}

}
