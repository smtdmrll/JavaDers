package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		/*
		 * 		Bir class i�erisinde olu�turulan variable lar�n nerede ge�erli oldu�u 
		 * ve nereden kullan�labildi�ini o variable �n scope u belirler 
		 * 
		 * GOOGLE YAP JAVADA SCOPE NED�R ARA�TIR ??????
		 * 
		 */

		
		int sayi=10;
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);				
//		System.out.println(isim);
	}

	public static void denemeMethod() {
		String isim= "mehmet";
		
		System.out.println(isim);
		
	}

}
