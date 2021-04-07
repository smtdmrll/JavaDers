package day33_Encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {
	public static void main(String[] args) {
		
		/*
		 OOP concept
		 Objectk Oriented Programing
		 
		 Bir proje kapsam�ndaki classlarda olu�turulan variable ve methodlar�n 
	baika classlarda tekrar tekrar yaz�lmamas� var oldu�u classtan obje �retilerek 
	bu variable ve methodlar�n istendi�i kadar kullan�lmas�d�r� (reusability) Write once reuse anywhere
		
		Scope6 class�ndaki variable ve metodlaraula�mak istiyorum 
		Bunun i�in scope6 class�ndan obje �retmeliyiz 
			
 
		 */
		
		Scope6 obj1= new Scope6();
		//e�itli�in sol taraf� decleration
		//decleration 2 parttan olu�ur ilk part data t�r�, ikinci part isim 
		//non-primitiveler i�in datat t�r� ayn� zamanda class ismi olabilir 
		
		// e�itli�in sa��nda ise de�er, 2 parttan olu�ur
		// ilk part new keyword ikincisi constructor
		//hangi classtan obje �retmek istersek o class�n constructorunu kullan�r�z 
		
		obj1.num1=10;
		System.out.println(obj1.num1); //10 	
		
		obj1.add();
		
		//deneme metodunu main metod i�inden �a��rabilir miyim 
//		deneme(); bu metod static olmad��� i�in main metoddan �a��r�lamaz 
		//bunun yerine i�inde oldu�umuz classtan bir obje �retip onun �zeridnen 
		//static olmayan metod lar da �a��rabiliriz
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
	}
	
	public void deneme() {
		/*
		 Projemiz kapsam�nda bulunan t�m classlardan 
		 public variable ve methodlara istedi�in yerden obje �reterek ula�abilirim 
		 e�er ula�mak istedi�im class �yeleri(class member) public de�ilse 
		 ba�ka packagelerden ula�mak i�in ekstra i�lem yapmam�z gerekir  
		 
		 */
		Scope1 obj2 = new Scope1();
		obj2.isim="ahmet";
		obj2.soyisim="ozcelik";
		obj2.sayi=3841;
		obj2.method();
		
		//ben istedi�im classtan obje �retip oradakipublic class �yelerine ula�abilirim 
	}













}
