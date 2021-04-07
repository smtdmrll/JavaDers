package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullanýcýdan gün isminin harfini isteyin 
		//harfe uygun olan gün isimlerini yazdýrýn 
		//c---- cuma, cumartesi 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen gün isminin ilk harfini gir ");
		
		char ilkHarf =scan.next().toUpperCase().charAt(0);
		// ilk harf istediðim için char daha sonrasýnda küçük de girse büyük de girse büyük almak için 
		//toUppercase methodu daha sonrasýnda girdinin tek harfini almak için charat
		
		//bu satýr itibari ile girilen stringin ilk karakterini almýþ oldum 
		
		//p, s, c 
		 
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar pazartesi veya perþeöbe");
			
		}
		if (ilkHarf=='s'|| ilkHarf=='S') {
			System.out.println("salý");
		}
		if (ilkHarf=='c'|| ilkHarf=='C') {
			
			System.out.println("çarþamba cuma ya da cumartesi ");
			
		}
		if (ilkHarf!='p' && ilkHarf!='P'&&ilkHarf!= 's'&&ilkHarf != 'S'&& ilkHarf!='c'&& ilkHarf!='C') {
			System.out.println("yanlýþ girdin salak" );
		}
		/*
		 * büyük harfleri de kontrol etmemizin sebebi eðer cahil olup da toUpperCase koymazsan nolur 
		 * onu gösteriyor 
		 */
		scan.close();
	}

}
