package day21_scope;

public class Scope1 {

	static int okulId= 1687;
	static String okulAdi = "Mealis";
	static boolean acikMi ;
	
 /*
  * static variable lar class level da olu�turuldu�u i�in class�n her yerinden kullan�labilirler,
  * 
  * 	instance variabler lar static olmayan methodlarda direkt kullan�labiliyorken static methodlarda
  * obje olu�turularak kullab�labiliyordu 
  * 
  * static variable lar ise ister static isterse static olmayan t�m methodlardan direktt kullan�labilir 
  */
	
	
	public static void main(String[] args) {
		
		System.out.println(okulId+ " "+ okulAdi+ " "+ acikMi); //1687 mealis false 
		
		okulId= 1202;
		acikMi= true;
		
		staticMethod();
//		method(); // main static ama bu de�il o y�zden �a��ramam
		
		System.out.println(okulId+ " "+ okulAdi+ " "+ acikMi); //1203 Mealis true
	}

	public static void staticMethod() {
		
		System.out.println(okulId+ " "+ okulAdi+ " "+ acikMi); //1202 mealis true 
	
		okulId=1203;
		
		
	}
	
	public void method() {
		
		okulId=1205; // bu class �al��t�r�ld���nda bu method �al��maz 
		
	}
	
	
}
