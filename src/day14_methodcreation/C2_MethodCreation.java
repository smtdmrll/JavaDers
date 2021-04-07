package day14_methodcreation;

public class C2_MethodCreation {

	public static void main(String[] args) {
		/*
		 1) �nemli nokta main methodda static oldu�u i�in �a��rd���m�z t�m methodlar
		  static olmak zorunda
		  
		 2) int return type p veya n-p hepsi olabilir e�er bir method bir �ey
		  d�nd�rmeyecekse �rnek hesaplay� yazd�racaksa return type VO�D se�ilir
		  
		  
		  3)bir classda ayn� isme sahip birden fazla method olu�turabiliriz fakat
		  parametreleri farkl� yapmak zorunday�z
		 */
		
		/*
		 * public 
		 * acces modifier
		 * 
		 * static 
		 * �imdilik main methodun static oldu�unu vedi�er methodlar�n main methoddan kullan�lmas� i�in 
		 * static olmas� gwrekti�ini bil yeter
		 * 
		 * void
		 * return type d�nd�rd��� method yok yani 
		 * 
		 * main
		 * isim
		 * 
		 * (String[] args) 
		 * bunun i�indekilere parametre denir bu parametrenin data tip String ismi args
		 * 
		 * {
		 * bu da body 
		 */
		
		
		//bir methodu �al��t�rmak i�in main methodun i�inden �a��rmam�z gerekir 
		//bir methodu �a��rmak i�in ise method ad�n� ve parametrelere uygun arg�mentleri  yazmaly�z 
		
		ortalama(85.2, 90.3);  // method call denir
		// java ad� ortalama olan iki tane prametre olan ve bu parametreleri double method arayacak ve bulacak 
		
	}// main method sonu

	
	//bir main method olu�turmak istedi�imizde class�n i�inde ama main methodun d���nda bir alanda olu�turmal�y�z
	//Genel kullan�m methodlar main methoddan sonra olur
	
	
	public static void ortalama (double sayi1, double sayi2) {
		
		System.out.println("girdi�iniz iki say�n�n ortalamas� "+ (sayi1+sayi2)/2);
		// bir methodu olu�turmak o methodu �al��t�rmak i�in yeterli de�ildir 
		// olu�turuan method main method i�inden �a��r�l�nca �al���r 
		
	}
	
	
	
	
	
	
	

}//class sonu 
