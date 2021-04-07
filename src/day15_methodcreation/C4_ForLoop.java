package day15_methodcreation;

import java.util.Iterator;

public class C4_ForLoop {

	public static void main(String[] args) {
		/*
		 * 5 defa hello world yazdýralým
		 

		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		*/
		
		// bunun yerine loop kullanýyoruz 
		// ne yapacaðýmýzý javaya söylüyoruz kaç kere yapmasý gerektiðini de söylüyoruz 
	
		
		// tüm looplarda üç þeyi yazmak zorundayýz 
		//1) BAÞLANGIÇ DEÐERÝ 
		//2) BÝTÝÞ DEÐERÝ 
		//3) ARTIÞ DEÐERÝ
		
		for(int i=100 ; i>300 ; i-=5) { // i sadece isim genel kullaným i'dir
			
			System.out.println(i+ " hello world");
			
		}
		System.out.println("kod çalýþýr ");
		//not eðer þart kýsmý bizim artýþýmýza göre hep true verirse loop sonsuz döngüye girer
		//not loop da artýþ deðeri pozitif olduðu gibi negatif de olabilir  
		//not artýþ deðeri bir olmak zorunda deðil farklý olabilir misal +=5 -=3 gibi gibi 
		//not loop þartý hiç true olmazsa loop body hiç devreye girmez 
	}

}
