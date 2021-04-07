package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		/*
		 * 		Bir class içerisinde oluþturulan variable larýn nerede geçerli olduðu 
		 * ve nereden kullanýlabildiðini o variable ýn scope u belirler 
		 * 
		 * GOOGLE YAP JAVADA SCOPE NEDÝR ARAÞTIR ??????
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
