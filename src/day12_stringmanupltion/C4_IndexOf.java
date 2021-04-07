package day12_stringmanupltion;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		/*
		 * indexOf() methodu bize istedi�imiz karakter(lerin) indexini d�nd�r�r
		 */

		
		String str="Java ogren, i� sahibi ol";
		
		System.out.println(str.charAt(6)); //g 
		
		System.out.println("char arama: "+str.indexOf(+'g')); //6
		
		System.out.println("string arama "+str.indexOf("g"));//6
		
		System.out.println("string kelime arama "+ str.indexOf("i�")); //i-->12 �---->13  
		
		System.out.println("birden fazla varsa arama "+str.indexOf('i')); // ilk buldu�unun indeksini getirir 
				
		System.out.println("ba�lang�� indexi ile "+str.indexOf('a', 4));	//ba�lang�� indeksi (inclusive) dahil. 
																			//yani a harfini 4. indeksten itibaren ara dedik babo� 
		
		System.out.println("olmayan harf "+str.indexOf("dert")); //-1 verir �yle bir kelime yok 
		
		//kullan�c�dankelime al java i�erir mi arat
		
		Scanner scan =new Scanner (System.in);
		System.out.println("bir kelime gir");
		
		String a=scan.nextLine().toLowerCase();
		
		int b=a.indexOf("java"); //e�er java varsa ilk java kelimesinin indeksini d�nd�r�r.  Yoksa -1 d�nd�r�r. sabittir e�er yoksa sonu� hep -1 olur 
		
		
		System.out.println(a.indexOf("java"));
		
		System.out.println(a.indexOf("java")>-1 ? "java i�erir" :"java i�ermez");
		
		System.out.println(b>-1 ? "java i�erir" :"java i�ermez");
		
		
scan.close();		
	}

}
