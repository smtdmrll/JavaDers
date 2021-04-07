package day12_stringmanupltion;

import java.util.Scanner;

public class C3_LengthMethod {

	public static void main(String[] args) {
		/*
		 * lengt methodu karakter say�s�n� verir
		 * kulan�c�dan bir str�ng girmesini isteyin 
		 * girilen stringn son harfini b�y�k harf olarak yazd�r
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("bir c�mle yaz�n");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdi�iniz c�mlenin son harfi "+ str.charAt(str.length()-1));
		
		//length methodu girilen 	stringi uzunlu�u verir 
		
		int sonHarf= str.length();
		
		int sonHarfIki = sonHarf-1;
		
		System.out.println("girdi�iniz c�mlenin son harfi "+ str.charAt(sonHarfIki));
		System.out.println(str);//kullan�c� ne girdiyse b�y�k harfle g�sterir
		
		String str2=""; //bo�luk yok  
		System.out.println(str2.length()); // 0 sonucunu al�rs�n d
		
//		String str3=null; 	// reserve keyword olarak ge�er 
		
							/*
		 					null hi� demektir 
							normalde stringler "" i�ine yaz�l�r ama null i�in buna gerek yoktur 
							null case sensitive dir dola�s�yla NULL veya Null yaz�lmaz
							null bir de�er de�ldir sadece hi�li�i g�sterir
							null, str3 �n hi�bir adresi yoktur der
							
							**null de�er atanan string ile string manipulation methodlar� kullan�lamaz**
							
							*/
		
		
		
		// System.out.println(str3.length());  // bu hi�e e�it oldu�u i�in hata verir RTE VER�R
		
		//System.out.println(str3.equals(str2));
		
		System.out.println(str.charAt(1)); // indeksi 1 olan yani ikinci karakteri verir
		
//		System.out.println(str3.charAt(1)); // rte error verir null da methodlar kullan�lamaz
scan.close();
	}

}
