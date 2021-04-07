package day12_stringmanupltion;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		/*
		 * == hem stringe hem de adrese bakar 
		 * equals sadece stringlere bakar
		 * 
		 */
		
	String str1= "Ali Can";
	String str2= str1+ ""; // Ali Can
	
	System.out.println(str1==str2);// yazýlar ayný ama adresler farklý FALSE verir
	
	// == Stringlerin hem deðerlerine hem de adreslerine bakar
	//bu örnekte str1+"" yazdýðýmýzda concatenation yapýldýðý için java yeni bir obje oluþturur ve yeni objenin içine koyar
	// STR1 VE str2 yi karþýlaþtýrýrsak deðerleri ayný adresler farklý odluðu için false döner  
	
	
	System.out.println(str1.equals(str2) );// yazýlar yani adresler ayný TRUE verir adreslere bakmaz
	
	//equals metodu sadece Stringlerin deðerlerini karþýlaþtýrý
	//bu örnekte str1 ve str2 nin deðerleri ayný olduðu için true döndürür
	
	
	String str3="Ali Can";// String str3=str1; ile ayný 
	System.out.println(str1==str3);
	System.out.println(str1.endsWith(str3));
	
	
	
	
	}
	

}
