package day33_Encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {
	public static void main(String[] args) {
		
		/*
		 OOP concept
		 Objectk Oriented Programing
		 
		 Bir proje kapsamýndaki classlarda oluþturulan variable ve methodlarýn 
	baika classlarda tekrar tekrar yazýlmamasý var olduðu classtan obje üretilerek 
	bu variable ve methodlarýn istendiði kadar kullanýlmasýdýrý (reusability) Write once reuse anywhere
		
		Scope6 classýndaki variable ve metodlaraulaþmak istiyorum 
		Bunun için scope6 classýndan obje üretmeliyiz 
			
 
		 */
		
		Scope6 obj1= new Scope6();
		//eþitliðin sol tarafý decleration
		//decleration 2 parttan oluþur ilk part data türü, ikinci part isim 
		//non-primitiveler için datat türü ayný zamanda class ismi olabilir 
		
		// eþitliðin saðýnda ise deðer, 2 parttan oluþur
		// ilk part new keyword ikincisi constructor
		//hangi classtan obje üretmek istersek o classýn constructorunu kullanýrýz 
		
		obj1.num1=10;
		System.out.println(obj1.num1); //10 	
		
		obj1.add();
		
		//deneme metodunu main metod içinden çaðýrabilir miyim 
//		deneme(); bu metod static olmadýðý için main metoddan çaðýrýlamaz 
		//bunun yerine içinde olduðumuz classtan bir obje üretip onun üzeridnen 
		//static olmayan metod lar da çaðýrabiliriz
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
	}
	
	public void deneme() {
		/*
		 Projemiz kapsamýnda bulunan tüm classlardan 
		 public variable ve methodlara istediðin yerden obje üreterek ulaþabilirim 
		 eðer ulaþmak istediðim class üyeleri(class member) public deðilse 
		 baþka packagelerden ulaþmak için ekstra iþlem yapmamýz gerekir  
		 
		 */
		Scope1 obj2 = new Scope1();
		obj2.isim="ahmet";
		obj2.soyisim="ozcelik";
		obj2.sayi=3841;
		obj2.method();
		
		//ben istediðim classtan obje üretip oradakipublic class üyelerine ulaþabilirim 
	}













}
