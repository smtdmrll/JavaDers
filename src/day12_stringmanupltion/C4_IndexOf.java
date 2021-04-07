package day12_stringmanupltion;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		/*
		 * indexOf() methodu bize istediðimiz karakter(lerin) indexini döndürür
		 */

		
		String str="Java ogren, iþ sahibi ol";
		
		System.out.println(str.charAt(6)); //g 
		
		System.out.println("char arama: "+str.indexOf(+'g')); //6
		
		System.out.println("string arama "+str.indexOf("g"));//6
		
		System.out.println("string kelime arama "+ str.indexOf("iþ")); //i-->12 þ---->13  
		
		System.out.println("birden fazla varsa arama "+str.indexOf('i')); // ilk bulduðunun indeksini getirir 
				
		System.out.println("baþlangýç indexi ile "+str.indexOf('a', 4));	//baþlangýç indeksi (inclusive) dahil. 
																			//yani a harfini 4. indeksten itibaren ara dedik baboþ 
		
		System.out.println("olmayan harf "+str.indexOf("dert")); //-1 verir öyle bir kelime yok 
		
		//kullanýcýdankelime al java içerir mi arat
		
		Scanner scan =new Scanner (System.in);
		System.out.println("bir kelime gir");
		
		String a=scan.nextLine().toLowerCase();
		
		int b=a.indexOf("java"); //eðer java varsa ilk java kelimesinin indeksini döndürür.  Yoksa -1 döndürür. sabittir eðer yoksa sonuç hep -1 olur 
		
		
		System.out.println(a.indexOf("java"));
		
		System.out.println(a.indexOf("java")>-1 ? "java içerir" :"java içermez");
		
		System.out.println(b>-1 ? "java içerir" :"java içermez");
		
		
scan.close();		
	}

}
