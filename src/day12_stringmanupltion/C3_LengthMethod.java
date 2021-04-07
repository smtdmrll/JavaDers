package day12_stringmanupltion;

import java.util.Scanner;

public class C3_LengthMethod {

	public static void main(String[] args) {
		/*
		 * lengt methodu karakter sayýsýný verir
		 * kulanýcýdan bir strþng girmesini isteyin 
		 * girilen stringn son harfini büyük harf olarak yazdýr
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("bir cümle yazýn");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdiðiniz cðmlenin son harfi "+ str.charAt(str.length()-1));
		
		//length methodu girilen 	stringi uzunluðu verir 
		
		int sonHarf= str.length();
		
		int sonHarfIki = sonHarf-1;
		
		System.out.println("girdiðiniz cðmlenin son harfi "+ str.charAt(sonHarfIki));
		System.out.println(str);//kullanýcý ne girdiyse büyük harfle gösterir
		
		String str2=""; //boþluk yok  
		System.out.println(str2.length()); // 0 sonucunu alýrsýn d
		
//		String str3=null; 	// reserve keyword olarak geçer 
		
							/*
		 					null hiç demektir 
							normalde stringler "" içine yazýlýr ama null için buna gerek yoktur 
							null case sensitive dir dolaýsýyla NULL veya Null yazýlmaz
							null bir deðer deðldir sadece hiçliði gösterir
							null, str3 ün hiçbir adresi yoktur der
							
							**null deðer atanan string ile string manipulation methodlarý kullanýlamaz**
							
							*/
		
		
		
		// System.out.println(str3.length());  // bu hiçe eþit olduðu için hata verir RTE VERÝR
		
		//System.out.println(str3.equals(str2));
		
		System.out.println(str.charAt(1)); // indeksi 1 olan yani ikinci karakteri verir
		
//		System.out.println(str3.charAt(1)); // rte error verir null da methodlar kullanýlamaz
scan.close();
	}

}
