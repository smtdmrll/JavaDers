package day21_scope;

public class Scope4 {

	public static void main(String[] args) {

		int sayi = 10;

//		System.out.println(isim); // 1) bir method içerisinde oluþturulan variable sadece o method içerisinde kullanýlabilir 
		
		int sayi2; // 2) local bir variable deðer atanmadan da oluþturulur (declaration)
		
//		System.out.println(sayi2); // 2) ancak ilk deðer atamasý yapýlmayan variable lar kullanýlamaz 
		
//		sayi2++; // 2) ilk deðer atanmadýðý için artýrma ya da azaltma yapamayýz 
		
		// 2) java deðer atamasý olmadan local variable  oluþturulnasýna izin verir ilerde deðer atanacak diye bekler
		
		sayi2=15; //2) oluþturma ayrý deðer atama ayrý satýrdda yapýlabilir (assigment, initilazion)
	
		// 3) Birden fazla metho dun olduðu klasslarda her methodda kullanmamýz gereken ortak variablelar varsa
	//class levelda variable oluþturmalýyým 
	//ortak variable classýn yapýsýna baðlý olarak instance veya static olabilir 

	}
	

	public static void staticMethod() {
		
		String isim="Hasan";
//		System.out.println(sayi); //1)  bu kurala main method içerisinde oluþturulan variable lar da dahildir 
		
	}

	public void method() {
		
		boolean istTrue=true;
//		System.out.println(sayi); //1)  bu kurala static olan olmayan tüm methodlar için geçerlidir 
	}
}
