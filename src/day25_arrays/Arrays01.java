package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		/*
		 * Array(Dizi): javada birden fazla variable store etmek için kullanýlan objelerdir
		 * Array oluþturulurken 2 þeyi declare etmeliyiz 
		 * 	1- data type : bir array içinde sadece ayný data tipinden elemanlar olabilir 
		 *  2- uzunluk : uzunluk array in içersine konulacak maks eleman sayýsýný belirtir ve bundan fazlasýný koyarsan RTE verir
		 */
		
		int arr [] = {10, 23, 54};// length 3 
		
		String isimler[]= new String [4] ; // lenth= 4 olan boþ bir array oluþturur 
		
		//arrayde primitive datalar veya non primitive datalarýn referanslarý store(depolanýr) edilir
		//mesela isimler arrayinin içinde isim deðerleri deðil isimlerin referanslarý olur ÖNEMLÝ.
		
		// arrayin elemanlarýný ulaþma ve update etme 
		
		System.out.println(isimler[1]);
		
		isimler[2]="Boss" ;
		isimler[0]="elveda";
		
		//arrayin tüm elemanlarýný yazdýrma 
		System.out.println(isimler); // referansý yazdýrýr
		System.out.println(Arrays.toString(isimler));
		
		// method kullanmadan tüm elemanlarý yazdýralým 
		//loop kullanmamýz lazým 
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i] + " ");
		}
		System.out.println("");
		
		System.out.println(arr); // arrayin içindeki elemanlarý deðil de arrayi yazdýrdýðý için referans yazar 
		System.out.println(Arrays.toString(arr));
		
		//array in elemanlarýný nasýl sýralayabiliriz 
		
		isimler[1]="oðuzhan";
		isimler[3]= "samet ";
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		
		
		
	}

}
