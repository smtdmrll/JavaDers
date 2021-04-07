package day29_passbyvalueimmutable;

public class C5_Immutable2 {

	public static void main(String[] args) {
		// deðiþikliði kalýcý yapmak için atama yaparsak 
		//immutable classlar nasýl davranýr
		String isim= "ali";
		
		isim=isim+"";
		
		System.out.println(isim.equals("ali")); //true
		System.out.println(isim=="ali");//false
		
		System.out.println();
		
		String str1 = new String("mehmet");
		String str2= new String("mehmet");
		
		System.out.println(str1==str2); 
		System.out.println(str1.equals(str2));
		
		System.out.println();
		
		String str3="mehmet";
		String str4="mehmet";

		System.out.println(str3==str4); 
		System.out.println(str3.equals(str4));
		
		System.out.println();
		
		System.out.println(str3==str1); 
		System.out.println(str3.equals(str1));
		
		
		
		
		
		
		
		
		
		
	}

}
