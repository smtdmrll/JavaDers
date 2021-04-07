package day14_methodcreation;

public class C2_MethodCreation {

	public static void main(String[] args) {
		/*
		 1) önemli nokta main methodda static olduðu için çaðýrdýðýmýz tüm methodlar
		  static olmak zorunda
		  
		 2) int return type p veya n-p hepsi olabilir eðer bir method bir þey
		  döndürmeyecekse örnek hesaplayý yazdýracaksa return type VOÝD seçilir
		  
		  
		  3)bir classda ayný isme sahip birden fazla method oluþturabiliriz fakat
		  parametreleri farklý yapmak zorundayýz
		 */
		
		/*
		 * public 
		 * acces modifier
		 * 
		 * static 
		 * þimdilik main methodun static olduðunu vediðer methodlarýn main methoddan kullanýlmasý için 
		 * static olmasý gwrektiðini bil yeter
		 * 
		 * void
		 * return type döndürdüðü method yok yani 
		 * 
		 * main
		 * isim
		 * 
		 * (String[] args) 
		 * bunun içindekilere parametre denir bu parametrenin data tip String ismi args
		 * 
		 * {
		 * bu da body 
		 */
		
		
		//bir methodu çalýþtýrmak için main methodun içinden çaðýrmamýz gerekir 
		//bir methodu çaðýrmak için ise method adýný ve parametrelere uygun argümentleri  yazmalyýz 
		
		ortalama(85.2, 90.3);  // method call denir
		// java adý ortalama olan iki tane prametre olan ve bu parametreleri double method arayacak ve bulacak 
		
	}// main method sonu

	
	//bir main method oluþturmak istediðimizde classýn içinde ama main methodun dýþýnda bir alanda oluþturmalýyýz
	//Genel kullaným methodlar main methoddan sonra olur
	
	
	public static void ortalama (double sayi1, double sayi2) {
		
		System.out.println("girdiðiniz iki sayýnýn ortalamasý "+ (sayi1+sayi2)/2);
		// bir methodu oluþturmak o methodu çalýþtýrmak için yeterli deðildir 
		// oluþturuan method main method içinden çaðýrýlýnca çalýþýr 
		
	}
	
	
	
	
	
	
	

}//class sonu 
