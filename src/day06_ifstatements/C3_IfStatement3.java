package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullan�c�dan g�n isminin harfini isteyin 
		//harfe uygun olan g�n isimlerini yazd�r�n 
		//c---- cuma, cumartesi 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen g�n isminin ilk harfini gir ");
		
		char ilkHarf =scan.next().toUpperCase().charAt(0);
		// ilk harf istedi�im i�in char daha sonras�nda k���k de girse b�y�k de girse b�y�k almak i�in 
		//toUppercase methodu daha sonras�nda girdinin tek harfini almak i�in charat
		
		//bu sat�r itibari ile girilen stringin ilk karakterini alm�� oldum 
		
		//p, s, c 
		 
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar pazartesi veya per�e�be");
			
		}
		if (ilkHarf=='s'|| ilkHarf=='S') {
			System.out.println("sal�");
		}
		if (ilkHarf=='c'|| ilkHarf=='C') {
			
			System.out.println("�ar�amba cuma ya da cumartesi ");
			
		}
		if (ilkHarf!='p' && ilkHarf!='P'&&ilkHarf!= 's'&&ilkHarf != 'S'&& ilkHarf!='c'&& ilkHarf!='C') {
			System.out.println("yanl�� girdin salak" );
		}
		/*
		 * b�y�k harfleri de kontrol etmemizin sebebi e�er cahil olup da toUpperCase koymazsan nolur 
		 * onu g�steriyor 
		 */
		scan.close();
	}

}
