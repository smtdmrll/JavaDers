package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		/*
		 * static variable lar için object oluþturma ihtiyacý yoktur 
		 * 
		 * 	baþka bir class dan static variable lara ulaþmak istediðimizde
		 * ulaþmak istediðimiz classýn adý.static variable adý yazmamýz yeterlidir
		 */
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // java run time programdýr 
										  //Scope2 clas ý çalýþtýrýldýðýnda komple scope1 çalýþmaaazzzzzz
										 //dolayýsýyla en baþta oluþturulan veya baþta atanan deðerler geçerli olur 
		
		Scope1.okulAdi= "samet koleji";
		System.out.println(Scope1.okulAdi); // samet koleji 
		
		Scope1.staticMethod();
		
		System.out.println(Scope1.okulId); //1203	
		System.out.println(Scope1.okulAdi); // samet koleji 

	}

}
