package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		/*
		 * static variable lar i�in object olu�turma ihtiyac� yoktur 
		 * 
		 * 	ba�ka bir class dan static variable lara ula�mak istedi�imizde
		 * ula�mak istedi�imiz class�n ad�.static variable ad� yazmam�z yeterlidir
		 */
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // java run time programd�r 
										  //Scope2 clas � �al��t�r�ld���nda komple scope1 �al��maaazzzzzz
										 //dolay�s�yla en ba�ta olu�turulan veya ba�ta atanan de�erler ge�erli olur 
		
		Scope1.okulAdi= "samet koleji";
		System.out.println(Scope1.okulAdi); // samet koleji 
		
		Scope1.staticMethod();
		
		System.out.println(Scope1.okulId); //1203	
		System.out.println(Scope1.okulAdi); // samet koleji 

	}

}
