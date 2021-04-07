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
	
	System.out.println(str1==str2);// yaz�lar ayn� ama adresler farkl� FALSE verir
	
	// == Stringlerin hem de�erlerine hem de adreslerine bakar
	//bu �rnekte str1+"" yazd���m�zda concatenation yap�ld��� i�in java yeni bir obje olu�turur ve yeni objenin i�ine koyar
	// STR1 VE str2 yi kar��la�t�r�rsak de�erleri ayn� adresler farkl� odlu�u i�in false d�ner  
	
	
	System.out.println(str1.equals(str2) );// yaz�lar yani adresler ayn� TRUE verir adreslere bakmaz
	
	//equals metodu sadece Stringlerin de�erlerini kar��la�t�r�
	//bu �rnekte str1 ve str2 nin de�erleri ayn� oldu�u i�in true d�nd�r�r
	
	
	String str3="Ali Can";// String str3=str1; ile ayn� 
	System.out.println(str1==str3);
	System.out.println(str1.endsWith(str3));
	
	
	
	
	}
	

}
