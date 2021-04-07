package day20_scope;

import java.util.Scanner;

public class Scope1 {

public	int sayi; // classýn çinde fakat main in dýþýnda oluþturulan 						// int için def deðer =0
		     // ve static olmayan variable lara INSTANCE(Objeckt) variable denir.
			// class levelda oluþturulduðu için class ýn her yerinden belli ÞARTLARLA kullanýlabilir
       	   // instance variable lar object e baðlý olarak çalýþýr(öðretmen adý veya öðrenci notu gibi)
	
	public String isim="mehmet";		
	public String soyisim;		// str için default deðer null
	boolean izindeMi;// boolean için default deðer false dur 
	char ilkIsim; 	// space=default deðeri
	public static void main(String[] args) {
		
		
//		System.out.println(sayi); // static olmayan bir variable la static method içinden ulaþamayýz
							      // main method umuz static olduðu için main method içerisinden 
//		method();				  // static olmayan variable vyea method lara direkt ulaþamayýz 
		
			// instance bir variable a main method içerisinden ulaþmak istediðimizde
			// OBJECT oluþturmalýyýz  *burasý önemli*
			
			Scanner 		scan= 			new 					Scanner 	(System.in); // bu javadaki standart obje oluþturma formudur 
		// class ismi	|	obje ismi  | obje oluþturmada keyword |clas ismi | parametre
			
			
			Scope1 obj1 =new Scope1 ();			
			System.out.println(obj1.sayi); // buna deðer atamadýk java default deðer verdi =0
			// instance variable lar oluþturulduðunda biz istersek deðer atayabiliriz 
			System.out.println(obj1.isim);
			// instance variable lara eðer biz deðer atamazsak java default deðer atar
			System.out.println(obj1.soyisim); // buna deðer atamadýk java default deðer verdi= null
			
			Scope1 obj2=new Scope1();
			obj2.isim="müslüm";
			obj2.soyisim="babaaa";
			
			System.out.println(obj2.isim+" "+obj2.soyisim); //müslüm baba
			System.out.println(obj1.isim+" "+obj1.soyisim); //
			
			System.out.println(obj2.izindeMi); // false döndürür
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
		System.out.println(sayi); // bu method static olmadýðý için instance variablelara direkt eriþebilir
		sayi=sayi+20; // ve bu method içeirsinde geçerli olmak üzere deðerini deðiþtirebilir 
	}
}
