package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		/*
		 * Array(Dizi): javada birden fazla variable store etmek i�in kullan�lan objelerdir
		 * Array olu�turulurken 2 �eyi declare etmeliyiz 
		 * 	1- data type : bir array i�inde sadece ayn� data tipinden elemanlar olabilir 
		 *  2- uzunluk : uzunluk array in i�ersine konulacak maks eleman say�s�n� belirtir ve bundan fazlas�n� koyarsan RTE verir
		 */
		
		int arr [] = {10, 23, 54};// length 3 
		
		String isimler[]= new String [4] ; // lenth= 4 olan bo� bir array olu�turur 
		
		//arrayde primitive datalar veya non primitive datalar�n referanslar� store(depolan�r) edilir
		//mesela isimler arrayinin i�inde isim de�erleri de�il isimlerin referanslar� olur �NEML�.
		
		// arrayin elemanlar�n� ula�ma ve update etme 
		
		System.out.println(isimler[1]);
		
		isimler[2]="Boss" ;
		isimler[0]="elveda";
		
		//arrayin t�m elemanlar�n� yazd�rma 
		System.out.println(isimler); // referans� yazd�r�r
		System.out.println(Arrays.toString(isimler));
		
		// method kullanmadan t�m elemanlar� yazd�ral�m 
		//loop kullanmam�z laz�m 
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i] + " ");
		}
		System.out.println("");
		
		System.out.println(arr); // arrayin i�indeki elemanlar� de�il de arrayi yazd�rd��� i�in referans yazar 
		System.out.println(Arrays.toString(arr));
		
		//array in elemanlar�n� nas�l s�ralayabiliriz 
		
		isimler[1]="o�uzhan";
		isimler[3]= "samet ";
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		
		
		
	}

}
