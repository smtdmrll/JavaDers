package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/*
		 * 1- i� i�e array olu�turdu�umuzda d��ardaki array a outer array
		 * i�erdeki arraylere ise inner array denir
		 * 		
		 * 2- e�er i�erdeki arraylerin boyutlar� birbirinden farkl�ysa 
		 * arrayi ancak t�m elemanlar� yazarak declare edebilirz 
		 * 
		 * 3-MultiDimensionalArray de bir eleman�n indeksi i�in en d��daki array hari�,
		 * elemana kadar i� i�e t�m array�erin indexlerini yazmak gerekir 
		 */
		
		int arr[][]= {{1,3,5}, {3,5}, {5,9,11,3}}; //iki katl� bir arraydir( ilk elemana ula�mak i�in ka� array gerekiyorsa o kadar katl�)
		
		//11 i index ile ifade etmek istersek arr[2][2] d��tan i�e do�ru gidilir en d��takinin indeksi al�nmaz sonra inner�n indeksi inner diyerek gider
		
		//e�er array i uzunlukla declare etmek istersek inner array uzunluklar� e�it olmal�
		
		int arr2[][]= new int [3][2];
		
		//[3] ilk yaz�lan say� outer arrayin i�inde ka� tane inner array oldu�unu belirtir 
		//[2] her bir inner array in uzunlu�u  
		
		System.out.println(Arrays.toString(arr2));
		
		//MultiDimensionalArray leri yazd�rmak i�in tostring methodu KULLANILAMAZ
		//��NK� to string methodu outer arrayi stringe �evirir
		//outer arraylerin i�inde inner arrayler oldu�undan tostring methodunda inner arraylerin referans de�erlerini yazd�r�r
		System.out.println(Arrays.deepToString(arr2));
		
		
		
		
		
		
		
	}
		

	}


