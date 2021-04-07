package day20_scope;

import java.util.Scanner;

public class Scope1 {

public	int sayi; // class�n �inde fakat main in d���nda olu�turulan 						// int i�in def de�er =0
		     // ve static olmayan variable lara INSTANCE(Objeckt) variable denir.
			// class levelda olu�turuldu�u i�in class �n her yerinden belli �ARTLARLA kullan�labilir
       	   // instance variable lar object e ba�l� olarak �al���r(��retmen ad� veya ��renci notu gibi)
	
	public String isim="mehmet";		
	public String soyisim;		// str i�in default de�er null
	boolean izindeMi;// boolean i�in default de�er false dur 
	char ilkIsim; 	// space=default de�eri
	public static void main(String[] args) {
		
		
//		System.out.println(sayi); // static olmayan bir variable la static method i�inden ula�amay�z
							      // main method umuz static oldu�u i�in main method i�erisinden 
//		method();				  // static olmayan variable vyea method lara direkt ula�amay�z 
		
			// instance bir variable a main method i�erisinden ula�mak istedi�imizde
			// OBJECT olu�turmal�y�z  *buras� �nemli*
			
			Scanner 		scan= 			new 					Scanner 	(System.in); // bu javadaki standart obje olu�turma formudur 
		// class ismi	|	obje ismi  | obje olu�turmada keyword |clas ismi | parametre
			
			
			Scope1 obj1 =new Scope1 ();			
			System.out.println(obj1.sayi); // buna de�er atamad�k java default de�er verdi =0
			// instance variable lar olu�turuldu�unda biz istersek de�er atayabiliriz 
			System.out.println(obj1.isim);
			// instance variable lara e�er biz de�er atamazsak java default de�er atar
			System.out.println(obj1.soyisim); // buna de�er atamad�k java default de�er verdi= null
			
			Scope1 obj2=new Scope1();
			obj2.isim="m�sl�m";
			obj2.soyisim="babaaa";
			
			System.out.println(obj2.isim+" "+obj2.soyisim); //m�sl�m baba
			System.out.println(obj1.isim+" "+obj1.soyisim); //
			
			System.out.println(obj2.izindeMi); // false d�nd�r�r
			System.out.println(obj2.ilkIsim); // spcae 
			
			Scope1 obj3 =new Scope1();
			obj3.isim="ferdi";
			obj3.soyisim="tayfur";
			obj3.izindeMi=true;
			System.out.println(obj3.isim+" " + obj3.soyisim+" "+ obj3.izindeMi); // ferdi tayfur true 
			
scan.close();			
	}

	public static void staticMethod() {
	
	}
	
	public void method() {
		System.out.println(sayi); // bu method static olmad��� i�in instance variablelara direkt eri�ebilir
		sayi=sayi+20; // ve bu method i�eirsinde ge�erli olmak �zere de�erini de�i�tirebilir 
	}
}
