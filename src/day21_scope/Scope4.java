package day21_scope;

public class Scope4 {

	public static void main(String[] args) {

		int sayi = 10;

//		System.out.println(isim); // 1) bir method i�erisinde olu�turulan variable sadece o method i�erisinde kullan�labilir 
		
		int sayi2; // 2) local bir variable de�er atanmadan da olu�turulur (declaration)
		
//		System.out.println(sayi2); // 2) ancak ilk de�er atamas� yap�lmayan variable lar kullan�lamaz 
		
//		sayi2++; // 2) ilk de�er atanmad��� i�in art�rma ya da azaltma yapamay�z 
		
		// 2) java de�er atamas� olmadan local variable  olu�turulnas�na izin verir ilerde de�er atanacak diye bekler
		
		sayi2=15; //2) olu�turma ayr� de�er atama ayr� sat�rdda yap�labilir (assigment, initilazion)
	
		// 3) Birden fazla metho dun oldu�u klasslarda her methodda kullanmam�z gereken ortak variablelar varsa
	//class levelda variable olu�turmal�y�m 
	//ortak variable class�n yap�s�na ba�l� olarak instance veya static olabilir 

	}
	

	public static void staticMethod() {
		
		String isim="Hasan";
//		System.out.println(sayi); //1)  bu kurala main method i�erisinde olu�turulan variable lar da dahildir 
		
	}

	public void method() {
		
		boolean istTrue=true;
//		System.out.println(sayi); //1)  bu kurala static olan olmayan t�m methodlar i�in ge�erlidir 
	}
}
