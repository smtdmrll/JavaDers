package day21_scope;

public class Scope1 {

	static int okulId= 1687;
	static String okulAdi = "Mealis";
	static boolean acikMi ;
	
 /*
  * static variable lar class level da oluşturulduğu için classın her yerinden kullanılabilirler,
  * 
  * 	instance variabler lar static olmayan methodlarda direkt kullanılabiliyorken static methodlarda
  * obje oluşturularak kullabılabiliyordu 
  * 
  * static variable lar ise ister static isterse static olmayan tüm methodlardan direktt kullanılabilir 
  */
	
	
	public static void main(String[] args) {
		
		System.out.println(okulId+ " "+ okulAdi+ " "+ acikMi); //1687 mealis false 
		
		okulId= 1202;
		acikMi= true;
		
		staticMethod();
//		method(); // main static ama bu değil o yüzden çağıramam
		
		System.out.println(okulId+ " "+ okulAdi+ " "+ acikMi); //1203 Mealis true
	}

	public static void staticMethod() {
		
		System.out.println(okulId+ " "+ okulAdi+ " "+ acikMi); //1202 mealis true 
	
		okulId=1203;
		
		
	}
	
	public void method() {
		
		okulId=1205; // bu class çalıştırıldığında bu method çalışmaz 
		
	}
	
	
}
