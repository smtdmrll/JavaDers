package day03_scannerIncrementDecrement;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		//kullan�c�dan ismini isteyip ilk harfini B�y�k Harf olarak yazd�r�n 
		// ba� harfiniz "" olarak yazd�r�n  
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("ad�n� gir : ");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);	//al�nan harfi b�y�k g�stermek istiyorsan uppercase k���k almak istiyorsak lowercase
	
				//Stringde harfler indeks olarak 0 dan ba�lar 
		// biz ilk harf istedi�imiz i�in charArt ���NE SIf�r yazd�k ikinci harf isteseydik 1 �� isteseydik 2
		
		System.out.println("ba� harfin: "+ ilkHarf);
		
		//e�er charArt(0) yazd�ktansonra . koyarsak methodlar gelmez
		//��nk� charart metodu kullan�nca variable � char yapm�� olduk 
		// primitive data tipleri methodlara sahip de�ildir.
		
		
		scan.close();
		
		
		
		
	}

}
