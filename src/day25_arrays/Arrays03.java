package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir stringi array a nas�l �eviririz 
		//verilen bir c�mlede ka� kelime oldu�unu bulunuz 
		//verilen bir c�mlede her kelimenin ilk harfini b�y�k yap�n�z 
		
		String str = "Herkes javay� tan�sa severdi";
		//stringi kelimelere ay�ral�m 
		// split methodu 
		
		String arr [] = str.split(" ");  //par�alamak istedi�imiz karakteri gir onu yok eder ondan �ncesi her kelimeyi bir eleman olarak al�r 
		
		System.out.println(Arrays.toString(arr));
		
		String arr2[] = str.split("java");
		System.out.println(Arrays.toString(arr2));
				
		String arr3[]= str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]= str.split("");
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
		
		
	}

}
